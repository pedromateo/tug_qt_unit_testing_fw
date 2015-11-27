<?xml version="1.0" encoding="UTF-8"?>
<!-- <xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
 xmlns:fn="http://www.w3.org/2005/xpath-functions"> -->
<xsl:stylesheet version="2.0"
    xmlns:my="my-functions"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:fo="http://www.w3.org/1999/XSL/Format"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:fn="http://www.w3.org/2005/xpath-functions"
    xmlns:xdt="http://www.w3.org/2005/xpath-datatypes">


<!-- key used for selecting gprofitems while generating a testsuite section-->
<xsl:key name="gprofq" match="gprofitem" use="@bin"/>

<!--               -->
<!-- main template -->
<!--               -->

<xsl:template match="/">

  <html>

<!-- ======================================================================= -->
<!-- ===== Preamble -->
<!-- ======================================================================= -->

  <head>
     <script>
        function ExpandCollapse(theDiv){
           el = document.getElementById(theDiv);
           if(el.style.display == 'none'){
              el.style.display = '';
           }
           else{
              el.style.display = 'none';
           }
           return false;
        }
     </script>
  </head>

  <style>
     body {margin-top: 20px; margin-bottom: 20px; margin-right: 30px; margin-left: 30px;}
     p {margin: auto; padding: 10px;}
     h1, h2, h3 {padding-left: 3px;}
     h1, h2 {padding-top: 20px;}
     table, td, th {border: 0px solid black; }
     table {margin-left:15px; margin-right:15px; margin-top:15px; margin-bottom:10px; padding: 5px;}
     table {border-collapse: separate; border-spacing: 0; border-radius: 5px; -moz-border-radius: 5px; }
     td,th {border: 1px solid black; border-radius: 5px; -moz-border-radius: 5px; padding:5px;}
     th {text-align:left; background-color:#C0C0C0; padding-left: 10px; padding-right: 10px; padding-top: 8px;}
     a {text-decoration: none}
     div.shadow {background-color: #f2f2f2;}
     div.console {border: none; width:90%; background-color:black; color:white; padding: 10px; margin-left: 20px;}
     div {padding-left: 10px; padding-right: 10px; padding-bottom: 10px;}

  </style>

  <body>



<h1><span style="background-color: #d8d8d8"><xsl:value-of select="trial/@name"/></span> <br/>
   <i>Execution summary</i></h1>
<hr/>

<!-- ======================================================================= -->
<!-- ===== Test execution summary -->
<!-- ======================================================================= -->

<div class="shadow">

<h2>List of testsuites executed:</h2>
<ol>
<xsl:for-each select="trial/testsuite">
   <li>
      <a>
         <xsl:attribute name="href">#<xsl:value-of select="@name"/></xsl:attribute>
         <xsl:value-of select="@name"/>
      </a>
   </li>
</xsl:for-each>
</ol>

<ul style="list-style-type: none">
  <li><a href="#coverage_section">Go to coverage summary</a></li>
</ul>

<!-- <p align="right"> <small style="color:gray;"><i>(20015-08-16 22:33.44)</i></small> </p> -->
<p align="right"> <small style="color:gray;"><i>(<xsl:value-of  select="current-date()"/> :: <xsl:value-of  select="current-time()"/>)</i></small> </p>

</div>

<!-- ======================================================================= -->
<!-- ===== Testsuites -->
<!-- ======================================================================= -->



<xsl:for-each select="trial/testsuite">
      <!-- <xsl:variable name="ts_index" select="position()"/>
      <xsl:variable name="ts_id" select="generate-id()"/> -->
      <xsl:variable name="ts_name" select="@name"/>

      <!-- Param ts_index: <xsl:value-of select="$ts_index"/>
      Param ts_id: <xsl:value-of select="$ts_id"/>
      Param ts_name: <xsl:value-of select="$ts_name"/> -->

  <div><xsl:attribute name="id"><xsl:value-of select="@name"/></xsl:attribute></div>
  <h2>Results on Testsuite: <xsl:value-of select="@name"/></h2>
  <p>
  <xsl:value-of select="@description"/><br/><br/>
  <b>Total tests: </b> <xsl:value-of select="@tests"/><br/>
  <b>Failures: </b> <xsl:value-of select="@failures"/><br/>
  </p>


<table>
   <tr>
     <th>Test name</th>
     <th>Result</th>
   </tr>

   <xsl:for-each select="testcase">

       <tr>
          <td><xsl:value-of select="@name"/></td>
          <xsl:choose>
             <!-- Testcase failed -->
             <xsl:when test="@result != 'pass'">

                <!-- <xsl:variable name="tc_index" select="position()"/>
                <xsl:variable name="tc_id" select="generate-id(.)"/> -->

                <td style="background-color:#FF6666;text-align:center;">
                   <p style="cursor:pointer">
                      <xsl:attribute name="onClick">
                         <!-- ExpandCollapse('<xsl:value-of select="//@name"/>__<xsl:value-of select="@name"/>__<xsl:value-of select="$i"/>');-->
                         <!-- ExpandCollapse('<xsl:value-of select="$tc_id"/>'); -->
                         ExpandCollapse('<xsl:value-of select="generate-id(.)"/>');
                      </xsl:attribute>
                      <b><xsl:value-of select="@result"/></b>
                   </p>
                   <div style="display:none">
                      <!-- <xsl:attribute name="id">
                         <xsl:value-of select="//@name"/>__<xsl:value-of select="@name"/>__<xsl:value-of select="$i"/>
                      </xsl:attribute>-->
                      <!-- <xsl:attribute name="id"><xsl:value-of select="$tc_id"/></xsl:attribute> -->
                      <xsl:attribute name="id"><xsl:value-of select="generate-id(.)"/></xsl:attribute>
                      Message: <xsl:value-of select="failure/@message"/>
                   </div>
                </td>
             </xsl:when>
             <!-- Testcase passed -->
             <xsl:otherwise>
                <td style="background-color:#99FF99;text-align:center;"><b><xsl:value-of select="@result"/></b></td>
             </xsl:otherwise>
          </xsl:choose>
       </tr>
   </xsl:for-each>
</table>

<!-- system err output -->

<p style="cursor:pointer;" >
   <xsl:attribute name="onClick">
      <!-- ExpandCollapse('system-err__<xsl:value-of select="@name"/>'); -->
      <!-- ExpandCollapse('system-err__<xsl:value-of select="$ts_id"/>'); -->
      ExpandCollapse('system-err__<xsl:value-of select="generate-id(.)"/>');
   </xsl:attribute>
   <small style="color:gray;"><i>Click to expand/collapse <b>system-err</b> output.</i></small>
</p>



<div class="console" style="display: none">
   <xsl:attribute name="id">system-err__<xsl:value-of select="generate-id(.)"/></xsl:attribute>
   <pre>Test log output for <xsl:value-of select="$ts_name"/></pre>
   <pre>------------------------------------------------------</pre>
   <pre><xsl:value-of select="system-err"/></pre>
</div>

<!-- profiling output -->

<p style="cursor:pointer;" >
   <xsl:attribute name="onClick">
      <!-- ExpandCollapse('profiling__<xsl:value-of select="$ts_id"/>'); -->
      ExpandCollapse('profiling__<xsl:value-of select="generate-id(.)"/>');
   </xsl:attribute>
   <small style="color:gray;"><i>Click to expand/collapse <b>profiling</b> information.</i></small>
</p>

<div class="console" style="display: none">
   <!-- <xsl:attribute name="id">profiling__<xsl:value-of select="$ts_id"/></xsl:attribute> -->
   <xsl:attribute name="id">profiling__<xsl:value-of select="generate-id(.)"/></xsl:attribute>

      <pre>Profiling info for <xsl:value-of select="$ts_name"/></pre>
      <pre>------------------------------------------------------</pre>

<!-- In the following we try to fix these errors:                            -->
<!--   - in plain XML, using 'current()/$ts_name' is not supported           -->
<!--   - in HTML generation, '$ts_name' is empty when doing select           -->
<!-- So, the first option is executed when generating the HTML transformation,
  while the second option is executed while interpreting a XML file within a
  web browser-->

      <xsl:variable name="gprofnodevar"><xsl:value-of select="/trial/gprof/gprofitem[@bin=$ts_name]" /></xsl:variable>
      <xsl:choose>
         <xsl:when test="$gprofnodevar = ''">
            <!-- <xsl:for-each select="/trial/gprof/gprofitem[@bin=current()/$ts_name]">
               <pre><xsl:value-of select="."/></pre>
            </xsl:for-each> -->
            <xsl:variable name="gprofnodevarfix"><xsl:value-of select="/trial/gprof/gprofitem[@bin=current()/$ts_name]" /></xsl:variable>
            <pre><xsl:value-of select="$gprofnodevarfix"/></pre>
         </xsl:when>
         <xsl:otherwise>
            <pre><xsl:value-of select="$gprofnodevar"/></pre>
         </xsl:otherwise>
     </xsl:choose>

</div>

<br/>

</xsl:for-each>

<!-- ======================================================================= -->
<!-- ===== Coverage -->
<!-- ======================================================================= -->

<div id="coverage_section"  class="shadow">


<h2>Code coverage and profiling summary</h2>

<table style="width:auto;">

   <!-- Coverage on files -->
   <xsl:if test="trial/gcov/@items > 0">
       <tr>
          <th>Coverage on files (<xsl:value-of select="trial/gcov/@items"/> files)</th>
          <td/>
       </tr>

       <xsl:for-each select="trial/gcov/gcovitem">

       <tr>
          <td><xsl:value-of select="@file"/></td>
          <td style="text-align:left; background-color:#2e2e2e; color:white;">
          <pre>
          <xsl:call-template name="LFsToBRs">
             <xsl:with-param name="input" select="." />
          </xsl:call-template>
          </pre>
          </td>
       </tr>

       </xsl:for-each>
   </xsl:if>

   <!-- Coverage on dirs -->

   <xsl:if test="trial/lcov/@items > 0">
       <tr>
          <th>Coverage on directories (<xsl:value-of select="trial/lcov/@items"/> dirs)</th>
          <td/>
       </tr>

       <xsl:for-each select="trial/lcov/lcovitem">

       <tr>
          <td><xsl:value-of select="@dir"/></td>
          <td>
             <a target="_blank" style="text-decoration:none;">
                <xsl:attribute name="href">
                   <xsl:value-of select="."/>index.html
                </xsl:attribute>

                <small style="color:black;"><i>Click here to open coverage summary</i></small>
             </a>
          </td>
       </tr>

       </xsl:for-each>
   </xsl:if>

</table>

</div>

<!-- ======================================================================= -->
<!-- ===== End of file -->
<!-- ======================================================================= -->

  </body>
  </html>
</xsl:template>


<!-- ======================================================================= -->
<!-- ===== Supporting functions -->
<!-- ======================================================================= -->

<xsl:template name="LFsToBRs">
        <xsl:param name="input" />
        <xsl:choose>
                <xsl:when test="contains($input, '&#10;')">
                        <xsl:value-of select="substring-before($input, '&#10;')"  xml:space="preserve"/><br />
                        <xsl:call-template name="LFsToBRs">
                                <xsl:with-param name="input" select="substring-after($input, '&#10;')"/>
                        </xsl:call-template>
                </xsl:when>
                <xsl:otherwise>
                        <xsl:value-of select="$input" xml:space="preserve"/>
                </xsl:otherwise>
        </xsl:choose>
</xsl:template>

</xsl:stylesheet>
