/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.util;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionRef;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroups;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Char;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorGroup;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorRole;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Column;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHint;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHints;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connections;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidgets;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Date;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DesignerData;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Header;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Image;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ImageData;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Images;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Include;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Includes;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutFunction;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Locale;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Point;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PointF;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Properties;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertyData;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertySpecifications;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resource;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourcePixmap;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resources;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Row;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Script;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Size;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizeF;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicyData;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Slots;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Spacer;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringList;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringPropertySpecification;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.TabStops;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Time;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Url;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.WidgetData;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage
 * @generated
 */
public class Qt48XmlschemaQwtEnhancedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Qt48XmlschemaQwtEnhancedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qt48XmlschemaQwtEnhancedSwitch() {
		if (modelPackage == null) {
			modelPackage = Qt48XmlschemaQwtEnhancedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Qt48XmlschemaQwtEnhancedPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.ACTION_GROUP: {
				ActionGroup actionGroup = (ActionGroup)theEObject;
				T result = caseActionGroup(actionGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.ACTION_REF: {
				ActionRef actionRef = (ActionRef)theEObject;
				T result = caseActionRef(actionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH: {
				Brush brush = (Brush)theEObject;
				T result = caseBrush(brush);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.BUTTON_GROUP: {
				ButtonGroup buttonGroup = (ButtonGroup)theEObject;
				T result = caseButtonGroup(buttonGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.BUTTON_GROUPS: {
				ButtonGroups buttonGroups = (ButtonGroups)theEObject;
				T result = caseButtonGroups(buttonGroups);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.CHAR: {
				Char char_ = (Char)theEObject;
				T result = caseChar(char_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.COLOR: {
				Color color = (Color)theEObject;
				T result = caseColor(color);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.COLOR_GROUP: {
				ColorGroup colorGroup = (ColorGroup)theEObject;
				T result = caseColorGroup(colorGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.COLOR_ROLE: {
				ColorRole colorRole = (ColorRole)theEObject;
				T result = caseColorRole(colorRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION_HINT: {
				ConnectionHint connectionHint = (ConnectionHint)theEObject;
				T result = caseConnectionHint(connectionHint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION_HINTS: {
				ConnectionHints connectionHints = (ConnectionHints)theEObject;
				T result = caseConnectionHints(connectionHints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTIONS: {
				Connections connections = (Connections)theEObject;
				T result = caseConnections(connections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.CUSTOM_WIDGET: {
				CustomWidget customWidget = (CustomWidget)theEObject;
				T result = caseCustomWidget(customWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.CUSTOM_WIDGETS: {
				CustomWidgets customWidgets = (CustomWidgets)theEObject;
				T result = caseCustomWidgets(customWidgets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.DESIGNER_DATA: {
				DesignerData designerData = (DesignerData)theEObject;
				T result = caseDesignerData(designerData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.FONT: {
				Font font = (Font)theEObject;
				T result = caseFont(font);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT: {
				Gradient gradient = (Gradient)theEObject;
				T result = caseGradient(gradient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT_STOP: {
				GradientStop gradientStop = (GradientStop)theEObject;
				T result = caseGradientStop(gradientStop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.IMAGE_DATA: {
				ImageData imageData = (ImageData)theEObject;
				T result = caseImageData(imageData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.IMAGES: {
				Images images = (Images)theEObject;
				T result = caseImages(images);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.INCLUDE: {
				Include include = (Include)theEObject;
				T result = caseInclude(include);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.INCLUDES: {
				Includes includes = (Includes)theEObject;
				T result = caseIncludes(includes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_DEFAULT: {
				LayoutDefault layoutDefault = (LayoutDefault)theEObject;
				T result = caseLayoutDefault(layoutDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_FUNCTION: {
				LayoutFunction layoutFunction = (LayoutFunction)theEObject;
				T result = caseLayoutFunction(layoutFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM: {
				LayoutItem layoutItem = (LayoutItem)theEObject;
				T result = caseLayoutItem(layoutItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.LOCALE: {
				Locale locale = (Locale)theEObject;
				T result = caseLocale(locale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.PALETTE: {
				Palette palette = (Palette)theEObject;
				T result = casePalette(palette);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.POINT_F: {
				PointF pointF = (PointF)theEObject;
				T result = casePointF(pointF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTIES: {
				Properties properties = (Properties)theEObject;
				T result = caseProperties(properties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY_DATA: {
				PropertyData propertyData = (PropertyData)theEObject;
				T result = casePropertyData(propertyData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY_SPECIFICATIONS: {
				PropertySpecifications propertySpecifications = (PropertySpecifications)theEObject;
				T result = casePropertySpecifications(propertySpecifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.RECT: {
				Rect rect = (Rect)theEObject;
				T result = caseRect(rect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.RECT_F: {
				RectF rectF = (RectF)theEObject;
				T result = caseRectF(rectF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.RESOURCE_ICON: {
				ResourceIcon resourceIcon = (ResourceIcon)theEObject;
				T result = caseResourceIcon(resourceIcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.RESOURCE_PIXMAP: {
				ResourcePixmap resourcePixmap = (ResourcePixmap)theEObject;
				T result = caseResourcePixmap(resourcePixmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.RESOURCES: {
				Resources resources = (Resources)theEObject;
				T result = caseResources(resources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.SCRIPT: {
				Script script = (Script)theEObject;
				T result = caseScript(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.SIZE: {
				Size size = (Size)theEObject;
				T result = caseSize(size);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_F: {
				SizeF sizeF = (SizeF)theEObject;
				T result = caseSizeF(sizeF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY: {
				SizePolicy sizePolicy = (SizePolicy)theEObject;
				T result = caseSizePolicy(sizePolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY_DATA: {
				SizePolicyData sizePolicyData = (SizePolicyData)theEObject;
				T result = caseSizePolicyData(sizePolicyData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.SLOTS: {
				Slots slots = (Slots)theEObject;
				T result = caseSlots(slots);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.SPACER: {
				Spacer spacer = (Spacer)theEObject;
				T result = caseSpacer(spacer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.STRING: {
				org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String string = (org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String)theEObject;
				T result = caseString(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.STRING_LIST: {
				StringList stringList = (StringList)theEObject;
				T result = caseStringList(stringList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.STRING_PROPERTY_SPECIFICATION: {
				StringPropertySpecification stringPropertySpecification = (StringPropertySpecification)theEObject;
				T result = caseStringPropertySpecification(stringPropertySpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.TAB_STOPS: {
				TabStops tabStops = (TabStops)theEObject;
				T result = caseTabStops(tabStops);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.UI: {
				UI ui = (UI)theEObject;
				T result = caseUI(ui);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.URL: {
				Url url = (Url)theEObject;
				T result = caseUrl(url);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET_DATA: {
				WidgetData widgetData = (WidgetData)theEObject;
				T result = caseWidgetData(widgetData);
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
	public T caseAction(Action object) {
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
	public T caseActionGroup(ActionGroup object) {
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
	public T caseActionRef(ActionRef object) {
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
	public T caseBrush(Brush object) {
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
	public T caseButtonGroup(ButtonGroup object) {
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
	public T caseButtonGroups(ButtonGroups object) {
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
	public T caseChar(Char object) {
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
	public T caseColor(Color object) {
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
	public T caseColorGroup(ColorGroup object) {
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
	public T caseColorRole(ColorRole object) {
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
	public T caseColumn(Column object) {
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
	public T caseConnection(Connection object) {
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
	public T caseConnectionHint(ConnectionHint object) {
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
	public T caseConnectionHints(ConnectionHints object) {
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
	public T caseConnections(Connections object) {
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
	public T caseCustomWidget(CustomWidget object) {
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
	public T caseCustomWidgets(CustomWidgets object) {
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
	public T caseDate(Date object) {
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
	public T caseDateTime(DateTime object) {
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
	public T caseDesignerData(DesignerData object) {
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
	public T caseDocumentRoot(DocumentRoot object) {
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
	public T caseFont(Font object) {
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
	public T caseGradient(Gradient object) {
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
	public T caseGradientStop(GradientStop object) {
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
	public T caseHeader(Header object) {
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
	public T caseImage(Image object) {
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
	public T caseImageData(ImageData object) {
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
	public T caseImages(Images object) {
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
	public T caseInclude(Include object) {
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
	public T caseIncludes(Includes object) {
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
	public T caseItem(Item object) {
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
	public T caseLayout(Layout object) {
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
	public T caseLayoutDefault(LayoutDefault object) {
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
	public T caseLayoutFunction(LayoutFunction object) {
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
	public T caseLayoutItem(LayoutItem object) {
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
	public T caseLocale(Locale object) {
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
	public T casePalette(Palette object) {
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
	public T casePoint(Point object) {
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
	public T casePointF(PointF object) {
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
	public T caseProperties(Properties object) {
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
	public T caseProperty(Property object) {
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
	public T casePropertyData(PropertyData object) {
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
	public T casePropertySpecifications(PropertySpecifications object) {
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
	public T caseRect(Rect object) {
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
	public T caseRectF(RectF object) {
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
	public T caseResource(Resource object) {
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
	public T caseResourceIcon(ResourceIcon object) {
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
	public T caseResourcePixmap(ResourcePixmap object) {
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
	public T caseResources(Resources object) {
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
	public T caseRow(Row object) {
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
	public T caseScript(Script object) {
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
	public T caseSize(Size object) {
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
	public T caseSizeF(SizeF object) {
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
	public T caseSizePolicy(SizePolicy object) {
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
	public T caseSizePolicyData(SizePolicyData object) {
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
	public T caseSlots(Slots object) {
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
	public T caseSpacer(Spacer object) {
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
	public T caseString(org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String object) {
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
	public T caseStringList(StringList object) {
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
	public T caseStringPropertySpecification(StringPropertySpecification object) {
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
	public T caseTabStops(TabStops object) {
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
	public T caseTime(Time object) {
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
	public T caseUI(UI object) {
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
	public T caseUrl(Url object) {
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
	public T caseWidget(Widget object) {
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
	public T caseWidgetData(WidgetData object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Qt48XmlschemaQwtEnhancedSwitch
