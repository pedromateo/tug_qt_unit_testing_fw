/**
 */
package org.casa.dsltesting.Qt48Xmlschema.util;

import java.util.List;

import org.casa.dsltesting.Qt48Xmlschema.Action;
import org.casa.dsltesting.Qt48Xmlschema.ActionGroup;
import org.casa.dsltesting.Qt48Xmlschema.ActionRef;
import org.casa.dsltesting.Qt48Xmlschema.Brush;
import org.casa.dsltesting.Qt48Xmlschema.ButtonGroup;
import org.casa.dsltesting.Qt48Xmlschema.ButtonGroups;
import org.casa.dsltesting.Qt48Xmlschema.Char;
import org.casa.dsltesting.Qt48Xmlschema.Color;
import org.casa.dsltesting.Qt48Xmlschema.ColorGroup;
import org.casa.dsltesting.Qt48Xmlschema.ColorRole;
import org.casa.dsltesting.Qt48Xmlschema.Column;
import org.casa.dsltesting.Qt48Xmlschema.Connection;
import org.casa.dsltesting.Qt48Xmlschema.ConnectionHint;
import org.casa.dsltesting.Qt48Xmlschema.ConnectionHints;
import org.casa.dsltesting.Qt48Xmlschema.Connections;
import org.casa.dsltesting.Qt48Xmlschema.CustomWidget;
import org.casa.dsltesting.Qt48Xmlschema.CustomWidgets;
import org.casa.dsltesting.Qt48Xmlschema.Date;
import org.casa.dsltesting.Qt48Xmlschema.DateTime;
import org.casa.dsltesting.Qt48Xmlschema.DesignerData;
import org.casa.dsltesting.Qt48Xmlschema.DocumentRoot;
import org.casa.dsltesting.Qt48Xmlschema.Font;
import org.casa.dsltesting.Qt48Xmlschema.Gradient;
import org.casa.dsltesting.Qt48Xmlschema.GradientStop;
import org.casa.dsltesting.Qt48Xmlschema.Header;
import org.casa.dsltesting.Qt48Xmlschema.Image;
import org.casa.dsltesting.Qt48Xmlschema.ImageData;
import org.casa.dsltesting.Qt48Xmlschema.Images;
import org.casa.dsltesting.Qt48Xmlschema.Include;
import org.casa.dsltesting.Qt48Xmlschema.Includes;
import org.casa.dsltesting.Qt48Xmlschema.Item;
import org.casa.dsltesting.Qt48Xmlschema.Layout;
import org.casa.dsltesting.Qt48Xmlschema.LayoutDefault;
import org.casa.dsltesting.Qt48Xmlschema.LayoutFunction;
import org.casa.dsltesting.Qt48Xmlschema.LayoutItem;
import org.casa.dsltesting.Qt48Xmlschema.Locale;
import org.casa.dsltesting.Qt48Xmlschema.Palette;
import org.casa.dsltesting.Qt48Xmlschema.Point;
import org.casa.dsltesting.Qt48Xmlschema.PointF;
import org.casa.dsltesting.Qt48Xmlschema.Properties;
import org.casa.dsltesting.Qt48Xmlschema.Property;
import org.casa.dsltesting.Qt48Xmlschema.PropertyData;
import org.casa.dsltesting.Qt48Xmlschema.PropertySpecifications;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlSchemaPackage;
import org.casa.dsltesting.Qt48Xmlschema.Rect;
import org.casa.dsltesting.Qt48Xmlschema.RectF;
import org.casa.dsltesting.Qt48Xmlschema.Resource;
import org.casa.dsltesting.Qt48Xmlschema.ResourceIcon;
import org.casa.dsltesting.Qt48Xmlschema.ResourcePixmap;
import org.casa.dsltesting.Qt48Xmlschema.Resources;
import org.casa.dsltesting.Qt48Xmlschema.Row;
import org.casa.dsltesting.Qt48Xmlschema.Script;
import org.casa.dsltesting.Qt48Xmlschema.Size;
import org.casa.dsltesting.Qt48Xmlschema.SizeF;
import org.casa.dsltesting.Qt48Xmlschema.SizePolicy;
import org.casa.dsltesting.Qt48Xmlschema.SizePolicyData;
import org.casa.dsltesting.Qt48Xmlschema.Slots;
import org.casa.dsltesting.Qt48Xmlschema.Spacer;
import org.casa.dsltesting.Qt48Xmlschema.StringList;
import org.casa.dsltesting.Qt48Xmlschema.StringPropertySpecification;
import org.casa.dsltesting.Qt48Xmlschema.TabStops;
import org.casa.dsltesting.Qt48Xmlschema.Time;
import org.casa.dsltesting.Qt48Xmlschema.UI;
import org.casa.dsltesting.Qt48Xmlschema.Url;
import org.casa.dsltesting.Qt48Xmlschema.Widget;
import org.casa.dsltesting.Qt48Xmlschema.WidgetData;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlSchemaPackage
 * @generated
 */
