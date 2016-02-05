/**
 */
package org.casa.dsltesting.Qt48Xmlschema.impl;

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
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaFactory;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
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
import org.casa.dsltesting.Qt48Xmlschema.Url;
import org.casa.dsltesting.Qt48Xmlschema.Widget;
import org.casa.dsltesting.Qt48Xmlschema.WidgetData;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Qt48XmlschemaPackageImpl extends EPackageImpl implements Qt48XmlschemaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brushEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonGroupsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionHintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionHintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customWidgetsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designerDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradientStopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paletteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertySpecificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceIconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePixmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizePolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizePolicyDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringPropertySpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabStopsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetDataEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Qt48XmlschemaPackageImpl() {
		super(eNS_URI, Qt48XmlschemaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Qt48XmlschemaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Qt48XmlschemaPackage init() {
		if (isInited) return (Qt48XmlschemaPackage)EPackage.Registry.INSTANCE.getEPackage(Qt48XmlschemaPackage.eNS_URI);

		// Obtain or create and register package
		Qt48XmlschemaPackageImpl theQt48XmlschemaPackage = (Qt48XmlschemaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Qt48XmlschemaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Qt48XmlschemaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQt48XmlschemaPackage.createPackageContents();

		// Initialize created meta-data
		theQt48XmlschemaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQt48XmlschemaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Qt48XmlschemaPackage.eNS_URI, theQt48XmlschemaPackage);
		return theQt48XmlschemaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Group() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Property() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Attribute() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Menu() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Name() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionGroup() {
		return actionGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionGroup_Group() {
		return (EAttribute)actionGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroup_Action() {
		return (EReference)actionGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroup_Actiongroup() {
		return (EReference)actionGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroup_Property() {
		return (EReference)actionGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroup_Attribute() {
		return (EReference)actionGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionGroup_Name() {
		return (EAttribute)actionGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionRef() {
		return actionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionRef_Name() {
		return (EAttribute)actionRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrush() {
		return brushEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrush_Color() {
		return (EReference)brushEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrush_Texture() {
		return (EReference)brushEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrush_Gradient() {
		return (EReference)brushEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrush_Brushstyle() {
		return (EAttribute)brushEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonGroup() {
		return buttonGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonGroup_Group() {
		return (EAttribute)buttonGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButtonGroup_Property() {
		return (EReference)buttonGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButtonGroup_Attribute() {
		return (EReference)buttonGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonGroup_Name() {
		return (EAttribute)buttonGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonGroups() {
		return buttonGroupsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButtonGroups_Buttongroup() {
		return (EReference)buttonGroupsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChar() {
		return charEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChar_Unicode() {
		return (EAttribute)charEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColor() {
		return colorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Red() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Green() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Blue() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Alpha() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorGroup() {
		return colorGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorGroup_Group() {
		return (EAttribute)colorGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorGroup_Colorrole() {
		return (EReference)colorGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorGroup_Color() {
		return (EReference)colorGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorRole() {
		return colorRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorRole_Brush() {
		return (EReference)colorRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorRole_Role() {
		return (EAttribute)colorRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_Property() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Sender() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Signal() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Receiver() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Slot() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Hints() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionHint() {
		return connectionHintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionHint_X() {
		return (EAttribute)connectionHintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionHint_Y() {
		return (EAttribute)connectionHintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionHint_Type() {
		return (EAttribute)connectionHintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionHints() {
		return connectionHintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionHints_Hint() {
		return (EReference)connectionHintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnections() {
		return connectionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnections_Connection() {
		return (EReference)connectionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomWidget() {
		return customWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomWidget_Class() {
		return (EAttribute)customWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomWidget_Extends() {
		return (EAttribute)customWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomWidget_Header() {
		return (EReference)customWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomWidget_Sizehint() {
		return (EReference)customWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomWidget_Addpagemethod() {
		return (EAttribute)customWidgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomWidget_Container() {
		return (EAttribute)customWidgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomWidget_Sizepolicy() {
		return (EReference)customWidgetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomWidget_Pixmap() {
		return (EAttribute)customWidgetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomWidget_Script() {
		return (EReference)customWidgetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomWidget_Properties() {
		return (EReference)customWidgetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomWidget_Slots() {
		return (EReference)customWidgetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomWidget_Propertyspecifications() {
		return (EReference)customWidgetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomWidgets() {
		return customWidgetsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomWidgets_Customwidget() {
		return (EReference)customWidgetsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Year() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Month() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Day() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime() {
		return dateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_Hour() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_Minute() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_Second() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_Year() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_Month() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_Day() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignerData() {
		return designerDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignerData_Property() {
		return (EReference)designerDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ui() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFont() {
		return fontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Family() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Pointsize() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Weight() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Italic() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Bold() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Underline() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Strikeout() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Antialiasing() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Stylestrategy() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Kerning() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradient() {
		return gradientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGradient_GradientStop() {
		return (EReference)gradientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradient_Angle() {
		return (EAttribute)gradientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradient_Centralx() {
		return (EAttribute)gradientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradient_Centraly() {
		return (EAttribute)gradientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradient_Coordinatemode() {
		return (EAttribute)gradientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradient_Endx() {
		return (EAttribute)gradientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradient_Endy() {
		return (EAttribute)gradientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradient_Focalx() {
		return (EAttribute)gradientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradient_Focaly() {
		return (EAttribute)gradientEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradient_Radius() {
		return (EAttribute)gradientEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradient_Spread() {
		return (EAttribute)gradientEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradient_Startx() {
		return (EAttribute)gradientEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradient_Starty() {
		return (EAttribute)gradientEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradient_Type() {
		return (EAttribute)gradientEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradientStop() {
		return gradientStopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGradientStop_Color() {
		return (EReference)gradientStopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientStop_Position() {
		return (EAttribute)gradientStopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeader() {
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Mixed() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Location() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_Data() {
		return (EReference)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Name() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageData() {
		return imageDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageData_Mixed() {
		return (EAttribute)imageDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageData_Format() {
		return (EAttribute)imageDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageData_Length() {
		return (EAttribute)imageDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImages() {
		return imagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImages_Image() {
		return (EReference)imagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclude() {
		return includeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInclude_Mixed() {
		return (EAttribute)includeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInclude_Impldecl() {
		return (EAttribute)includeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInclude_Location() {
		return (EAttribute)includeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludes() {
		return includesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludes_Include() {
		return (EReference)includesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Group() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Property() {
		return (EReference)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Item() {
		return (EReference)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Column() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Row() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Group() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Property() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Attribute() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Item() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Class() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Columnminimumwidth() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Columnstretch() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Name() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Rowminimumheight() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Rowstretch() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Stretch() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutDefault() {
		return layoutDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutDefault_Margin() {
		return (EAttribute)layoutDefaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutDefault_Spacing() {
		return (EAttribute)layoutDefaultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutFunction() {
		return layoutFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutFunction_Margin() {
		return (EAttribute)layoutFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutFunction_Spacing() {
		return (EAttribute)layoutFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutItem() {
		return layoutItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutItem_Widget() {
		return (EReference)layoutItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutItem_Layout() {
		return (EReference)layoutItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutItem_Spacer() {
		return (EReference)layoutItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutItem_Alignment() {
		return (EAttribute)layoutItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutItem_Colspan() {
		return (EAttribute)layoutItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutItem_Column() {
		return (EAttribute)layoutItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutItem_Row() {
		return (EAttribute)layoutItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutItem_Rowspan() {
		return (EAttribute)layoutItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocale() {
		return localeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocale_Country() {
		return (EAttribute)localeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocale_Language() {
		return (EAttribute)localeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPalette() {
		return paletteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPalette_Active() {
		return (EReference)paletteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPalette_Inactive() {
		return (EReference)paletteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPalette_Disabled() {
		return (EReference)paletteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_X() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Y() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointF() {
		return pointFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointF_X() {
		return (EAttribute)pointFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointF_Y() {
		return (EAttribute)pointFEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_Property() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Bool() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Color() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Cstring() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Cursor() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Cursorshape() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Enum() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Font() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Iconset() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Pixmap() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Palette() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Point() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Rect() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Set() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Locale() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Sizepolicy() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Size() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_String() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Stringlist() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Number() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Float() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Double() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Date() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Time() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Datetime() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Pointf() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Rectf() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Sizef() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Longlong() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Char() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Url() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Uint() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Ulonglong() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Brush() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Stdset() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyData() {
		return propertyDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyData_Type() {
		return (EAttribute)propertyDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertySpecifications() {
		return propertySpecificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertySpecifications_Group() {
		return (EAttribute)propertySpecificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertySpecifications_Stringpropertyspecification() {
		return (EReference)propertySpecificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRect() {
		return rectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_X() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Y() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Width() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Height() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectF() {
		return rectFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectF_X() {
		return (EAttribute)rectFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectF_Y() {
		return (EAttribute)rectFEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectF_Width() {
		return (EAttribute)rectFEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectF_Height() {
		return (EAttribute)rectFEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Location() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceIcon() {
		return resourceIconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceIcon_Mixed() {
		return (EAttribute)resourceIconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceIcon_Normaloff() {
		return (EReference)resourceIconEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceIcon_Normalon() {
		return (EReference)resourceIconEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceIcon_Disabledoff() {
		return (EReference)resourceIconEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceIcon_Disabledon() {
		return (EReference)resourceIconEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceIcon_Activeoff() {
		return (EReference)resourceIconEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceIcon_Activeon() {
		return (EReference)resourceIconEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceIcon_Selectedoff() {
		return (EReference)resourceIconEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceIcon_Selectedon() {
		return (EReference)resourceIconEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceIcon_Resource() {
		return (EAttribute)resourceIconEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceIcon_Theme() {
		return (EAttribute)resourceIconEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcePixmap() {
		return resourcePixmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcePixmap_Mixed() {
		return (EAttribute)resourcePixmapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcePixmap_Alias() {
		return (EAttribute)resourcePixmapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcePixmap_Resource() {
		return (EAttribute)resourcePixmapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResources() {
		return resourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResources_Include() {
		return (EReference)resourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResources_Name() {
		return (EAttribute)resourcesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRow_Property() {
		return (EReference)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Language() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Source() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSize() {
		return sizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Width() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Height() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSizeF() {
		return sizeFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizeF_Width() {
		return (EAttribute)sizeFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizeF_Height() {
		return (EAttribute)sizeFEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSizePolicy() {
		return sizePolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizePolicy_Hsizetype() {
		return (EAttribute)sizePolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizePolicy_Vsizetype() {
		return (EAttribute)sizePolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizePolicy_Horstretch() {
		return (EAttribute)sizePolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizePolicy_Verstretch() {
		return (EAttribute)sizePolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizePolicy_Hsizetype1() {
		return (EAttribute)sizePolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizePolicy_Vsizetype1() {
		return (EAttribute)sizePolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSizePolicyData() {
		return sizePolicyDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizePolicyData_Hordata() {
		return (EAttribute)sizePolicyDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizePolicyData_Verdata() {
		return (EAttribute)sizePolicyDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlots() {
		return slotsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlots_Group() {
		return (EAttribute)slotsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlots_Signal() {
		return (EAttribute)slotsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlots_Slot() {
		return (EAttribute)slotsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpacer() {
		return spacerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacer_Property() {
		return (EReference)spacerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacer_Name() {
		return (EAttribute)spacerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Mixed() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Comment() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Extracomment() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Notr() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringList() {
		return stringListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringList_String() {
		return (EAttribute)stringListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringPropertySpecification() {
		return stringPropertySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringPropertySpecification_Name() {
		return (EAttribute)stringPropertySpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringPropertySpecification_Notr() {
		return (EAttribute)stringPropertySpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringPropertySpecification_Type() {
		return (EAttribute)stringPropertySpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabStops() {
		return tabStopsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabStops_Tabstop() {
		return (EAttribute)tabStopsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Hour() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Minute() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Second() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUI() {
		return uiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUI_Author() {
		return (EAttribute)uiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUI_Comment() {
		return (EAttribute)uiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUI_Exportmacro() {
		return (EAttribute)uiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUI_Class() {
		return (EAttribute)uiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Widget() {
		return (EReference)uiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Layoutdefault() {
		return (EReference)uiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Layoutfunction() {
		return (EReference)uiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUI_Pixmapfunction() {
		return (EAttribute)uiEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Customwidgets() {
		return (EReference)uiEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Tabstops() {
		return (EReference)uiEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Images() {
		return (EReference)uiEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Includes() {
		return (EReference)uiEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Resources() {
		return (EReference)uiEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Connections() {
		return (EReference)uiEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Designerdata() {
		return (EReference)uiEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Slots() {
		return (EReference)uiEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Buttongroups() {
		return (EReference)uiEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUI_Displayname() {
		return (EAttribute)uiEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUI_Language() {
		return (EAttribute)uiEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUI_Stdsetdef() {
		return (EAttribute)uiEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUI_StdSetDef1() {
		return (EAttribute)uiEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUI_Version() {
		return (EAttribute)uiEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrl() {
		return urlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUrl_String() {
		return (EReference)urlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Class() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Property() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Script() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Widgetdata() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Attribute() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Row() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Column() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Item() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Layout() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Widget() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Action() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Actiongroup() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Addaction() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Zorder() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Class1() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Name() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Native() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetData() {
		return widgetDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetData_Property() {
		return (EReference)widgetDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qt48XmlschemaFactory getQt48XmlschemaFactory() {
		return (Qt48XmlschemaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__GROUP);
		createEReference(actionEClass, ACTION__PROPERTY);
		createEReference(actionEClass, ACTION__ATTRIBUTE);
		createEAttribute(actionEClass, ACTION__MENU);
		createEAttribute(actionEClass, ACTION__NAME);

		actionGroupEClass = createEClass(ACTION_GROUP);
		createEAttribute(actionGroupEClass, ACTION_GROUP__GROUP);
		createEReference(actionGroupEClass, ACTION_GROUP__ACTION);
		createEReference(actionGroupEClass, ACTION_GROUP__ACTIONGROUP);
		createEReference(actionGroupEClass, ACTION_GROUP__PROPERTY);
		createEReference(actionGroupEClass, ACTION_GROUP__ATTRIBUTE);
		createEAttribute(actionGroupEClass, ACTION_GROUP__NAME);

		actionRefEClass = createEClass(ACTION_REF);
		createEAttribute(actionRefEClass, ACTION_REF__NAME);

		brushEClass = createEClass(BRUSH);
		createEReference(brushEClass, BRUSH__COLOR);
		createEReference(brushEClass, BRUSH__TEXTURE);
		createEReference(brushEClass, BRUSH__GRADIENT);
		createEAttribute(brushEClass, BRUSH__BRUSHSTYLE);

		buttonGroupEClass = createEClass(BUTTON_GROUP);
		createEAttribute(buttonGroupEClass, BUTTON_GROUP__GROUP);
		createEReference(buttonGroupEClass, BUTTON_GROUP__PROPERTY);
		createEReference(buttonGroupEClass, BUTTON_GROUP__ATTRIBUTE);
		createEAttribute(buttonGroupEClass, BUTTON_GROUP__NAME);

		buttonGroupsEClass = createEClass(BUTTON_GROUPS);
		createEReference(buttonGroupsEClass, BUTTON_GROUPS__BUTTONGROUP);

		charEClass = createEClass(CHAR);
		createEAttribute(charEClass, CHAR__UNICODE);

		colorEClass = createEClass(COLOR);
		createEAttribute(colorEClass, COLOR__RED);
		createEAttribute(colorEClass, COLOR__GREEN);
		createEAttribute(colorEClass, COLOR__BLUE);
		createEAttribute(colorEClass, COLOR__ALPHA);

		colorGroupEClass = createEClass(COLOR_GROUP);
		createEAttribute(colorGroupEClass, COLOR_GROUP__GROUP);
		createEReference(colorGroupEClass, COLOR_GROUP__COLORROLE);
		createEReference(colorGroupEClass, COLOR_GROUP__COLOR);

		colorRoleEClass = createEClass(COLOR_ROLE);
		createEReference(colorRoleEClass, COLOR_ROLE__BRUSH);
		createEAttribute(colorRoleEClass, COLOR_ROLE__ROLE);

		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__PROPERTY);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__SENDER);
		createEAttribute(connectionEClass, CONNECTION__SIGNAL);
		createEAttribute(connectionEClass, CONNECTION__RECEIVER);
		createEAttribute(connectionEClass, CONNECTION__SLOT);
		createEReference(connectionEClass, CONNECTION__HINTS);

		connectionHintEClass = createEClass(CONNECTION_HINT);
		createEAttribute(connectionHintEClass, CONNECTION_HINT__X);
		createEAttribute(connectionHintEClass, CONNECTION_HINT__Y);
		createEAttribute(connectionHintEClass, CONNECTION_HINT__TYPE);

		connectionHintsEClass = createEClass(CONNECTION_HINTS);
		createEReference(connectionHintsEClass, CONNECTION_HINTS__HINT);

		connectionsEClass = createEClass(CONNECTIONS);
		createEReference(connectionsEClass, CONNECTIONS__CONNECTION);

		customWidgetEClass = createEClass(CUSTOM_WIDGET);
		createEAttribute(customWidgetEClass, CUSTOM_WIDGET__CLASS);
		createEAttribute(customWidgetEClass, CUSTOM_WIDGET__EXTENDS);
		createEReference(customWidgetEClass, CUSTOM_WIDGET__HEADER);
		createEReference(customWidgetEClass, CUSTOM_WIDGET__SIZEHINT);
		createEAttribute(customWidgetEClass, CUSTOM_WIDGET__ADDPAGEMETHOD);
		createEAttribute(customWidgetEClass, CUSTOM_WIDGET__CONTAINER);
		createEReference(customWidgetEClass, CUSTOM_WIDGET__SIZEPOLICY);
		createEAttribute(customWidgetEClass, CUSTOM_WIDGET__PIXMAP);
		createEReference(customWidgetEClass, CUSTOM_WIDGET__SCRIPT);
		createEReference(customWidgetEClass, CUSTOM_WIDGET__PROPERTIES);
		createEReference(customWidgetEClass, CUSTOM_WIDGET__SLOTS);
		createEReference(customWidgetEClass, CUSTOM_WIDGET__PROPERTYSPECIFICATIONS);

		customWidgetsEClass = createEClass(CUSTOM_WIDGETS);
		createEReference(customWidgetsEClass, CUSTOM_WIDGETS__CUSTOMWIDGET);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__YEAR);
		createEAttribute(dateEClass, DATE__MONTH);
		createEAttribute(dateEClass, DATE__DAY);

		dateTimeEClass = createEClass(DATE_TIME);
		createEAttribute(dateTimeEClass, DATE_TIME__HOUR);
		createEAttribute(dateTimeEClass, DATE_TIME__MINUTE);
		createEAttribute(dateTimeEClass, DATE_TIME__SECOND);
		createEAttribute(dateTimeEClass, DATE_TIME__YEAR);
		createEAttribute(dateTimeEClass, DATE_TIME__MONTH);
		createEAttribute(dateTimeEClass, DATE_TIME__DAY);

		designerDataEClass = createEClass(DESIGNER_DATA);
		createEReference(designerDataEClass, DESIGNER_DATA__PROPERTY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UI);

		fontEClass = createEClass(FONT);
		createEAttribute(fontEClass, FONT__FAMILY);
		createEAttribute(fontEClass, FONT__POINTSIZE);
		createEAttribute(fontEClass, FONT__WEIGHT);
		createEAttribute(fontEClass, FONT__ITALIC);
		createEAttribute(fontEClass, FONT__BOLD);
		createEAttribute(fontEClass, FONT__UNDERLINE);
		createEAttribute(fontEClass, FONT__STRIKEOUT);
		createEAttribute(fontEClass, FONT__ANTIALIASING);
		createEAttribute(fontEClass, FONT__STYLESTRATEGY);
		createEAttribute(fontEClass, FONT__KERNING);

		gradientEClass = createEClass(GRADIENT);
		createEReference(gradientEClass, GRADIENT__GRADIENT_STOP);
		createEAttribute(gradientEClass, GRADIENT__ANGLE);
		createEAttribute(gradientEClass, GRADIENT__CENTRALX);
		createEAttribute(gradientEClass, GRADIENT__CENTRALY);
		createEAttribute(gradientEClass, GRADIENT__COORDINATEMODE);
		createEAttribute(gradientEClass, GRADIENT__ENDX);
		createEAttribute(gradientEClass, GRADIENT__ENDY);
		createEAttribute(gradientEClass, GRADIENT__FOCALX);
		createEAttribute(gradientEClass, GRADIENT__FOCALY);
		createEAttribute(gradientEClass, GRADIENT__RADIUS);
		createEAttribute(gradientEClass, GRADIENT__SPREAD);
		createEAttribute(gradientEClass, GRADIENT__STARTX);
		createEAttribute(gradientEClass, GRADIENT__STARTY);
		createEAttribute(gradientEClass, GRADIENT__TYPE);

		gradientStopEClass = createEClass(GRADIENT_STOP);
		createEReference(gradientStopEClass, GRADIENT_STOP__COLOR);
		createEAttribute(gradientStopEClass, GRADIENT_STOP__POSITION);

		headerEClass = createEClass(HEADER);
		createEAttribute(headerEClass, HEADER__MIXED);
		createEAttribute(headerEClass, HEADER__LOCATION);

		imageEClass = createEClass(IMAGE);
		createEReference(imageEClass, IMAGE__DATA);
		createEAttribute(imageEClass, IMAGE__NAME);

		imageDataEClass = createEClass(IMAGE_DATA);
		createEAttribute(imageDataEClass, IMAGE_DATA__MIXED);
		createEAttribute(imageDataEClass, IMAGE_DATA__FORMAT);
		createEAttribute(imageDataEClass, IMAGE_DATA__LENGTH);

		imagesEClass = createEClass(IMAGES);
		createEReference(imagesEClass, IMAGES__IMAGE);

		includeEClass = createEClass(INCLUDE);
		createEAttribute(includeEClass, INCLUDE__MIXED);
		createEAttribute(includeEClass, INCLUDE__IMPLDECL);
		createEAttribute(includeEClass, INCLUDE__LOCATION);

		includesEClass = createEClass(INCLUDES);
		createEReference(includesEClass, INCLUDES__INCLUDE);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__GROUP);
		createEReference(itemEClass, ITEM__PROPERTY);
		createEReference(itemEClass, ITEM__ITEM);
		createEAttribute(itemEClass, ITEM__COLUMN);
		createEAttribute(itemEClass, ITEM__ROW);

		layoutEClass = createEClass(LAYOUT);
		createEAttribute(layoutEClass, LAYOUT__GROUP);
		createEReference(layoutEClass, LAYOUT__PROPERTY);
		createEReference(layoutEClass, LAYOUT__ATTRIBUTE);
		createEReference(layoutEClass, LAYOUT__ITEM);
		createEAttribute(layoutEClass, LAYOUT__CLASS);
		createEAttribute(layoutEClass, LAYOUT__COLUMNMINIMUMWIDTH);
		createEAttribute(layoutEClass, LAYOUT__COLUMNSTRETCH);
		createEAttribute(layoutEClass, LAYOUT__NAME);
		createEAttribute(layoutEClass, LAYOUT__ROWMINIMUMHEIGHT);
		createEAttribute(layoutEClass, LAYOUT__ROWSTRETCH);
		createEAttribute(layoutEClass, LAYOUT__STRETCH);

		layoutDefaultEClass = createEClass(LAYOUT_DEFAULT);
		createEAttribute(layoutDefaultEClass, LAYOUT_DEFAULT__MARGIN);
		createEAttribute(layoutDefaultEClass, LAYOUT_DEFAULT__SPACING);

		layoutFunctionEClass = createEClass(LAYOUT_FUNCTION);
		createEAttribute(layoutFunctionEClass, LAYOUT_FUNCTION__MARGIN);
		createEAttribute(layoutFunctionEClass, LAYOUT_FUNCTION__SPACING);

		layoutItemEClass = createEClass(LAYOUT_ITEM);
		createEReference(layoutItemEClass, LAYOUT_ITEM__WIDGET);
		createEReference(layoutItemEClass, LAYOUT_ITEM__LAYOUT);
		createEReference(layoutItemEClass, LAYOUT_ITEM__SPACER);
		createEAttribute(layoutItemEClass, LAYOUT_ITEM__ALIGNMENT);
		createEAttribute(layoutItemEClass, LAYOUT_ITEM__COLSPAN);
		createEAttribute(layoutItemEClass, LAYOUT_ITEM__COLUMN);
		createEAttribute(layoutItemEClass, LAYOUT_ITEM__ROW);
		createEAttribute(layoutItemEClass, LAYOUT_ITEM__ROWSPAN);

		localeEClass = createEClass(LOCALE);
		createEAttribute(localeEClass, LOCALE__COUNTRY);
		createEAttribute(localeEClass, LOCALE__LANGUAGE);

		paletteEClass = createEClass(PALETTE);
		createEReference(paletteEClass, PALETTE__ACTIVE);
		createEReference(paletteEClass, PALETTE__INACTIVE);
		createEReference(paletteEClass, PALETTE__DISABLED);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);

		pointFEClass = createEClass(POINT_F);
		createEAttribute(pointFEClass, POINT_F__X);
		createEAttribute(pointFEClass, POINT_F__Y);

		propertiesEClass = createEClass(PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__PROPERTY);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__BOOL);
		createEReference(propertyEClass, PROPERTY__COLOR);
		createEAttribute(propertyEClass, PROPERTY__CSTRING);
		createEAttribute(propertyEClass, PROPERTY__CURSOR);
		createEAttribute(propertyEClass, PROPERTY__CURSORSHAPE);
		createEAttribute(propertyEClass, PROPERTY__ENUM);
		createEReference(propertyEClass, PROPERTY__FONT);
		createEReference(propertyEClass, PROPERTY__ICONSET);
		createEReference(propertyEClass, PROPERTY__PIXMAP);
		createEReference(propertyEClass, PROPERTY__PALETTE);
		createEReference(propertyEClass, PROPERTY__POINT);
		createEReference(propertyEClass, PROPERTY__RECT);
		createEAttribute(propertyEClass, PROPERTY__SET);
		createEReference(propertyEClass, PROPERTY__LOCALE);
		createEReference(propertyEClass, PROPERTY__SIZEPOLICY);
		createEReference(propertyEClass, PROPERTY__SIZE);
		createEReference(propertyEClass, PROPERTY__STRING);
		createEReference(propertyEClass, PROPERTY__STRINGLIST);
		createEAttribute(propertyEClass, PROPERTY__NUMBER);
		createEAttribute(propertyEClass, PROPERTY__FLOAT);
		createEAttribute(propertyEClass, PROPERTY__DOUBLE);
		createEReference(propertyEClass, PROPERTY__DATE);
		createEReference(propertyEClass, PROPERTY__TIME);
		createEReference(propertyEClass, PROPERTY__DATETIME);
		createEReference(propertyEClass, PROPERTY__POINTF);
		createEReference(propertyEClass, PROPERTY__RECTF);
		createEReference(propertyEClass, PROPERTY__SIZEF);
		createEAttribute(propertyEClass, PROPERTY__LONGLONG);
		createEReference(propertyEClass, PROPERTY__CHAR);
		createEReference(propertyEClass, PROPERTY__URL);
		createEAttribute(propertyEClass, PROPERTY__UINT);
		createEAttribute(propertyEClass, PROPERTY__ULONGLONG);
		createEReference(propertyEClass, PROPERTY__BRUSH);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__STDSET);

		propertyDataEClass = createEClass(PROPERTY_DATA);
		createEAttribute(propertyDataEClass, PROPERTY_DATA__TYPE);

		propertySpecificationsEClass = createEClass(PROPERTY_SPECIFICATIONS);
		createEAttribute(propertySpecificationsEClass, PROPERTY_SPECIFICATIONS__GROUP);
		createEReference(propertySpecificationsEClass, PROPERTY_SPECIFICATIONS__STRINGPROPERTYSPECIFICATION);

		rectEClass = createEClass(RECT);
		createEAttribute(rectEClass, RECT__X);
		createEAttribute(rectEClass, RECT__Y);
		createEAttribute(rectEClass, RECT__WIDTH);
		createEAttribute(rectEClass, RECT__HEIGHT);

		rectFEClass = createEClass(RECT_F);
		createEAttribute(rectFEClass, RECT_F__X);
		createEAttribute(rectFEClass, RECT_F__Y);
		createEAttribute(rectFEClass, RECT_F__WIDTH);
		createEAttribute(rectFEClass, RECT_F__HEIGHT);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__LOCATION);

		resourceIconEClass = createEClass(RESOURCE_ICON);
		createEAttribute(resourceIconEClass, RESOURCE_ICON__MIXED);
		createEReference(resourceIconEClass, RESOURCE_ICON__NORMALOFF);
		createEReference(resourceIconEClass, RESOURCE_ICON__NORMALON);
		createEReference(resourceIconEClass, RESOURCE_ICON__DISABLEDOFF);
		createEReference(resourceIconEClass, RESOURCE_ICON__DISABLEDON);
		createEReference(resourceIconEClass, RESOURCE_ICON__ACTIVEOFF);
		createEReference(resourceIconEClass, RESOURCE_ICON__ACTIVEON);
		createEReference(resourceIconEClass, RESOURCE_ICON__SELECTEDOFF);
		createEReference(resourceIconEClass, RESOURCE_ICON__SELECTEDON);
		createEAttribute(resourceIconEClass, RESOURCE_ICON__RESOURCE);
		createEAttribute(resourceIconEClass, RESOURCE_ICON__THEME);

		resourcePixmapEClass = createEClass(RESOURCE_PIXMAP);
		createEAttribute(resourcePixmapEClass, RESOURCE_PIXMAP__MIXED);
		createEAttribute(resourcePixmapEClass, RESOURCE_PIXMAP__ALIAS);
		createEAttribute(resourcePixmapEClass, RESOURCE_PIXMAP__RESOURCE);

		resourcesEClass = createEClass(RESOURCES);
		createEReference(resourcesEClass, RESOURCES__INCLUDE);
		createEAttribute(resourcesEClass, RESOURCES__NAME);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__PROPERTY);

		scriptEClass = createEClass(SCRIPT);
		createEAttribute(scriptEClass, SCRIPT__LANGUAGE);
		createEAttribute(scriptEClass, SCRIPT__SOURCE);

		sizeEClass = createEClass(SIZE);
		createEAttribute(sizeEClass, SIZE__WIDTH);
		createEAttribute(sizeEClass, SIZE__HEIGHT);

		sizeFEClass = createEClass(SIZE_F);
		createEAttribute(sizeFEClass, SIZE_F__WIDTH);
		createEAttribute(sizeFEClass, SIZE_F__HEIGHT);

		sizePolicyEClass = createEClass(SIZE_POLICY);
		createEAttribute(sizePolicyEClass, SIZE_POLICY__HSIZETYPE);
		createEAttribute(sizePolicyEClass, SIZE_POLICY__VSIZETYPE);
		createEAttribute(sizePolicyEClass, SIZE_POLICY__HORSTRETCH);
		createEAttribute(sizePolicyEClass, SIZE_POLICY__VERSTRETCH);
		createEAttribute(sizePolicyEClass, SIZE_POLICY__HSIZETYPE1);
		createEAttribute(sizePolicyEClass, SIZE_POLICY__VSIZETYPE1);

		sizePolicyDataEClass = createEClass(SIZE_POLICY_DATA);
		createEAttribute(sizePolicyDataEClass, SIZE_POLICY_DATA__HORDATA);
		createEAttribute(sizePolicyDataEClass, SIZE_POLICY_DATA__VERDATA);

		slotsEClass = createEClass(SLOTS);
		createEAttribute(slotsEClass, SLOTS__GROUP);
		createEAttribute(slotsEClass, SLOTS__SIGNAL);
		createEAttribute(slotsEClass, SLOTS__SLOT);

		spacerEClass = createEClass(SPACER);
		createEReference(spacerEClass, SPACER__PROPERTY);
		createEAttribute(spacerEClass, SPACER__NAME);

		stringEClass = createEClass(STRING);
		createEAttribute(stringEClass, STRING__MIXED);
		createEAttribute(stringEClass, STRING__COMMENT);
		createEAttribute(stringEClass, STRING__EXTRACOMMENT);
		createEAttribute(stringEClass, STRING__NOTR);

		stringListEClass = createEClass(STRING_LIST);
		createEAttribute(stringListEClass, STRING_LIST__STRING);

		stringPropertySpecificationEClass = createEClass(STRING_PROPERTY_SPECIFICATION);
		createEAttribute(stringPropertySpecificationEClass, STRING_PROPERTY_SPECIFICATION__NAME);
		createEAttribute(stringPropertySpecificationEClass, STRING_PROPERTY_SPECIFICATION__NOTR);
		createEAttribute(stringPropertySpecificationEClass, STRING_PROPERTY_SPECIFICATION__TYPE);

		tabStopsEClass = createEClass(TAB_STOPS);
		createEAttribute(tabStopsEClass, TAB_STOPS__TABSTOP);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__HOUR);
		createEAttribute(timeEClass, TIME__MINUTE);
		createEAttribute(timeEClass, TIME__SECOND);

		uiEClass = createEClass(UI);
		createEAttribute(uiEClass, UI__AUTHOR);
		createEAttribute(uiEClass, UI__COMMENT);
		createEAttribute(uiEClass, UI__EXPORTMACRO);
		createEAttribute(uiEClass, UI__CLASS);
		createEReference(uiEClass, UI__WIDGET);
		createEReference(uiEClass, UI__LAYOUTDEFAULT);
		createEReference(uiEClass, UI__LAYOUTFUNCTION);
		createEAttribute(uiEClass, UI__PIXMAPFUNCTION);
		createEReference(uiEClass, UI__CUSTOMWIDGETS);
		createEReference(uiEClass, UI__TABSTOPS);
		createEReference(uiEClass, UI__IMAGES);
		createEReference(uiEClass, UI__INCLUDES);
		createEReference(uiEClass, UI__RESOURCES);
		createEReference(uiEClass, UI__CONNECTIONS);
		createEReference(uiEClass, UI__DESIGNERDATA);
		createEReference(uiEClass, UI__SLOTS);
		createEReference(uiEClass, UI__BUTTONGROUPS);
		createEAttribute(uiEClass, UI__DISPLAYNAME);
		createEAttribute(uiEClass, UI__LANGUAGE);
		createEAttribute(uiEClass, UI__STDSETDEF);
		createEAttribute(uiEClass, UI__STD_SET_DEF1);
		createEAttribute(uiEClass, UI__VERSION);

		urlEClass = createEClass(URL);
		createEReference(urlEClass, URL__STRING);

		widgetEClass = createEClass(WIDGET);
		createEAttribute(widgetEClass, WIDGET__CLASS);
		createEReference(widgetEClass, WIDGET__PROPERTY);
		createEReference(widgetEClass, WIDGET__SCRIPT);
		createEReference(widgetEClass, WIDGET__WIDGETDATA);
		createEReference(widgetEClass, WIDGET__ATTRIBUTE);
		createEReference(widgetEClass, WIDGET__ROW);
		createEReference(widgetEClass, WIDGET__COLUMN);
		createEReference(widgetEClass, WIDGET__ITEM);
		createEReference(widgetEClass, WIDGET__LAYOUT);
		createEReference(widgetEClass, WIDGET__WIDGET);
		createEReference(widgetEClass, WIDGET__ACTION);
		createEReference(widgetEClass, WIDGET__ACTIONGROUP);
		createEReference(widgetEClass, WIDGET__ADDACTION);
		createEAttribute(widgetEClass, WIDGET__ZORDER);
		createEAttribute(widgetEClass, WIDGET__CLASS1);
		createEAttribute(widgetEClass, WIDGET__NAME);
		createEAttribute(widgetEClass, WIDGET__NATIVE);

		widgetDataEClass = createEClass(WIDGET_DATA);
		createEReference(widgetDataEClass, WIDGET_DATA__PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Property(), this.getProperty(), null, "property", null, 0, -1, Action.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Attribute(), this.getProperty(), null, "attribute", null, 0, -1, Action.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Menu(), theXMLTypePackage.getString(), "menu", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionGroupEClass, ActionGroup.class, "ActionGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionGroup_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ActionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionGroup_Action(), this.getAction(), null, "action", null, 0, -1, ActionGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActionGroup_Actiongroup(), this.getActionGroup(), null, "actiongroup", null, 0, -1, ActionGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActionGroup_Property(), this.getProperty(), null, "property", null, 0, -1, ActionGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActionGroup_Attribute(), this.getProperty(), null, "attribute", null, 0, -1, ActionGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionGroup_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ActionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionRefEClass, ActionRef.class, "ActionRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionRef_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ActionRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brushEClass, Brush.class, "Brush", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBrush_Color(), this.getColor(), null, "color", null, 0, 1, Brush.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBrush_Texture(), this.getProperty(), null, "texture", null, 0, 1, Brush.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBrush_Gradient(), this.getGradient(), null, "gradient", null, 0, 1, Brush.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrush_Brushstyle(), theXMLTypePackage.getString(), "brushstyle", null, 1, 1, Brush.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonGroupEClass, ButtonGroup.class, "ButtonGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonGroup_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ButtonGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getButtonGroup_Property(), this.getProperty(), null, "property", null, 0, -1, ButtonGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getButtonGroup_Attribute(), this.getProperty(), null, "attribute", null, 0, -1, ButtonGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getButtonGroup_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ButtonGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonGroupsEClass, ButtonGroups.class, "ButtonGroups", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButtonGroups_Buttongroup(), this.getButtonGroup(), null, "buttongroup", null, 1, -1, ButtonGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(charEClass, Char.class, "Char", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChar_Unicode(), theXMLTypePackage.getInteger(), "unicode", null, 1, 1, Char.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColor_Red(), theXMLTypePackage.getInteger(), "red", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_Green(), theXMLTypePackage.getInteger(), "green", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_Blue(), theXMLTypePackage.getInteger(), "blue", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_Alpha(), theXMLTypePackage.getInteger(), "alpha", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorGroupEClass, ColorGroup.class, "ColorGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorGroup_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ColorGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColorGroup_Colorrole(), this.getColorRole(), null, "colorrole", null, 0, -1, ColorGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getColorGroup_Color(), this.getColor(), null, "color", null, 0, -1, ColorGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(colorRoleEClass, ColorRole.class, "ColorRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColorRole_Brush(), this.getBrush(), null, "brush", null, 1, 1, ColorRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorRole_Role(), theXMLTypePackage.getString(), "role", null, 1, 1, ColorRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Property(), this.getProperty(), null, "property", null, 0, -1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Sender(), theXMLTypePackage.getString(), "sender", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Signal(), theXMLTypePackage.getString(), "signal", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Receiver(), theXMLTypePackage.getString(), "receiver", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Slot(), theXMLTypePackage.getString(), "slot", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Hints(), this.getConnectionHints(), null, "hints", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionHintEClass, ConnectionHint.class, "ConnectionHint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionHint_X(), theXMLTypePackage.getInteger(), "x", null, 1, 1, ConnectionHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionHint_Y(), theXMLTypePackage.getInteger(), "y", null, 1, 1, ConnectionHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionHint_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, ConnectionHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionHintsEClass, ConnectionHints.class, "ConnectionHints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionHints_Hint(), this.getConnectionHint(), null, "hint", null, 1, -1, ConnectionHints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionsEClass, Connections.class, "Connections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnections_Connection(), this.getConnection(), null, "connection", null, 0, -1, Connections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customWidgetEClass, CustomWidget.class, "CustomWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomWidget_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, CustomWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomWidget_Extends(), theXMLTypePackage.getString(), "extends", null, 1, 1, CustomWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomWidget_Header(), this.getHeader(), null, "header", null, 1, 1, CustomWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomWidget_Sizehint(), this.getSize(), null, "sizehint", null, 0, 1, CustomWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomWidget_Addpagemethod(), theXMLTypePackage.getString(), "addpagemethod", null, 0, 1, CustomWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomWidget_Container(), theXMLTypePackage.getInteger(), "container", null, 0, 1, CustomWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomWidget_Sizepolicy(), this.getSizePolicyData(), null, "sizepolicy", null, 0, 1, CustomWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomWidget_Pixmap(), theXMLTypePackage.getString(), "pixmap", null, 0, 1, CustomWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomWidget_Script(), this.getScript(), null, "script", null, 0, 1, CustomWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomWidget_Properties(), this.getProperties(), null, "properties", null, 0, 1, CustomWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomWidget_Slots(), this.getSlots(), null, "slots", null, 0, 1, CustomWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomWidget_Propertyspecifications(), this.getPropertySpecifications(), null, "propertyspecifications", null, 0, 1, CustomWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customWidgetsEClass, CustomWidgets.class, "CustomWidgets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomWidgets_Customwidget(), this.getCustomWidget(), null, "customwidget", null, 1, -1, CustomWidgets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_Year(), theXMLTypePackage.getInteger(), "year", null, 1, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Month(), theXMLTypePackage.getInteger(), "month", null, 1, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Day(), theXMLTypePackage.getInteger(), "day", null, 1, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTime_Hour(), theXMLTypePackage.getInteger(), "hour", null, 1, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Minute(), theXMLTypePackage.getInteger(), "minute", null, 1, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Second(), theXMLTypePackage.getInteger(), "second", null, 1, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Year(), theXMLTypePackage.getInteger(), "year", null, 1, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Month(), theXMLTypePackage.getInteger(), "month", null, 1, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Day(), theXMLTypePackage.getInteger(), "day", null, 1, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(designerDataEClass, DesignerData.class, "DesignerData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignerData_Property(), this.getProperty(), null, "property", null, 1, -1, DesignerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Ui(), this.getUI(), null, "ui", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fontEClass, Font.class, "Font", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFont_Family(), theXMLTypePackage.getString(), "family", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Pointsize(), theXMLTypePackage.getInteger(), "pointsize", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Weight(), theXMLTypePackage.getInteger(), "weight", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Italic(), theXMLTypePackage.getBoolean(), "italic", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Bold(), theXMLTypePackage.getBoolean(), "bold", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Underline(), theXMLTypePackage.getBoolean(), "underline", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Strikeout(), theXMLTypePackage.getBoolean(), "strikeout", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Antialiasing(), theXMLTypePackage.getBoolean(), "antialiasing", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Stylestrategy(), theXMLTypePackage.getString(), "stylestrategy", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Kerning(), theXMLTypePackage.getBoolean(), "kerning", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientEClass, Gradient.class, "Gradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGradient_GradientStop(), this.getGradientStop(), null, "gradientStop", null, 1, -1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradient_Angle(), theXMLTypePackage.getDouble(), "angle", null, 1, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradient_Centralx(), theXMLTypePackage.getDouble(), "centralx", null, 1, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradient_Centraly(), theXMLTypePackage.getDouble(), "centraly", null, 1, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradient_Coordinatemode(), theXMLTypePackage.getString(), "coordinatemode", null, 1, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradient_Endx(), theXMLTypePackage.getDouble(), "endx", null, 1, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradient_Endy(), theXMLTypePackage.getDouble(), "endy", null, 1, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradient_Focalx(), theXMLTypePackage.getDouble(), "focalx", null, 1, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradient_Focaly(), theXMLTypePackage.getDouble(), "focaly", null, 1, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradient_Radius(), theXMLTypePackage.getDouble(), "radius", null, 1, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradient_Spread(), theXMLTypePackage.getString(), "spread", null, 1, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradient_Startx(), theXMLTypePackage.getDouble(), "startx", null, 1, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradient_Starty(), theXMLTypePackage.getDouble(), "starty", null, 1, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradient_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientStopEClass, GradientStop.class, "GradientStop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGradientStop_Color(), this.getColor(), null, "color", null, 1, 1, GradientStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientStop_Position(), theXMLTypePackage.getDouble(), "position", null, 1, 1, GradientStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeader_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeader_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImage_Data(), this.getImageData(), null, "data", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageDataEClass, ImageData.class, "ImageData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageData_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ImageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageData_Format(), theXMLTypePackage.getString(), "format", null, 1, 1, ImageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageData_Length(), theXMLTypePackage.getInteger(), "length", null, 1, 1, ImageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imagesEClass, Images.class, "Images", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImages_Image(), this.getImage(), null, "image", null, 1, -1, Images.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInclude_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInclude_Impldecl(), theXMLTypePackage.getString(), "impldecl", null, 0, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInclude_Location(), theXMLTypePackage.getString(), "location", null, 1, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includesEClass, Includes.class, "Includes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncludes_Include(), this.getInclude(), null, "include", null, 1, -1, Includes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Property(), this.getProperty(), null, "property", null, 0, -1, Item.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Item(), this.getItem(), null, "item", null, 0, -1, Item.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Column(), theXMLTypePackage.getInteger(), "column", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Row(), theXMLTypePackage.getInteger(), "row", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayout_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Property(), this.getProperty(), null, "property", null, 0, -1, Layout.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Attribute(), this.getProperty(), null, "attribute", null, 0, -1, Layout.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Item(), this.getLayoutItem(), null, "item", null, 0, -1, Layout.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Columnminimumwidth(), theXMLTypePackage.getString(), "columnminimumwidth", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Columnstretch(), theXMLTypePackage.getString(), "columnstretch", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Rowminimumheight(), theXMLTypePackage.getString(), "rowminimumheight", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Rowstretch(), theXMLTypePackage.getString(), "rowstretch", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Stretch(), theXMLTypePackage.getString(), "stretch", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutDefaultEClass, LayoutDefault.class, "LayoutDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayoutDefault_Margin(), theXMLTypePackage.getInteger(), "margin", null, 1, 1, LayoutDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutDefault_Spacing(), theXMLTypePackage.getInteger(), "spacing", null, 1, 1, LayoutDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutFunctionEClass, LayoutFunction.class, "LayoutFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayoutFunction_Margin(), theXMLTypePackage.getString(), "margin", null, 1, 1, LayoutFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutFunction_Spacing(), theXMLTypePackage.getString(), "spacing", null, 1, 1, LayoutFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutItemEClass, LayoutItem.class, "LayoutItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayoutItem_Widget(), this.getWidget(), null, "widget", null, 0, 1, LayoutItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutItem_Layout(), this.getLayout(), null, "layout", null, 0, 1, LayoutItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutItem_Spacer(), this.getSpacer(), null, "spacer", null, 0, 1, LayoutItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutItem_Alignment(), theXMLTypePackage.getString(), "alignment", null, 0, 1, LayoutItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutItem_Colspan(), theXMLTypePackage.getInteger(), "colspan", null, 0, 1, LayoutItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutItem_Column(), theXMLTypePackage.getInteger(), "column", null, 0, 1, LayoutItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutItem_Row(), theXMLTypePackage.getInteger(), "row", null, 0, 1, LayoutItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutItem_Rowspan(), theXMLTypePackage.getInteger(), "rowspan", null, 0, 1, LayoutItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localeEClass, Locale.class, "Locale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocale_Country(), theXMLTypePackage.getString(), "country", null, 1, 1, Locale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocale_Language(), theXMLTypePackage.getString(), "language", null, 1, 1, Locale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paletteEClass, Palette.class, "Palette", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPalette_Active(), this.getColorGroup(), null, "active", null, 1, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPalette_Inactive(), this.getColorGroup(), null, "inactive", null, 1, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPalette_Disabled(), this.getColorGroup(), null, "disabled", null, 1, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), theXMLTypePackage.getInteger(), "x", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Y(), theXMLTypePackage.getInteger(), "y", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointFEClass, PointF.class, "PointF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointF_X(), theXMLTypePackage.getDouble(), "x", null, 1, 1, PointF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointF_Y(), theXMLTypePackage.getDouble(), "y", null, 1, 1, PointF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperties_Property(), this.getPropertyData(), null, "property", null, 1, -1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Bool(), theXMLTypePackage.getString(), "bool", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Color(), this.getColor(), null, "color", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Cstring(), theXMLTypePackage.getString(), "cstring", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Cursor(), theXMLTypePackage.getInteger(), "cursor", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Cursorshape(), theXMLTypePackage.getString(), "cursorshape", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Enum(), theXMLTypePackage.getString(), "enum", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Font(), this.getFont(), null, "font", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Iconset(), this.getResourceIcon(), null, "iconset", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Pixmap(), this.getResourcePixmap(), null, "pixmap", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Palette(), this.getPalette(), null, "palette", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Point(), this.getPoint(), null, "point", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Rect(), this.getRect(), null, "rect", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Set(), theXMLTypePackage.getString(), "set", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Locale(), this.getLocale(), null, "locale", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Sizepolicy(), this.getSizePolicy(), null, "sizepolicy", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Size(), this.getSize(), null, "size", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_String(), this.getString(), null, "string", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Stringlist(), this.getStringList(), null, "stringlist", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Number(), theXMLTypePackage.getInteger(), "number", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Float(), theXMLTypePackage.getFloat(), "float", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Double(), theXMLTypePackage.getDouble(), "double", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Date(), this.getDate(), null, "date", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Time(), this.getTime(), null, "time", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Datetime(), this.getDateTime(), null, "datetime", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Pointf(), this.getPointF(), null, "pointf", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Rectf(), this.getRectF(), null, "rectf", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Sizef(), this.getSizeF(), null, "sizef", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Longlong(), theXMLTypePackage.getLong(), "longlong", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Char(), this.getChar(), null, "char", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Url(), this.getUrl(), null, "url", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Uint(), theXMLTypePackage.getUnsignedInt(), "uint", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Ulonglong(), theXMLTypePackage.getUnsignedLong(), "ulonglong", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Brush(), this.getBrush(), null, "brush", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Stdset(), theXMLTypePackage.getInteger(), "stdset", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyDataEClass, PropertyData.class, "PropertyData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyData_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, PropertyData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertySpecificationsEClass, PropertySpecifications.class, "PropertySpecifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertySpecifications_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PropertySpecifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertySpecifications_Stringpropertyspecification(), this.getStringPropertySpecification(), null, "stringpropertyspecification", null, 0, -1, PropertySpecifications.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rectEClass, Rect.class, "Rect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRect_X(), theXMLTypePackage.getInteger(), "x", null, 1, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_Y(), theXMLTypePackage.getInteger(), "y", null, 1, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_Width(), theXMLTypePackage.getInteger(), "width", null, 1, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_Height(), theXMLTypePackage.getInteger(), "height", null, 1, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectFEClass, RectF.class, "RectF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectF_X(), theXMLTypePackage.getDouble(), "x", null, 1, 1, RectF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectF_Y(), theXMLTypePackage.getDouble(), "y", null, 1, 1, RectF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectF_Width(), theXMLTypePackage.getDouble(), "width", null, 1, 1, RectF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectF_Height(), theXMLTypePackage.getDouble(), "height", null, 1, 1, RectF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Location(), theXMLTypePackage.getString(), "location", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceIconEClass, ResourceIcon.class, "ResourceIcon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceIcon_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ResourceIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceIcon_Normaloff(), this.getResourcePixmap(), null, "normaloff", null, 0, 1, ResourceIcon.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getResourceIcon_Normalon(), this.getResourcePixmap(), null, "normalon", null, 0, 1, ResourceIcon.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getResourceIcon_Disabledoff(), this.getResourcePixmap(), null, "disabledoff", null, 0, 1, ResourceIcon.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getResourceIcon_Disabledon(), this.getResourcePixmap(), null, "disabledon", null, 0, 1, ResourceIcon.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getResourceIcon_Activeoff(), this.getResourcePixmap(), null, "activeoff", null, 0, 1, ResourceIcon.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getResourceIcon_Activeon(), this.getResourcePixmap(), null, "activeon", null, 0, 1, ResourceIcon.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getResourceIcon_Selectedoff(), this.getResourcePixmap(), null, "selectedoff", null, 0, 1, ResourceIcon.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getResourceIcon_Selectedon(), this.getResourcePixmap(), null, "selectedon", null, 0, 1, ResourceIcon.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceIcon_Resource(), theXMLTypePackage.getString(), "resource", null, 0, 1, ResourceIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceIcon_Theme(), theXMLTypePackage.getString(), "theme", null, 0, 1, ResourceIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcePixmapEClass, ResourcePixmap.class, "ResourcePixmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourcePixmap_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ResourcePixmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePixmap_Alias(), theXMLTypePackage.getString(), "alias", null, 0, 1, ResourcePixmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePixmap_Resource(), theXMLTypePackage.getString(), "resource", null, 0, 1, ResourcePixmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcesEClass, Resources.class, "Resources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResources_Include(), this.getResource(), null, "include", null, 0, -1, Resources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResources_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Resources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_Property(), this.getProperty(), null, "property", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScript_Language(), theXMLTypePackage.getString(), "language", null, 1, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScript_Source(), theXMLTypePackage.getString(), "source", null, 1, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSize_Width(), theXMLTypePackage.getInteger(), "width", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSize_Height(), theXMLTypePackage.getInteger(), "height", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sizeFEClass, SizeF.class, "SizeF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSizeF_Width(), theXMLTypePackage.getDouble(), "width", null, 1, 1, SizeF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizeF_Height(), theXMLTypePackage.getDouble(), "height", null, 1, 1, SizeF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sizePolicyEClass, SizePolicy.class, "SizePolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSizePolicy_Hsizetype(), theXMLTypePackage.getInteger(), "hsizetype", null, 0, 1, SizePolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizePolicy_Vsizetype(), theXMLTypePackage.getInteger(), "vsizetype", null, 0, 1, SizePolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizePolicy_Horstretch(), theXMLTypePackage.getInteger(), "horstretch", null, 1, 1, SizePolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizePolicy_Verstretch(), theXMLTypePackage.getInteger(), "verstretch", null, 1, 1, SizePolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizePolicy_Hsizetype1(), theXMLTypePackage.getString(), "hsizetype1", null, 0, 1, SizePolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizePolicy_Vsizetype1(), theXMLTypePackage.getString(), "vsizetype1", null, 0, 1, SizePolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sizePolicyDataEClass, SizePolicyData.class, "SizePolicyData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSizePolicyData_Hordata(), theXMLTypePackage.getInteger(), "hordata", null, 1, 1, SizePolicyData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizePolicyData_Verdata(), theXMLTypePackage.getInteger(), "verdata", null, 1, 1, SizePolicyData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotsEClass, Slots.class, "Slots", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlots_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Slots.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlots_Signal(), theXMLTypePackage.getString(), "signal", null, 0, -1, Slots.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlots_Slot(), theXMLTypePackage.getString(), "slot", null, 0, -1, Slots.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(spacerEClass, Spacer.class, "Spacer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpacer_Property(), this.getProperty(), null, "property", null, 1, -1, Spacer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacer_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Spacer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringEClass, org.casa.dsltesting.Qt48Xmlschema.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getString_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, org.casa.dsltesting.Qt48Xmlschema.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getString_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getString_Extracomment(), theXMLTypePackage.getString(), "extracomment", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getString_Notr(), theXMLTypePackage.getString(), "notr", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringListEClass, StringList.class, "StringList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringList_String(), theXMLTypePackage.getString(), "string", null, 0, -1, StringList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringPropertySpecificationEClass, StringPropertySpecification.class, "StringPropertySpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringPropertySpecification_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, StringPropertySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringPropertySpecification_Notr(), theXMLTypePackage.getString(), "notr", null, 0, 1, StringPropertySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringPropertySpecification_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, StringPropertySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabStopsEClass, TabStops.class, "TabStops", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabStops_Tabstop(), theXMLTypePackage.getString(), "tabstop", null, 1, -1, TabStops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Hour(), theXMLTypePackage.getInteger(), "hour", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Minute(), theXMLTypePackage.getInteger(), "minute", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Second(), theXMLTypePackage.getInteger(), "second", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiEClass, org.casa.dsltesting.Qt48Xmlschema.UI.class, "UI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUI_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUI_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUI_Exportmacro(), theXMLTypePackage.getString(), "exportmacro", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUI_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_Widget(), this.getWidget(), null, "widget", null, 1, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_Layoutdefault(), this.getLayoutDefault(), null, "layoutdefault", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_Layoutfunction(), this.getLayoutFunction(), null, "layoutfunction", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUI_Pixmapfunction(), theXMLTypePackage.getString(), "pixmapfunction", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_Customwidgets(), this.getCustomWidgets(), null, "customwidgets", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_Tabstops(), this.getTabStops(), null, "tabstops", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_Images(), this.getImages(), null, "images", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_Includes(), this.getIncludes(), null, "includes", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_Resources(), this.getResources(), null, "resources", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_Connections(), this.getConnections(), null, "connections", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_Designerdata(), this.getDesignerData(), null, "designerdata", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_Slots(), this.getSlots(), null, "slots", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_Buttongroups(), this.getButtonGroups(), null, "buttongroups", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUI_Displayname(), theXMLTypePackage.getString(), "displayname", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUI_Language(), theXMLTypePackage.getString(), "language", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUI_Stdsetdef(), theXMLTypePackage.getInteger(), "stdsetdef", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUI_StdSetDef1(), theXMLTypePackage.getInteger(), "stdSetDef1", null, 0, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUI_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, org.casa.dsltesting.Qt48Xmlschema.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlEClass, Url.class, "Url", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUrl_String(), this.getString(), null, "string", null, 1, 1, Url.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidget_Class(), theXMLTypePackage.getString(), "class", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Property(), this.getProperty(), null, "property", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Script(), this.getScript(), null, "script", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Widgetdata(), this.getWidgetData(), null, "widgetdata", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Attribute(), this.getProperty(), null, "attribute", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Row(), this.getRow(), null, "row", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Column(), this.getColumn(), null, "column", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Item(), this.getItem(), null, "item", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Layout(), this.getLayout(), null, "layout", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Widget(), this.getWidget(), null, "widget", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Action(), this.getAction(), null, "action", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Actiongroup(), this.getActionGroup(), null, "actiongroup", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Addaction(), this.getActionRef(), null, "addaction", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Zorder(), theXMLTypePackage.getString(), "zorder", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Class1(), theXMLTypePackage.getString(), "class1", null, 1, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Native(), theXMLTypePackage.getBoolean(), "native", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetDataEClass, WidgetData.class, "WidgetData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidgetData_Property(), this.getProperty(), null, "property", null, 1, -1, WidgetData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });	
		addAnnotation
		  (actionEClass, 
		   source, 
		   new String[] {
			 "name", "Action",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAction_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getAction_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getAction_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getAction_Menu(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "menu",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAction_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (actionGroupEClass, 
		   source, 
		   new String[] {
			 "name", "ActionGroup",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActionGroup_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getActionGroup_Action(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "action",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getActionGroup_Actiongroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actiongroup",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getActionGroup_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getActionGroup_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getActionGroup_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (actionRefEClass, 
		   source, 
		   new String[] {
			 "name", "ActionRef",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getActionRef_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (brushEClass, 
		   source, 
		   new String[] {
			 "name", "Brush",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBrush_Color(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "color",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBrush_Texture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "texture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBrush_Gradient(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "gradient",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBrush_Brushstyle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "brushstyle",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (buttonGroupEClass, 
		   source, 
		   new String[] {
			 "name", "ButtonGroup",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getButtonGroup_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getButtonGroup_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getButtonGroup_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getButtonGroup_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (buttonGroupsEClass, 
		   source, 
		   new String[] {
			 "name", "ButtonGroups",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getButtonGroups_Buttongroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "buttongroup",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (charEClass, 
		   source, 
		   new String[] {
			 "name", "Char",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getChar_Unicode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unicode",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (colorEClass, 
		   source, 
		   new String[] {
			 "name", "Color",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getColor_Red(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "red",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getColor_Green(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "green",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getColor_Blue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "blue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getColor_Alpha(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alpha",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (colorGroupEClass, 
		   source, 
		   new String[] {
			 "name", "ColorGroup",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getColorGroup_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getColorGroup_Colorrole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "colorrole",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getColorGroup_Color(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "color",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (colorRoleEClass, 
		   source, 
		   new String[] {
			 "name", "ColorRole",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getColorRole_Brush(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "brush",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getColorRole_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "name", "Column",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getColumn_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (connectionEClass, 
		   source, 
		   new String[] {
			 "name", "Connection",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getConnection_Sender(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sender",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConnection_Signal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "signal",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConnection_Receiver(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "receiver",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConnection_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "slot",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConnection_Hints(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hints",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (connectionHintEClass, 
		   source, 
		   new String[] {
			 "name", "ConnectionHint",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getConnectionHint_X(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "x",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConnectionHint_Y(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "y",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConnectionHint_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (connectionHintsEClass, 
		   source, 
		   new String[] {
			 "name", "ConnectionHints",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getConnectionHints_Hint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hint",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (connectionsEClass, 
		   source, 
		   new String[] {
			 "name", "Connections",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getConnections_Connection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connection",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (customWidgetEClass, 
		   source, 
		   new String[] {
			 "name", "CustomWidget",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCustomWidget_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCustomWidget_Extends(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extends",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCustomWidget_Header(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "header",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCustomWidget_Sizehint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sizehint",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCustomWidget_Addpagemethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "addpagemethod",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCustomWidget_Container(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "container",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCustomWidget_Sizepolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sizepolicy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCustomWidget_Pixmap(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pixmap",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCustomWidget_Script(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "script",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCustomWidget_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCustomWidget_Slots(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "slots",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCustomWidget_Propertyspecifications(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "propertyspecifications",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (customWidgetsEClass, 
		   source, 
		   new String[] {
			 "name", "CustomWidgets",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCustomWidgets_Customwidget(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "customwidget",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (dateEClass, 
		   source, 
		   new String[] {
			 "name", "Date",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDate_Year(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDate_Month(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "month",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDate_Day(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "day",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (dateTimeEClass, 
		   source, 
		   new String[] {
			 "name", "DateTime",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDateTime_Hour(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hour",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDateTime_Minute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "minute",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDateTime_Second(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "second",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDateTime_Year(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDateTime_Month(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "month",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDateTime_Day(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "day",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (designerDataEClass, 
		   source, 
		   new String[] {
			 "name", "DesignerData",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDesignerData_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_Ui(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ui",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (fontEClass, 
		   source, 
		   new String[] {
			 "name", "Font",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFont_Family(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "family",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFont_Pointsize(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pointsize",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFont_Weight(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "weight",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFont_Italic(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "italic",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFont_Bold(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bold",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFont_Underline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "underline",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFont_Strikeout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strikeout",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFont_Antialiasing(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "antialiasing",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFont_Stylestrategy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stylestrategy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFont_Kerning(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "kerning",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (gradientEClass, 
		   source, 
		   new String[] {
			 "name", "Gradient",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getGradient_GradientStop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "gradientStop",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradient_Angle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "angle",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradient_Centralx(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "centralx",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradient_Centraly(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "centraly",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradient_Coordinatemode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "coordinatemode",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradient_Endx(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endx",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradient_Endy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradient_Focalx(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "focalx",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradient_Focaly(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "focaly",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradient_Radius(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "radius",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradient_Spread(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "spread",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradient_Startx(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "startx",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradient_Starty(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "starty",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradient_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (gradientStopEClass, 
		   source, 
		   new String[] {
			 "name", "GradientStop",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getGradientStop_Color(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "color",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGradientStop_Position(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "position",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (headerEClass, 
		   source, 
		   new String[] {
			 "name", "Header",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getHeader_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getHeader_Location(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "location",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (imageEClass, 
		   source, 
		   new String[] {
			 "name", "Image",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getImage_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getImage_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (imageDataEClass, 
		   source, 
		   new String[] {
			 "name", "ImageData",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getImageData_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getImageData_Format(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getImageData_Length(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "length",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (imagesEClass, 
		   source, 
		   new String[] {
			 "name", "Images",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getImages_Image(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "image",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (includeEClass, 
		   source, 
		   new String[] {
			 "name", "Include",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getInclude_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getInclude_Impldecl(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "impldecl",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getInclude_Location(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "location",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (includesEClass, 
		   source, 
		   new String[] {
			 "name", "Includes",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIncludes_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (itemEClass, 
		   source, 
		   new String[] {
			 "name", "Item",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getItem_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getItem_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getItem_Item(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getItem_Column(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getItem_Row(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "row",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (layoutEClass, 
		   source, 
		   new String[] {
			 "name", "Layout",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLayout_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getLayout_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getLayout_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getLayout_Item(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getLayout_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayout_Columnminimumwidth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "columnminimumwidth",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayout_Columnstretch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "columnstretch",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayout_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayout_Rowminimumheight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rowminimumheight",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayout_Rowstretch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rowstretch",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayout_Stretch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stretch",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (layoutDefaultEClass, 
		   source, 
		   new String[] {
			 "name", "LayoutDefault",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getLayoutDefault_Margin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "margin",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayoutDefault_Spacing(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "spacing",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (layoutFunctionEClass, 
		   source, 
		   new String[] {
			 "name", "LayoutFunction",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getLayoutFunction_Margin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "margin",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayoutFunction_Spacing(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "spacing",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (layoutItemEClass, 
		   source, 
		   new String[] {
			 "name", "LayoutItem",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLayoutItem_Widget(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "widget",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayoutItem_Layout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "layout",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayoutItem_Spacer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "spacer",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayoutItem_Alignment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alignment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayoutItem_Colspan(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "colspan",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayoutItem_Column(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayoutItem_Row(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "row",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLayoutItem_Rowspan(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rowspan",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (localeEClass, 
		   source, 
		   new String[] {
			 "name", "Locale",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getLocale_Country(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "country",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLocale_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (paletteEClass, 
		   source, 
		   new String[] {
			 "name", "Palette",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPalette_Active(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "active",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPalette_Inactive(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inactive",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPalette_Disabled(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "disabled",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (pointEClass, 
		   source, 
		   new String[] {
			 "name", "Point",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPoint_X(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "x",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPoint_Y(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "y",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (pointFEClass, 
		   source, 
		   new String[] {
			 "name", "PointF",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPointF_X(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "x",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPointF_Y(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "y",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (propertiesEClass, 
		   source, 
		   new String[] {
			 "name", "Properties",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getProperties_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "name", "Property",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getProperty_Bool(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bool",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Color(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "color",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Cstring(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cstring",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Cursor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cursor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Cursorshape(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cursorshape",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Enum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "enum",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Font(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Iconset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "iconset",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Pixmap(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pixmap",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Palette(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "palette",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Point(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "point",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Rect(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rect",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Set(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Locale(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "locale",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Sizepolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sizepolicy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Size(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "size",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_String(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Stringlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stringlist",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Float(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Double(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "double",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Time(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Datetime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "datetime",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Pointf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pointf",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Rectf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rectf",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Sizef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sizef",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Longlong(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "longlong",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Char(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "char",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Url(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Uint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "uint",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Ulonglong(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulonglong",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Brush(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "brush",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Stdset(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stdset",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (propertyDataEClass, 
		   source, 
		   new String[] {
			 "name", "PropertyData",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPropertyData_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (propertySpecificationsEClass, 
		   source, 
		   new String[] {
			 "name", "PropertySpecifications",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPropertySpecifications_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getPropertySpecifications_Stringpropertyspecification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stringpropertyspecification",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (rectEClass, 
		   source, 
		   new String[] {
			 "name", "Rect",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRect_X(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "x",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRect_Y(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "y",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRect_Width(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "width",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRect_Height(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "height",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (rectFEClass, 
		   source, 
		   new String[] {
			 "name", "RectF",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRectF_X(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "x",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRectF_Y(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "y",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRectF_Width(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "width",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRectF_Height(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "height",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resourceEClass, 
		   source, 
		   new String[] {
			 "name", "Resource",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getResource_Location(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "location",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resourceIconEClass, 
		   source, 
		   new String[] {
			 "name", "ResourceIcon",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getResourceIcon_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getResourceIcon_Normaloff(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "normaloff",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceIcon_Normalon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "normalon",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceIcon_Disabledoff(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "disabledoff",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceIcon_Disabledon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "disabledon",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceIcon_Activeoff(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activeoff",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceIcon_Activeon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activeon",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceIcon_Selectedoff(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "selectedoff",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceIcon_Selectedon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "selectedon",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceIcon_Resource(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "resource",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceIcon_Theme(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "theme",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resourcePixmapEClass, 
		   source, 
		   new String[] {
			 "name", "ResourcePixmap",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getResourcePixmap_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getResourcePixmap_Alias(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alias",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourcePixmap_Resource(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "resource",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resourcesEClass, 
		   source, 
		   new String[] {
			 "name", "Resources",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getResources_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResources_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (rowEClass, 
		   source, 
		   new String[] {
			 "name", "Row",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRow_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (scriptEClass, 
		   source, 
		   new String[] {
			 "name", "Script",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getScript_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getScript_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (sizeEClass, 
		   source, 
		   new String[] {
			 "name", "Size",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSize_Width(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "width",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSize_Height(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "height",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (sizeFEClass, 
		   source, 
		   new String[] {
			 "name", "SizeF",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSizeF_Width(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "width",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSizeF_Height(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "height",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (sizePolicyEClass, 
		   source, 
		   new String[] {
			 "name", "SizePolicy",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSizePolicy_Hsizetype(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hsizetype",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSizePolicy_Vsizetype(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vsizetype",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSizePolicy_Horstretch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "horstretch",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSizePolicy_Verstretch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "verstretch",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSizePolicy_Hsizetype1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "hsizetype",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSizePolicy_Vsizetype1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vsizetype",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (sizePolicyDataEClass, 
		   source, 
		   new String[] {
			 "name", "SizePolicyData",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSizePolicyData_Hordata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hordata",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSizePolicyData_Verdata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "verdata",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (slotsEClass, 
		   source, 
		   new String[] {
			 "name", "Slots",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSlots_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getSlots_Signal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "signal",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getSlots_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "slot",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (spacerEClass, 
		   source, 
		   new String[] {
			 "name", "Spacer",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSpacer_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSpacer_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (stringEClass, 
		   source, 
		   new String[] {
			 "name", "String",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getString_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getString_Comment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getString_Extracomment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "extracomment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getString_Notr(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "notr",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (stringListEClass, 
		   source, 
		   new String[] {
			 "name", "StringList",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getStringList_String(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (stringPropertySpecificationEClass, 
		   source, 
		   new String[] {
			 "name", "StringPropertySpecification",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getStringPropertySpecification_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getStringPropertySpecification_Notr(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "notr",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getStringPropertySpecification_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tabStopsEClass, 
		   source, 
		   new String[] {
			 "name", "TabStops",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTabStops_Tabstop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tabstop",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (timeEClass, 
		   source, 
		   new String[] {
			 "name", "Time",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTime_Hour(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hour",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTime_Minute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "minute",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTime_Second(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "second",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (uiEClass, 
		   source, 
		   new String[] {
			 "name", "UI",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getUI_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Exportmacro(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exportmacro",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Widget(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "widget",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Layoutdefault(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "layoutdefault",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Layoutfunction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "layoutfunction",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Pixmapfunction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pixmapfunction",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Customwidgets(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "customwidgets",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Tabstops(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tabstops",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Images(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "images",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Includes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "includes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Resources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resources",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Connections(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connections",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Designerdata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "designerdata",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Slots(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "slots",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Buttongroups(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "buttongroups",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Displayname(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "displayname",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Stdsetdef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stdsetdef",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_StdSetDef1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stdSetDef",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUI_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (urlEClass, 
		   source, 
		   new String[] {
			 "name", "Url",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getUrl_String(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (widgetEClass, 
		   source, 
		   new String[] {
			 "name", "Widget",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getWidget_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Script(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "script",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Widgetdata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "widgetdata",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Row(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "row",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Column(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "column",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Item(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Layout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "layout",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Widget(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "widget",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Action(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "action",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Actiongroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actiongroup",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Addaction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "addaction",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Zorder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "zorder",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Class1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWidget_Native(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "native",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (widgetDataEClass, 
		   source, 
		   new String[] {
			 "name", "WidgetData",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getWidgetData_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });
	}

} //Qt48XmlschemaPackageImpl
