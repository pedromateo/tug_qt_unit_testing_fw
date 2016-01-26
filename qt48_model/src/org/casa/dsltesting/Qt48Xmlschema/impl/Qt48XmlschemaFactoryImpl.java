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
import org.casa.dsltesting.Qt48Xmlschema.UI;
import org.casa.dsltesting.Qt48Xmlschema.Url;
import org.casa.dsltesting.Qt48Xmlschema.Widget;
import org.casa.dsltesting.Qt48Xmlschema.WidgetData;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Qt48XmlschemaFactoryImpl extends EFactoryImpl implements Qt48XmlschemaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Qt48XmlschemaFactory init() {
		try {
			Qt48XmlschemaFactory theQt48XmlschemaFactory = (Qt48XmlschemaFactory)EPackage.Registry.INSTANCE.getEFactory(Qt48XmlschemaPackage.eNS_URI);
			if (theQt48XmlschemaFactory != null) {
				return theQt48XmlschemaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Qt48XmlschemaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qt48XmlschemaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Qt48XmlschemaPackage.ACTION: return createAction();
			case Qt48XmlschemaPackage.ACTION_GROUP: return createActionGroup();
			case Qt48XmlschemaPackage.ACTION_REF: return createActionRef();
			case Qt48XmlschemaPackage.BRUSH: return createBrush();
			case Qt48XmlschemaPackage.BUTTON_GROUP: return createButtonGroup();
			case Qt48XmlschemaPackage.BUTTON_GROUPS: return createButtonGroups();
			case Qt48XmlschemaPackage.CHAR: return createChar();
			case Qt48XmlschemaPackage.COLOR: return createColor();
			case Qt48XmlschemaPackage.COLOR_GROUP: return createColorGroup();
			case Qt48XmlschemaPackage.COLOR_ROLE: return createColorRole();
			case Qt48XmlschemaPackage.COLUMN: return createColumn();
			case Qt48XmlschemaPackage.CONNECTION: return createConnection();
			case Qt48XmlschemaPackage.CONNECTION_HINT: return createConnectionHint();
			case Qt48XmlschemaPackage.CONNECTION_HINTS: return createConnectionHints();
			case Qt48XmlschemaPackage.CONNECTIONS: return createConnections();
			case Qt48XmlschemaPackage.CUSTOM_WIDGET: return createCustomWidget();
			case Qt48XmlschemaPackage.CUSTOM_WIDGETS: return createCustomWidgets();
			case Qt48XmlschemaPackage.DATE: return createDate();
			case Qt48XmlschemaPackage.DATE_TIME: return createDateTime();
			case Qt48XmlschemaPackage.DESIGNER_DATA: return createDesignerData();
			case Qt48XmlschemaPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case Qt48XmlschemaPackage.FONT: return createFont();
			case Qt48XmlschemaPackage.GRADIENT: return createGradient();
			case Qt48XmlschemaPackage.GRADIENT_STOP: return createGradientStop();
			case Qt48XmlschemaPackage.HEADER: return createHeader();
			case Qt48XmlschemaPackage.IMAGE: return createImage();
			case Qt48XmlschemaPackage.IMAGE_DATA: return createImageData();
			case Qt48XmlschemaPackage.IMAGES: return createImages();
			case Qt48XmlschemaPackage.INCLUDE: return createInclude();
			case Qt48XmlschemaPackage.INCLUDES: return createIncludes();
			case Qt48XmlschemaPackage.ITEM: return createItem();
			case Qt48XmlschemaPackage.LAYOUT: return createLayout();
			case Qt48XmlschemaPackage.LAYOUT_DEFAULT: return createLayoutDefault();
			case Qt48XmlschemaPackage.LAYOUT_FUNCTION: return createLayoutFunction();
			case Qt48XmlschemaPackage.LAYOUT_ITEM: return createLayoutItem();
			case Qt48XmlschemaPackage.LOCALE: return createLocale();
			case Qt48XmlschemaPackage.PALETTE: return createPalette();
			case Qt48XmlschemaPackage.POINT: return createPoint();
			case Qt48XmlschemaPackage.POINT_F: return createPointF();
			case Qt48XmlschemaPackage.PROPERTIES: return createProperties();
			case Qt48XmlschemaPackage.PROPERTY: return createProperty();
			case Qt48XmlschemaPackage.PROPERTY_DATA: return createPropertyData();
			case Qt48XmlschemaPackage.PROPERTY_SPECIFICATIONS: return createPropertySpecifications();
			case Qt48XmlschemaPackage.RECT: return createRect();
			case Qt48XmlschemaPackage.RECT_F: return createRectF();
			case Qt48XmlschemaPackage.RESOURCE: return createResource();
			case Qt48XmlschemaPackage.RESOURCE_ICON: return createResourceIcon();
			case Qt48XmlschemaPackage.RESOURCE_PIXMAP: return createResourcePixmap();
			case Qt48XmlschemaPackage.RESOURCES: return createResources();
			case Qt48XmlschemaPackage.ROW: return createRow();
			case Qt48XmlschemaPackage.SCRIPT: return createScript();
			case Qt48XmlschemaPackage.SIZE: return createSize();
			case Qt48XmlschemaPackage.SIZE_F: return createSizeF();
			case Qt48XmlschemaPackage.SIZE_POLICY: return createSizePolicy();
			case Qt48XmlschemaPackage.SIZE_POLICY_DATA: return createSizePolicyData();
			case Qt48XmlschemaPackage.SLOTS: return createSlots();
			case Qt48XmlschemaPackage.SPACER: return createSpacer();
			case Qt48XmlschemaPackage.STRING: return createString();
			case Qt48XmlschemaPackage.STRING_LIST: return createStringList();
			case Qt48XmlschemaPackage.STRING_PROPERTY_SPECIFICATION: return createStringPropertySpecification();
			case Qt48XmlschemaPackage.TAB_STOPS: return createTabStops();
			case Qt48XmlschemaPackage.TIME: return createTime();
			case Qt48XmlschemaPackage.UI: return createUI();
			case Qt48XmlschemaPackage.URL: return createUrl();
			case Qt48XmlschemaPackage.WIDGET: return createWidget();
			case Qt48XmlschemaPackage.WIDGET_DATA: return createWidgetData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroup createActionGroup() {
		ActionGroupImpl actionGroup = new ActionGroupImpl();
		return actionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRef createActionRef() {
		ActionRefImpl actionRef = new ActionRefImpl();
		return actionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brush createBrush() {
		BrushImpl brush = new BrushImpl();
		return brush;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonGroup createButtonGroup() {
		ButtonGroupImpl buttonGroup = new ButtonGroupImpl();
		return buttonGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonGroups createButtonGroups() {
		ButtonGroupsImpl buttonGroups = new ButtonGroupsImpl();
		return buttonGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Char createChar() {
		CharImpl char_ = new CharImpl();
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColor() {
		ColorImpl color = new ColorImpl();
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorGroup createColorGroup() {
		ColorGroupImpl colorGroup = new ColorGroupImpl();
		return colorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorRole createColorRole() {
		ColorRoleImpl colorRole = new ColorRoleImpl();
		return colorRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionHint createConnectionHint() {
		ConnectionHintImpl connectionHint = new ConnectionHintImpl();
		return connectionHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionHints createConnectionHints() {
		ConnectionHintsImpl connectionHints = new ConnectionHintsImpl();
		return connectionHints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connections createConnections() {
		ConnectionsImpl connections = new ConnectionsImpl();
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomWidget createCustomWidget() {
		CustomWidgetImpl customWidget = new CustomWidgetImpl();
		return customWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomWidgets createCustomWidgets() {
		CustomWidgetsImpl customWidgets = new CustomWidgetsImpl();
		return customWidgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignerData createDesignerData() {
		DesignerDataImpl designerData = new DesignerDataImpl();
		return designerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font createFont() {
		FontImpl font = new FontImpl();
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gradient createGradient() {
		GradientImpl gradient = new GradientImpl();
		return gradient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientStop createGradientStop() {
		GradientStopImpl gradientStop = new GradientStopImpl();
		return gradientStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageData createImageData() {
		ImageDataImpl imageData = new ImageDataImpl();
		return imageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Images createImages() {
		ImagesImpl images = new ImagesImpl();
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Includes createIncludes() {
		IncludesImpl includes = new IncludesImpl();
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutDefault createLayoutDefault() {
		LayoutDefaultImpl layoutDefault = new LayoutDefaultImpl();
		return layoutDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutFunction createLayoutFunction() {
		LayoutFunctionImpl layoutFunction = new LayoutFunctionImpl();
		return layoutFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutItem createLayoutItem() {
		LayoutItemImpl layoutItem = new LayoutItemImpl();
		return layoutItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locale createLocale() {
		LocaleImpl locale = new LocaleImpl();
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette createPalette() {
		PaletteImpl palette = new PaletteImpl();
		return palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointF createPointF() {
		PointFImpl pointF = new PointFImpl();
		return pointF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyData createPropertyData() {
		PropertyDataImpl propertyData = new PropertyDataImpl();
		return propertyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertySpecifications createPropertySpecifications() {
		PropertySpecificationsImpl propertySpecifications = new PropertySpecificationsImpl();
		return propertySpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rect createRect() {
		RectImpl rect = new RectImpl();
		return rect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectF createRectF() {
		RectFImpl rectF = new RectFImpl();
		return rectF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceIcon createResourceIcon() {
		ResourceIconImpl resourceIcon = new ResourceIconImpl();
		return resourceIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePixmap createResourcePixmap() {
		ResourcePixmapImpl resourcePixmap = new ResourcePixmapImpl();
		return resourcePixmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resources createResources() {
		ResourcesImpl resources = new ResourcesImpl();
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSize() {
		SizeImpl size = new SizeImpl();
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeF createSizeF() {
		SizeFImpl sizeF = new SizeFImpl();
		return sizeF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizePolicy createSizePolicy() {
		SizePolicyImpl sizePolicy = new SizePolicyImpl();
		return sizePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizePolicyData createSizePolicyData() {
		SizePolicyDataImpl sizePolicyData = new SizePolicyDataImpl();
		return sizePolicyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slots createSlots() {
		SlotsImpl slots = new SlotsImpl();
		return slots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spacer createSpacer() {
		SpacerImpl spacer = new SpacerImpl();
		return spacer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.casa.dsltesting.Qt48Xmlschema.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringList createStringList() {
		StringListImpl stringList = new StringListImpl();
		return stringList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPropertySpecification createStringPropertySpecification() {
		StringPropertySpecificationImpl stringPropertySpecification = new StringPropertySpecificationImpl();
		return stringPropertySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabStops createTabStops() {
		TabStopsImpl tabStops = new TabStopsImpl();
		return tabStops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI createUI() {
		UIImpl ui = new UIImpl();
		return ui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url createUrl() {
		UrlImpl url = new UrlImpl();
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetData createWidgetData() {
		WidgetDataImpl widgetData = new WidgetDataImpl();
		return widgetData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qt48XmlschemaPackage getQt48XmlschemaPackage() {
		return (Qt48XmlschemaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static Qt48XmlschemaPackage getPackage() {
		return Qt48XmlschemaPackage.eINSTANCE;
	}

} //Qt48XmlschemaFactoryImpl