public class Qt48XmlSchemaSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Qt48XmlSchemaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qt48XmlSchemaSwitch() {
		if (modelPackage == null) {
			modelPackage = Qt48XmlSchemaPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Qt48XmlSchemaPackage.ACTION: {
				Action action = (Action)theEObject;
				Object result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.ACTION_GROUP: {
				ActionGroup actionGroup = (ActionGroup)theEObject;
				Object result = caseActionGroup(actionGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.ACTION_REF: {
				ActionRef actionRef = (ActionRef)theEObject;
				Object result = caseActionRef(actionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.BRUSH: {
				Brush brush = (Brush)theEObject;
				Object result = caseBrush(brush);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.BUTTON_GROUP: {
				ButtonGroup buttonGroup = (ButtonGroup)theEObject;
				Object result = caseButtonGroup(buttonGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.BUTTON_GROUPS: {
				ButtonGroups buttonGroups = (ButtonGroups)theEObject;
				Object result = caseButtonGroups(buttonGroups);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.CHAR: {
				Char char_ = (Char)theEObject;
				Object result = caseChar(char_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.COLOR: {
				Color color = (Color)theEObject;
				Object result = caseColor(color);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.COLOR_GROUP: {
				ColorGroup colorGroup = (ColorGroup)theEObject;
				Object result = caseColorGroup(colorGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.COLOR_ROLE: {
				ColorRole colorRole = (ColorRole)theEObject;
				Object result = caseColorRole(colorRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.COLUMN: {
				Column column = (Column)theEObject;
				Object result = caseColumn(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				Object result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.CONNECTION_HINT: {
				ConnectionHint connectionHint = (ConnectionHint)theEObject;
				Object result = caseConnectionHint(connectionHint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.CONNECTION_HINTS: {
				ConnectionHints connectionHints = (ConnectionHints)theEObject;
				Object result = caseConnectionHints(connectionHints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.CONNECTIONS: {
				Connections connections = (Connections)theEObject;
				Object result = caseConnections(connections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.CUSTOM_WIDGET: {
				CustomWidget customWidget = (CustomWidget)theEObject;
				Object result = caseCustomWidget(customWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.CUSTOM_WIDGETS: {
				CustomWidgets customWidgets = (CustomWidgets)theEObject;
				Object result = caseCustomWidgets(customWidgets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.DATE: {
				Date date = (Date)theEObject;
				Object result = caseDate(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				Object result = caseDateTime(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.DESIGNER_DATA: {
				DesignerData designerData = (DesignerData)theEObject;
				Object result = caseDesignerData(designerData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				Object result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.FONT: {
				Font font = (Font)theEObject;
				Object result = caseFont(font);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.GRADIENT: {
				Gradient gradient = (Gradient)theEObject;
				Object result = caseGradient(gradient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.GRADIENT_STOP: {
				GradientStop gradientStop = (GradientStop)theEObject;
				Object result = caseGradientStop(gradientStop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.HEADER: {
				Header header = (Header)theEObject;
				Object result = caseHeader(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.IMAGE: {
				Image image = (Image)theEObject;
				Object result = caseImage(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.IMAGE_DATA: {
				ImageData imageData = (ImageData)theEObject;
				Object result = caseImageData(imageData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.IMAGES: {
				Images images = (Images)theEObject;
				Object result = caseImages(images);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.INCLUDE: {
				Include include = (Include)theEObject;
				Object result = caseInclude(include);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.INCLUDES: {
				Includes includes = (Includes)theEObject;
				Object result = caseIncludes(includes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.ITEM: {
				Item item = (Item)theEObject;
				Object result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				Object result = caseLayout(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.LAYOUT_DEFAULT: {
				LayoutDefault layoutDefault = (LayoutDefault)theEObject;
				Object result = caseLayoutDefault(layoutDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.LAYOUT_FUNCTION: {
				LayoutFunction layoutFunction = (LayoutFunction)theEObject;
				Object result = caseLayoutFunction(layoutFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.LAYOUT_ITEM: {
				LayoutItem layoutItem = (LayoutItem)theEObject;
				Object result = caseLayoutItem(layoutItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.LOCALE: {
				Locale locale = (Locale)theEObject;
				Object result = caseLocale(locale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.PALETTE: {
				Palette palette = (Palette)theEObject;
				Object result = casePalette(palette);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.POINT: {
				Point point = (Point)theEObject;
				Object result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.POINT_F: {
				PointF pointF = (PointF)theEObject;
				Object result = casePointF(pointF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.PROPERTIES: {
				Properties properties = (Properties)theEObject;
				Object result = caseProperties(properties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.PROPERTY: {
				Property property = (Property)theEObject;
				Object result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.PROPERTY_DATA: {
				PropertyData propertyData = (PropertyData)theEObject;
				Object result = casePropertyData(propertyData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.PROPERTY_SPECIFICATIONS: {
				PropertySpecifications propertySpecifications = (PropertySpecifications)theEObject;
				Object result = casePropertySpecifications(propertySpecifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.RECT: {
				Rect rect = (Rect)theEObject;
				Object result = caseRect(rect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.RECT_F: {
				RectF rectF = (RectF)theEObject;
				Object result = caseRectF(rectF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				Object result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.RESOURCE_ICON: {
				ResourceIcon resourceIcon = (ResourceIcon)theEObject;
				Object result = caseResourceIcon(resourceIcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.RESOURCE_PIXMAP: {
				ResourcePixmap resourcePixmap = (ResourcePixmap)theEObject;
				Object result = caseResourcePixmap(resourcePixmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.RESOURCES: {
				Resources resources = (Resources)theEObject;
				Object result = caseResources(resources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.ROW: {
				Row row = (Row)theEObject;
				Object result = caseRow(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.SCRIPT: {
				Script script = (Script)theEObject;
				Object result = caseScript(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.SIZE: {
				Size size = (Size)theEObject;
				Object result = caseSize(size);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.SIZE_F: {
				SizeF sizeF = (SizeF)theEObject;
				Object result = caseSizeF(sizeF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.SIZE_POLICY: {
				SizePolicy sizePolicy = (SizePolicy)theEObject;
				Object result = caseSizePolicy(sizePolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.SIZE_POLICY_DATA: {
				SizePolicyData sizePolicyData = (SizePolicyData)theEObject;
				Object result = caseSizePolicyData(sizePolicyData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.SLOTS: {
				Slots slots = (Slots)theEObject;
				Object result = caseSlots(slots);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.SPACER: {
				Spacer spacer = (Spacer)theEObject;
				Object result = caseSpacer(spacer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.STRING: {
				org.casa.dsltesting.Qt48Xmlschema.String string = (org.casa.dsltesting.Qt48Xmlschema.String)theEObject;
				Object result = caseString(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.STRING_LIST: {
				StringList stringList = (StringList)theEObject;
				Object result = caseStringList(stringList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.STRING_PROPERTY_SPECIFICATION: {
				StringPropertySpecification stringPropertySpecification = (StringPropertySpecification)theEObject;
				Object result = caseStringPropertySpecification(stringPropertySpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.TAB_STOPS: {
				TabStops tabStops = (TabStops)theEObject;
				Object result = caseTabStops(tabStops);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.TIME: {
				Time time = (Time)theEObject;
				Object result = caseTime(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.UI: {
				UI ui = (UI)theEObject;
				Object result = caseUI(ui);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.URL: {
				Url url = (Url)theEObject;
				Object result = caseUrl(url);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				Object result = caseWidget(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlSchemaPackage.WIDGET_DATA: {
				WidgetData widgetData = (WidgetData)theEObject;
				Object result = caseWidgetData(widgetData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionGroup(ActionGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionRef(ActionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brush</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brush</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBrush(Brush object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseButtonGroup(ButtonGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Groups</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Groups</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseButtonGroups(ButtonGroups object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChar(Char object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseColor(Color object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseColorGroup(ColorGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseColorRole(ColorRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Hint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Hint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectionHint(ConnectionHint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Hints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Hints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectionHints(ConnectionHints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnections(Connections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomWidget(CustomWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Widgets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Widgets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomWidgets(CustomWidgets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Designer Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Designer Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDesignerData(DesignerData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFont(Font object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gradient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gradient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGradient(Gradient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gradient Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gradient Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGradientStop(GradientStop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImageData(ImageData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Images</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Images</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImages(Images object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInclude(Include object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Includes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Includes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIncludes(Includes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLayoutDefault(LayoutDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLayoutFunction(LayoutFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLayoutItem(LayoutItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocale(Locale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Palette</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Palette</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePalette(Palette object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point F</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point F</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePointF(PointF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProperties(Properties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePropertyData(PropertyData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Specifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Specifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePropertySpecifications(PropertySpecifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRect(Rect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rect F</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rect F</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRectF(RectF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Icon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Icon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResourceIcon(ResourceIcon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Pixmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Pixmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResourcePixmap(ResourcePixmap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResources(Resources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSize(Size object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size F</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size F</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSizeF(SizeF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSizePolicy(SizePolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Policy Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Policy Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSizePolicyData(SizePolicyData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slots</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slots</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSlots(Slots object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSpacer(Spacer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseString(org.casa.dsltesting.Qt48Xmlschema.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringList(StringList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Property Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Property Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringPropertySpecification(StringPropertySpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Stops</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Stops</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTabStops(TabStops object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUI(UI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUrl(Url object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWidgetData(WidgetData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //Qt48XmlSchemaSwitch
