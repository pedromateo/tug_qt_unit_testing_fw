/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface Qt48XmlschemaQwtEnhancedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Qt48XmlschemaQwtEnhanced";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/qt48_model/qt48_xmlschema_qwt_enhanced.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Qt48XmlschemaQwtEnhanced";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Qt48XmlschemaQwtEnhancedPackage eINSTANCE = org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__MENU = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 4;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionGroupImpl <em>Action Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionGroupImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getActionGroup()
	 * @generated
	 */
	int ACTION_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Actiongroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__ACTIONGROUP = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__NAME = 5;

	/**
	 * The number of structural features of the '<em>Action Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Action Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionRefImpl <em>Action Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionRefImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getActionRef()
	 * @generated
	 */
	int ACTION_REF = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF__NAME = 0;

	/**
	 * The number of structural features of the '<em>Action Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.BrushImpl <em>Brush</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.BrushImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getBrush()
	 * @generated
	 */
	int BRUSH = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRUSH__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRUSH__TEXTURE = 1;

	/**
	 * The feature id for the '<em><b>Gradient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRUSH__GRADIENT = 2;

	/**
	 * The feature id for the '<em><b>Brushstyle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRUSH__BRUSHSTYLE = 3;

	/**
	 * The number of structural features of the '<em>Brush</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRUSH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Brush</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRUSH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ButtonGroupImpl <em>Button Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ButtonGroupImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getButtonGroup()
	 * @generated
	 */
	int BUTTON_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__NAME = 3;

	/**
	 * The number of structural features of the '<em>Button Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Button Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ButtonGroupsImpl <em>Button Groups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ButtonGroupsImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getButtonGroups()
	 * @generated
	 */
	int BUTTON_GROUPS = 5;

	/**
	 * The feature id for the '<em><b>Buttongroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUPS__BUTTONGROUP = 0;

	/**
	 * The number of structural features of the '<em>Button Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUPS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Button Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.CharImpl <em>Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.CharImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getChar()
	 * @generated
	 */
	int CHAR = 6;

	/**
	 * The feature id for the '<em><b>Unicode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR__UNICODE = 0;

	/**
	 * The number of structural features of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColorImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 7;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__RED = 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__GREEN = 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__BLUE = 2;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__ALPHA = 3;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColorGroupImpl <em>Color Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColorGroupImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getColorGroup()
	 * @generated
	 */
	int COLOR_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_GROUP__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Colorrole</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_GROUP__COLORROLE = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_GROUP__COLOR = 2;

	/**
	 * The number of structural features of the '<em>Color Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Color Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColorRoleImpl <em>Color Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColorRoleImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getColorRole()
	 * @generated
	 */
	int COLOR_ROLE = 9;

	/**
	 * The feature id for the '<em><b>Brush</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ROLE__BRUSH = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ROLE__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Color Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Color Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColumnImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 10;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 11;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SENDER = 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SIGNAL = 1;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__RECEIVER = 2;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SLOT = 3;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__HINTS = 4;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionHintImpl <em>Connection Hint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionHintImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getConnectionHint()
	 * @generated
	 */
	int CONNECTION_HINT = 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_HINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_HINT__Y = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_HINT__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Connection Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_HINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_HINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionHintsImpl <em>Connection Hints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionHintsImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getConnectionHints()
	 * @generated
	 */
	int CONNECTION_HINTS = 13;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_HINTS__HINT = 0;

	/**
	 * The number of structural features of the '<em>Connection Hints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_HINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connection Hints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_HINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionsImpl <em>Connections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionsImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getConnections()
	 * @generated
	 */
	int CONNECTIONS = 14;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS__CONNECTION = 0;

	/**
	 * The number of structural features of the '<em>Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.CustomWidgetImpl <em>Custom Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.CustomWidgetImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getCustomWidget()
	 * @generated
	 */
	int CUSTOM_WIDGET = 15;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__EXTENDS = 1;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__HEADER = 2;

	/**
	 * The feature id for the '<em><b>Sizehint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__SIZEHINT = 3;

	/**
	 * The feature id for the '<em><b>Addpagemethod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__ADDPAGEMETHOD = 4;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Sizepolicy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__SIZEPOLICY = 6;

	/**
	 * The feature id for the '<em><b>Pixmap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__PIXMAP = 7;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__SCRIPT = 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__PROPERTIES = 9;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__SLOTS = 10;

	/**
	 * The feature id for the '<em><b>Propertyspecifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET__PROPERTYSPECIFICATIONS = 11;

	/**
	 * The number of structural features of the '<em>Custom Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Custom Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.CustomWidgetsImpl <em>Custom Widgets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.CustomWidgetsImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getCustomWidgets()
	 * @generated
	 */
	int CUSTOM_WIDGETS = 16;

	/**
	 * The feature id for the '<em><b>Customwidget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGETS__CUSTOMWIDGET = 0;

	/**
	 * The number of structural features of the '<em>Custom Widgets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGETS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Custom Widgets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_WIDGETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DateImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 17;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MONTH = 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DAY = 2;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DateTimeImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 18;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__HOUR = 0;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__MINUTE = 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__SECOND = 2;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__YEAR = 3;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__MONTH = 4;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__DAY = 5;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DesignerDataImpl <em>Designer Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DesignerDataImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getDesignerData()
	 * @generated
	 */
	int DESIGNER_DATA = 19;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNER_DATA__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Designer Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNER_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Designer Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNER_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DocumentRootImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Ui</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UI = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl <em>Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getFont()
	 * @generated
	 */
	int FONT = 21;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__FAMILY = 0;

	/**
	 * The feature id for the '<em><b>Pointsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__POINTSIZE = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__ITALIC = 3;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__BOLD = 4;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__UNDERLINE = 5;

	/**
	 * The feature id for the '<em><b>Strikeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__STRIKEOUT = 6;

	/**
	 * The feature id for the '<em><b>Antialiasing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__ANTIALIASING = 7;

	/**
	 * The feature id for the '<em><b>Stylestrategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__STYLESTRATEGY = 8;

	/**
	 * The feature id for the '<em><b>Kerning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__KERNING = 9;

	/**
	 * The number of structural features of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl <em>Gradient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getGradient()
	 * @generated
	 */
	int GRADIENT = 22;

	/**
	 * The feature id for the '<em><b>Gradient Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__GRADIENT_STOP = 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__ANGLE = 1;

	/**
	 * The feature id for the '<em><b>Centralx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__CENTRALX = 2;

	/**
	 * The feature id for the '<em><b>Centraly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__CENTRALY = 3;

	/**
	 * The feature id for the '<em><b>Coordinatemode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__COORDINATEMODE = 4;

	/**
	 * The feature id for the '<em><b>Endx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__ENDX = 5;

	/**
	 * The feature id for the '<em><b>Endy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__ENDY = 6;

	/**
	 * The feature id for the '<em><b>Focalx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__FOCALX = 7;

	/**
	 * The feature id for the '<em><b>Focaly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__FOCALY = 8;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__RADIUS = 9;

	/**
	 * The feature id for the '<em><b>Spread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__SPREAD = 10;

	/**
	 * The feature id for the '<em><b>Startx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__STARTX = 11;

	/**
	 * The feature id for the '<em><b>Starty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__STARTY = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT__TYPE = 13;

	/**
	 * The number of structural features of the '<em>Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientStopImpl <em>Gradient Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientStopImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getGradientStop()
	 * @generated
	 */
	int GRADIENT_STOP = 23;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_STOP__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_STOP__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Gradient Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_STOP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gradient Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_STOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.HeaderImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ImageImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 25;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DATA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ImageDataImpl <em>Image Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ImageDataImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getImageData()
	 * @generated
	 */
	int IMAGE_DATA = 26;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA__LENGTH = 2;

	/**
	 * The number of structural features of the '<em>Image Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Image Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ImagesImpl <em>Images</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ImagesImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getImages()
	 * @generated
	 */
	int IMAGES = 27;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES__IMAGE = 0;

	/**
	 * The number of structural features of the '<em>Images</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Images</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.IncludeImpl <em>Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.IncludeImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getInclude()
	 * @generated
	 */
	int INCLUDE = 28;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Impldecl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__IMPLDECL = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.IncludesImpl <em>Includes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.IncludesImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getIncludes()
	 * @generated
	 */
	int INCLUDES = 29;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES__INCLUDE = 0;

	/**
	 * The number of structural features of the '<em>Includes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Includes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ItemImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 30;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEM = 2;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ROW = 4;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 31;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ITEM = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Columnminimumwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__COLUMNMINIMUMWIDTH = 5;

	/**
	 * The feature id for the '<em><b>Columnstretch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__COLUMNSTRETCH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NAME = 7;

	/**
	 * The feature id for the '<em><b>Rowminimumheight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ROWMINIMUMHEIGHT = 8;

	/**
	 * The feature id for the '<em><b>Rowstretch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ROWSTRETCH = 9;

	/**
	 * The feature id for the '<em><b>Stretch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__STRETCH = 10;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutDefaultImpl <em>Layout Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutDefaultImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getLayoutDefault()
	 * @generated
	 */
	int LAYOUT_DEFAULT = 32;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DEFAULT__MARGIN = 0;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DEFAULT__SPACING = 1;

	/**
	 * The number of structural features of the '<em>Layout Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DEFAULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Layout Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DEFAULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutFunctionImpl <em>Layout Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutFunctionImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getLayoutFunction()
	 * @generated
	 */
	int LAYOUT_FUNCTION = 33;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FUNCTION__MARGIN = 0;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FUNCTION__SPACING = 1;

	/**
	 * The number of structural features of the '<em>Layout Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Layout Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutItemImpl <em>Layout Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutItemImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getLayoutItem()
	 * @generated
	 */
	int LAYOUT_ITEM = 34;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ITEM__WIDGET = 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ITEM__LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Spacer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ITEM__SPACER = 2;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ITEM__ALIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ITEM__COLSPAN = 4;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ITEM__COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ITEM__ROW = 6;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ITEM__ROWSPAN = 7;

	/**
	 * The number of structural features of the '<em>Layout Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ITEM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Layout Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LocaleImpl <em>Locale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LocaleImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getLocale()
	 * @generated
	 */
	int LOCALE = 35;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE__COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>Locale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Locale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PaletteImpl <em>Palette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PaletteImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getPalette()
	 * @generated
	 */
	int PALETTE = 36;

	/**
	 * The feature id for the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Inactive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__INACTIVE = 1;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__DISABLED = 2;

	/**
	 * The number of structural features of the '<em>Palette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Palette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PointImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 37;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PointFImpl <em>Point F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PointFImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getPointF()
	 * @generated
	 */
	int POINT_F = 38;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_F__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_F__Y = 1;

	/**
	 * The number of structural features of the '<em>Point F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_F_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_F_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertiesImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 39;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 40;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__BOOL = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Cstring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CSTRING = 2;

	/**
	 * The feature id for the '<em><b>Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CURSOR = 3;

	/**
	 * The feature id for the '<em><b>Cursorshape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CURSORSHAPE = 4;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ENUM = 5;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FONT = 6;

	/**
	 * The feature id for the '<em><b>Iconset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ICONSET = 7;

	/**
	 * The feature id for the '<em><b>Pixmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PIXMAP = 8;

	/**
	 * The feature id for the '<em><b>Palette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PALETTE = 9;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__POINT = 10;

	/**
	 * The feature id for the '<em><b>Rect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RECT = 11;

	/**
	 * The feature id for the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SET = 12;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOCALE = 13;

	/**
	 * The feature id for the '<em><b>Sizepolicy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SIZEPOLICY = 14;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SIZE = 15;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__STRING = 16;

	/**
	 * The feature id for the '<em><b>Stringlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__STRINGLIST = 17;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NUMBER = 18;

	/**
	 * The feature id for the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FLOAT = 19;

	/**
	 * The feature id for the '<em><b>Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DOUBLE = 20;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATE = 21;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TIME = 22;

	/**
	 * The feature id for the '<em><b>Datetime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATETIME = 23;

	/**
	 * The feature id for the '<em><b>Pointf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__POINTF = 24;

	/**
	 * The feature id for the '<em><b>Rectf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RECTF = 25;

	/**
	 * The feature id for the '<em><b>Sizef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SIZEF = 26;

	/**
	 * The feature id for the '<em><b>Longlong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LONGLONG = 27;

	/**
	 * The feature id for the '<em><b>Char</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CHAR = 28;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__URL = 29;

	/**
	 * The feature id for the '<em><b>Uint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UINT = 30;

	/**
	 * The feature id for the '<em><b>UInt1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UINT1 = 31;

	/**
	 * The feature id for the '<em><b>Ulonglong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ULONGLONG = 32;

	/**
	 * The feature id for the '<em><b>Brush</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__BRUSH = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 34;

	/**
	 * The feature id for the '<em><b>Stdset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__STDSET = 35;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 36;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyDataImpl <em>Property Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyDataImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getPropertyData()
	 * @generated
	 */
	int PROPERTY_DATA = 41;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DATA__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Property Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertySpecificationsImpl <em>Property Specifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertySpecificationsImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getPropertySpecifications()
	 * @generated
	 */
	int PROPERTY_SPECIFICATIONS = 42;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPECIFICATIONS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Stringpropertyspecification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPECIFICATIONS__STRINGPROPERTYSPECIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Property Specifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPECIFICATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Specifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPECIFICATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.RectImpl <em>Rect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.RectImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getRect()
	 * @generated
	 */
	int RECT = 43;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Rect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.RectFImpl <em>Rect F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.RectFImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getRectF()
	 * @generated
	 */
	int RECT_F = 44;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_F__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_F__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_F__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_F__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Rect F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_F_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rect F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_F_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourceImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 45;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourceIconImpl <em>Resource Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourceIconImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getResourceIcon()
	 * @generated
	 */
	int RESOURCE_ICON = 46;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ICON__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Normaloff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ICON__NORMALOFF = 1;

	/**
	 * The feature id for the '<em><b>Normalon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ICON__NORMALON = 2;

	/**
	 * The feature id for the '<em><b>Disabledoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ICON__DISABLEDOFF = 3;

	/**
	 * The feature id for the '<em><b>Disabledon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ICON__DISABLEDON = 4;

	/**
	 * The feature id for the '<em><b>Activeoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ICON__ACTIVEOFF = 5;

	/**
	 * The feature id for the '<em><b>Activeon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ICON__ACTIVEON = 6;

	/**
	 * The feature id for the '<em><b>Selectedoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ICON__SELECTEDOFF = 7;

	/**
	 * The feature id for the '<em><b>Selectedon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ICON__SELECTEDON = 8;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ICON__RESOURCE = 9;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ICON__THEME = 10;

	/**
	 * The number of structural features of the '<em>Resource Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ICON_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Resource Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ICON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourcePixmapImpl <em>Resource Pixmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourcePixmapImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getResourcePixmap()
	 * @generated
	 */
	int RESOURCE_PIXMAP = 47;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PIXMAP__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PIXMAP__ALIAS = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PIXMAP__RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>Resource Pixmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PIXMAP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Pixmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PIXMAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourcesImpl <em>Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourcesImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getResources()
	 * @generated
	 */
	int RESOURCES = 48;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__INCLUDE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__NAME = 1;

	/**
	 * The number of structural features of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.RowImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 49;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ScriptImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 50;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizeImpl <em>Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizeImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 51;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__HEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizeFImpl <em>Size F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizeFImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getSizeF()
	 * @generated
	 */
	int SIZE_F = 52;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_F__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_F__HEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Size F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_F_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Size F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_F_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyImpl <em>Size Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getSizePolicy()
	 * @generated
	 */
	int SIZE_POLICY = 53;

	/**
	 * The feature id for the '<em><b>Hsizetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_POLICY__HSIZETYPE = 0;

	/**
	 * The feature id for the '<em><b>Vsizetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_POLICY__VSIZETYPE = 1;

	/**
	 * The feature id for the '<em><b>Horstretch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_POLICY__HORSTRETCH = 2;

	/**
	 * The feature id for the '<em><b>Verstretch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_POLICY__VERSTRETCH = 3;

	/**
	 * The feature id for the '<em><b>Hsizetype1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_POLICY__HSIZETYPE1 = 4;

	/**
	 * The feature id for the '<em><b>Vsizetype1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_POLICY__VSIZETYPE1 = 5;

	/**
	 * The number of structural features of the '<em>Size Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_POLICY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Size Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyDataImpl <em>Size Policy Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyDataImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getSizePolicyData()
	 * @generated
	 */
	int SIZE_POLICY_DATA = 54;

	/**
	 * The feature id for the '<em><b>Hordata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_POLICY_DATA__HORDATA = 0;

	/**
	 * The feature id for the '<em><b>Verdata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_POLICY_DATA__VERDATA = 1;

	/**
	 * The number of structural features of the '<em>Size Policy Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_POLICY_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Size Policy Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_POLICY_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SlotsImpl <em>Slots</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SlotsImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getSlots()
	 * @generated
	 */
	int SLOTS = 55;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOTS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOTS__SIGNAL = 1;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOTS__SLOT = 2;

	/**
	 * The number of structural features of the '<em>Slots</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Slots</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SpacerImpl <em>Spacer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SpacerImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getSpacer()
	 * @generated
	 */
	int SPACER = 56;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACER__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Spacer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Spacer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.StringImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getString()
	 * @generated
	 */
	int STRING = 57;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Extracomment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__EXTRACOMMENT = 2;

	/**
	 * The feature id for the '<em><b>Notr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__NOTR = 3;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.StringListImpl <em>String List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.StringListImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getStringList()
	 * @generated
	 */
	int STRING_LIST = 58;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIST__STRING = 0;

	/**
	 * The number of structural features of the '<em>String List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>String List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.StringPropertySpecificationImpl <em>String Property Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.StringPropertySpecificationImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getStringPropertySpecification()
	 * @generated
	 */
	int STRING_PROPERTY_SPECIFICATION = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Notr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY_SPECIFICATION__NOTR = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY_SPECIFICATION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>String Property Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>String Property Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.TabStopsImpl <em>Tab Stops</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.TabStopsImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getTabStops()
	 * @generated
	 */
	int TAB_STOPS = 60;

	/**
	 * The feature id for the '<em><b>Tabstop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOPS__TABSTOP = 0;

	/**
	 * The number of structural features of the '<em>Tab Stops</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOPS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tab Stops</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_STOPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.TimeImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 61;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__HOUR = 0;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__MINUTE = 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__SECOND = 2;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.UIImpl <em>UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.UIImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getUI()
	 * @generated
	 */
	int UI = 62;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Exportmacro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__EXPORTMACRO = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__WIDGET = 4;

	/**
	 * The feature id for the '<em><b>Layoutdefault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__LAYOUTDEFAULT = 5;

	/**
	 * The feature id for the '<em><b>Layoutfunction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__LAYOUTFUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Pixmapfunction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__PIXMAPFUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Customwidgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__CUSTOMWIDGETS = 8;

	/**
	 * The feature id for the '<em><b>Tabstops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__TABSTOPS = 9;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__IMAGES = 10;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__INCLUDES = 11;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__RESOURCES = 12;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__CONNECTIONS = 13;

	/**
	 * The feature id for the '<em><b>Designerdata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__DESIGNERDATA = 14;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__SLOTS = 15;

	/**
	 * The feature id for the '<em><b>Buttongroups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__BUTTONGROUPS = 16;

	/**
	 * The feature id for the '<em><b>Displayname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__DISPLAYNAME = 17;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__LANGUAGE = 18;

	/**
	 * The feature id for the '<em><b>Stdsetdef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__STDSETDEF = 19;

	/**
	 * The feature id for the '<em><b>Std Set Def1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__STD_SET_DEF1 = 20;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__VERSION = 21;

	/**
	 * The number of structural features of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.UrlImpl <em>Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.UrlImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getUrl()
	 * @generated
	 */
	int URL = 63;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__STRING = 0;

	/**
	 * The number of structural features of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 64;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__SCRIPT = 2;

	/**
	 * The feature id for the '<em><b>Widgetdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDGETDATA = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ROW = 5;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__COLUMN = 6;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ITEM = 7;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LAYOUT = 8;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDGET = 9;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ACTION = 10;

	/**
	 * The feature id for the '<em><b>Actiongroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ACTIONGROUP = 11;

	/**
	 * The feature id for the '<em><b>Addaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ADDACTION = 12;

	/**
	 * The feature id for the '<em><b>Zorder</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ZORDER = 13;

	/**
	 * The feature id for the '<em><b>Class1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__CLASS1 = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = 15;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NATIVE = 16;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetDataImpl <em>Widget Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetDataImpl
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getWidgetData()
	 * @generated
	 */
	int WIDGET_DATA = 65;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATA__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Widget Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Widget Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action#getGroup()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action#getProperty()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action#getAttribute()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menu</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action#getMenu()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Menu();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Group</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup
	 * @generated
	 */
	EClass getActionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup#getGroup()
	 * @see #getActionGroup()
	 * @generated
	 */
	EAttribute getActionGroup_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup#getAction()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup#getActiongroup <em>Actiongroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actiongroup</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup#getActiongroup()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_Actiongroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup#getProperty()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup#getAttribute()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup#getName()
	 * @see #getActionGroup()
	 * @generated
	 */
	EAttribute getActionGroup_Name();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionRef <em>Action Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Ref</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionRef
	 * @generated
	 */
	EClass getActionRef();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionRef#getName()
	 * @see #getActionRef()
	 * @generated
	 */
	EAttribute getActionRef_Name();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush <em>Brush</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brush</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush
	 * @generated
	 */
	EClass getBrush();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush#getColor()
	 * @see #getBrush()
	 * @generated
	 */
	EReference getBrush_Color();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Texture</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush#getTexture()
	 * @see #getBrush()
	 * @generated
	 */
	EReference getBrush_Texture();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush#getGradient <em>Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gradient</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush#getGradient()
	 * @see #getBrush()
	 * @generated
	 */
	EReference getBrush_Gradient();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush#getBrushstyle <em>Brushstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brushstyle</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush#getBrushstyle()
	 * @see #getBrush()
	 * @generated
	 */
	EAttribute getBrush_Brushstyle();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup <em>Button Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Group</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup
	 * @generated
	 */
	EClass getButtonGroup();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup#getGroup()
	 * @see #getButtonGroup()
	 * @generated
	 */
	EAttribute getButtonGroup_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup#getProperty()
	 * @see #getButtonGroup()
	 * @generated
	 */
	EReference getButtonGroup_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup#getAttribute()
	 * @see #getButtonGroup()
	 * @generated
	 */
	EReference getButtonGroup_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup#getName()
	 * @see #getButtonGroup()
	 * @generated
	 */
	EAttribute getButtonGroup_Name();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroups <em>Button Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Groups</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroups
	 * @generated
	 */
	EClass getButtonGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroups#getButtongroup <em>Buttongroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buttongroup</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroups#getButtongroup()
	 * @see #getButtonGroups()
	 * @generated
	 */
	EReference getButtonGroups_Buttongroup();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Char
	 * @generated
	 */
	EClass getChar();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Char#getUnicode <em>Unicode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unicode</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Char#getUnicode()
	 * @see #getChar()
	 * @generated
	 */
	EAttribute getChar_Unicode();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color#getRed()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color#getGreen()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color#getBlue()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Blue();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color#getAlpha()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Alpha();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorGroup <em>Color Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Group</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorGroup
	 * @generated
	 */
	EClass getColorGroup();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorGroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorGroup#getGroup()
	 * @see #getColorGroup()
	 * @generated
	 */
	EAttribute getColorGroup_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorGroup#getColorrole <em>Colorrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colorrole</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorGroup#getColorrole()
	 * @see #getColorGroup()
	 * @generated
	 */
	EReference getColorGroup_Colorrole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorGroup#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Color</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorGroup#getColor()
	 * @see #getColorGroup()
	 * @generated
	 */
	EReference getColorGroup_Color();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorRole <em>Color Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Role</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorRole
	 * @generated
	 */
	EClass getColorRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorRole#getBrush <em>Brush</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Brush</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorRole#getBrush()
	 * @see #getColorRole()
	 * @generated
	 */
	EReference getColorRole_Brush();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorRole#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorRole#getRole()
	 * @see #getColorRole()
	 * @generated
	 */
	EAttribute getColorRole_Role();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Column#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Column#getProperty()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Property();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sender</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection#getSender()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Sender();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection#getSignal()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Signal();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection#getReceiver()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Receiver();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slot</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection#getSlot()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Slot();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection#getHints <em>Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hints</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection#getHints()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Hints();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHint <em>Connection Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Hint</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHint
	 * @generated
	 */
	EClass getConnectionHint();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHint#getX()
	 * @see #getConnectionHint()
	 * @generated
	 */
	EAttribute getConnectionHint_X();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHint#getY()
	 * @see #getConnectionHint()
	 * @generated
	 */
	EAttribute getConnectionHint_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHint#getType()
	 * @see #getConnectionHint()
	 * @generated
	 */
	EAttribute getConnectionHint_Type();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHints <em>Connection Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Hints</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHints
	 * @generated
	 */
	EClass getConnectionHints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHints#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hint</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHints#getHint()
	 * @see #getConnectionHints()
	 * @generated
	 */
	EReference getConnectionHints_Hint();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connections</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connections
	 * @generated
	 */
	EClass getConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connections#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connections#getConnection()
	 * @see #getConnections()
	 * @generated
	 */
	EReference getConnections_Connection();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget <em>Custom Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Widget</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget
	 * @generated
	 */
	EClass getCustomWidget();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getClass_()
	 * @see #getCustomWidget()
	 * @generated
	 */
	EAttribute getCustomWidget_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getExtends()
	 * @see #getCustomWidget()
	 * @generated
	 */
	EAttribute getCustomWidget_Extends();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getHeader()
	 * @see #getCustomWidget()
	 * @generated
	 */
	EReference getCustomWidget_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getSizehint <em>Sizehint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sizehint</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getSizehint()
	 * @see #getCustomWidget()
	 * @generated
	 */
	EReference getCustomWidget_Sizehint();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getAddpagemethod <em>Addpagemethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addpagemethod</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getAddpagemethod()
	 * @see #getCustomWidget()
	 * @generated
	 */
	EAttribute getCustomWidget_Addpagemethod();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getContainer()
	 * @see #getCustomWidget()
	 * @generated
	 */
	EAttribute getCustomWidget_Container();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getSizepolicy <em>Sizepolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sizepolicy</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getSizepolicy()
	 * @see #getCustomWidget()
	 * @generated
	 */
	EReference getCustomWidget_Sizepolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getPixmap <em>Pixmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pixmap</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getPixmap()
	 * @see #getCustomWidget()
	 * @generated
	 */
	EAttribute getCustomWidget_Pixmap();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getScript()
	 * @see #getCustomWidget()
	 * @generated
	 */
	EReference getCustomWidget_Script();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getProperties()
	 * @see #getCustomWidget()
	 * @generated
	 */
	EReference getCustomWidget_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slots</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getSlots()
	 * @see #getCustomWidget()
	 * @generated
	 */
	EReference getCustomWidget_Slots();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getPropertyspecifications <em>Propertyspecifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Propertyspecifications</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget#getPropertyspecifications()
	 * @see #getCustomWidget()
	 * @generated
	 */
	EReference getCustomWidget_Propertyspecifications();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidgets <em>Custom Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Widgets</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidgets
	 * @generated
	 */
	EClass getCustomWidgets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidgets#getCustomwidget <em>Customwidget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customwidget</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidgets#getCustomwidget()
	 * @see #getCustomWidgets()
	 * @generated
	 */
	EReference getCustomWidgets_Customwidget();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Date#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Date#getYear()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Year();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Date#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Date#getMonth()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Month();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Date#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Date#getDay()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Day();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime#getHour()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Hour();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime#getMinute()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Minute();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime#getSecond()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Second();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime#getYear()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Year();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime#getMonth()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Month();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime#getDay()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Day();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DesignerData <em>Designer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Designer Data</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DesignerData
	 * @generated
	 */
	EClass getDesignerData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DesignerData#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DesignerData#getProperty()
	 * @see #getDesignerData()
	 * @generated
	 */
	EReference getDesignerData_Property();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot#getUi <em>Ui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ui</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot#getUi()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ui();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font
	 * @generated
	 */
	EClass getFont();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#getFamily()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Family();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#getPointsize <em>Pointsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pointsize</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#getPointsize()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Pointsize();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#getWeight()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Weight();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#isItalic()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Italic();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#isBold()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Bold();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#isUnderline <em>Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#isUnderline()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Underline();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#isStrikeout <em>Strikeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strikeout</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#isStrikeout()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Strikeout();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#isAntialiasing <em>Antialiasing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antialiasing</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#isAntialiasing()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Antialiasing();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#getStylestrategy <em>Stylestrategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stylestrategy</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#getStylestrategy()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Stylestrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#isKerning <em>Kerning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kerning</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font#isKerning()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Kerning();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient <em>Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradient</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient
	 * @generated
	 */
	EClass getGradient();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getGradientStop <em>Gradient Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gradient Stop</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getGradientStop()
	 * @see #getGradient()
	 * @generated
	 */
	EReference getGradient_GradientStop();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getAngle()
	 * @see #getGradient()
	 * @generated
	 */
	EAttribute getGradient_Angle();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getCentralx <em>Centralx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Centralx</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getCentralx()
	 * @see #getGradient()
	 * @generated
	 */
	EAttribute getGradient_Centralx();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getCentraly <em>Centraly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Centraly</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getCentraly()
	 * @see #getGradient()
	 * @generated
	 */
	EAttribute getGradient_Centraly();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getCoordinatemode <em>Coordinatemode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinatemode</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getCoordinatemode()
	 * @see #getGradient()
	 * @generated
	 */
	EAttribute getGradient_Coordinatemode();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getEndx <em>Endx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endx</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getEndx()
	 * @see #getGradient()
	 * @generated
	 */
	EAttribute getGradient_Endx();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getEndy <em>Endy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endy</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getEndy()
	 * @see #getGradient()
	 * @generated
	 */
	EAttribute getGradient_Endy();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getFocalx <em>Focalx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focalx</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getFocalx()
	 * @see #getGradient()
	 * @generated
	 */
	EAttribute getGradient_Focalx();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getFocaly <em>Focaly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focaly</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getFocaly()
	 * @see #getGradient()
	 * @generated
	 */
	EAttribute getGradient_Focaly();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getRadius()
	 * @see #getGradient()
	 * @generated
	 */
	EAttribute getGradient_Radius();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getSpread <em>Spread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spread</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getSpread()
	 * @see #getGradient()
	 * @generated
	 */
	EAttribute getGradient_Spread();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getStartx <em>Startx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startx</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getStartx()
	 * @see #getGradient()
	 * @generated
	 */
	EAttribute getGradient_Startx();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getStarty <em>Starty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starty</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getStarty()
	 * @see #getGradient()
	 * @generated
	 */
	EAttribute getGradient_Starty();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient#getType()
	 * @see #getGradient()
	 * @generated
	 */
	EAttribute getGradient_Type();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop <em>Gradient Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradient Stop</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop
	 * @generated
	 */
	EClass getGradientStop();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop#getColor()
	 * @see #getGradientStop()
	 * @generated
	 */
	EReference getGradientStop_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop#getPosition()
	 * @see #getGradientStop()
	 * @generated
	 */
	EAttribute getGradientStop_Position();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Header#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Header#getMixed()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Header#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Header#getLocation()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Location();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Image#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Image#getData()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Image#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Image#getName()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Name();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ImageData <em>Image Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Data</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ImageData
	 * @generated
	 */
	EClass getImageData();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ImageData#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ImageData#getMixed()
	 * @see #getImageData()
	 * @generated
	 */
	EAttribute getImageData_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ImageData#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ImageData#getFormat()
	 * @see #getImageData()
	 * @generated
	 */
	EAttribute getImageData_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ImageData#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ImageData#getLength()
	 * @see #getImageData()
	 * @generated
	 */
	EAttribute getImageData_Length();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Images <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Images</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Images
	 * @generated
	 */
	EClass getImages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Images#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Images#getImage()
	 * @see #getImages()
	 * @generated
	 */
	EReference getImages_Image();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Include
	 * @generated
	 */
	EClass getInclude();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Include#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Include#getMixed()
	 * @see #getInclude()
	 * @generated
	 */
	EAttribute getInclude_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Include#getImpldecl <em>Impldecl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impldecl</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Include#getImpldecl()
	 * @see #getInclude()
	 * @generated
	 */
	EAttribute getInclude_Impldecl();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Include#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Include#getLocation()
	 * @see #getInclude()
	 * @generated
	 */
	EAttribute getInclude_Location();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Includes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Includes</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Includes
	 * @generated
	 */
	EClass getIncludes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Includes#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Includes#getInclude()
	 * @see #getIncludes()
	 * @generated
	 */
	EReference getIncludes_Include();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item#getGroup()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item#getProperty()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item#getItem()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Item();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item#getColumn()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item#getRow()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Row();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getGroup()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getProperty()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getAttribute()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getItem()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Item();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getClass_()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getColumnminimumwidth <em>Columnminimumwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columnminimumwidth</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getColumnminimumwidth()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Columnminimumwidth();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getColumnstretch <em>Columnstretch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columnstretch</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getColumnstretch()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Columnstretch();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getName()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getRowminimumheight <em>Rowminimumheight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowminimumheight</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getRowminimumheight()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Rowminimumheight();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getRowstretch <em>Rowstretch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowstretch</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getRowstretch()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Rowstretch();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getStretch <em>Stretch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stretch</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout#getStretch()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Stretch();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault <em>Layout Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Default</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault
	 * @generated
	 */
	EClass getLayoutDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault#getMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault#getMargin()
	 * @see #getLayoutDefault()
	 * @generated
	 */
	EAttribute getLayoutDefault_Margin();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault#getSpacing()
	 * @see #getLayoutDefault()
	 * @generated
	 */
	EAttribute getLayoutDefault_Spacing();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutFunction <em>Layout Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Function</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutFunction
	 * @generated
	 */
	EClass getLayoutFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutFunction#getMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutFunction#getMargin()
	 * @see #getLayoutFunction()
	 * @generated
	 */
	EAttribute getLayoutFunction_Margin();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutFunction#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutFunction#getSpacing()
	 * @see #getLayoutFunction()
	 * @generated
	 */
	EAttribute getLayoutFunction_Spacing();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem <em>Layout Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Item</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem
	 * @generated
	 */
	EClass getLayoutItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getWidget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Widget</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getWidget()
	 * @see #getLayoutItem()
	 * @generated
	 */
	EReference getLayoutItem_Widget();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getLayout()
	 * @see #getLayoutItem()
	 * @generated
	 */
	EReference getLayoutItem_Layout();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getSpacer <em>Spacer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spacer</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getSpacer()
	 * @see #getLayoutItem()
	 * @generated
	 */
	EReference getLayoutItem_Spacer();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getAlignment()
	 * @see #getLayoutItem()
	 * @generated
	 */
	EAttribute getLayoutItem_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getColspan()
	 * @see #getLayoutItem()
	 * @generated
	 */
	EAttribute getLayoutItem_Colspan();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getColumn()
	 * @see #getLayoutItem()
	 * @generated
	 */
	EAttribute getLayoutItem_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getRow()
	 * @see #getLayoutItem()
	 * @generated
	 */
	EAttribute getLayoutItem_Row();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem#getRowspan()
	 * @see #getLayoutItem()
	 * @generated
	 */
	EAttribute getLayoutItem_Rowspan();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Locale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locale</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Locale
	 * @generated
	 */
	EClass getLocale();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Locale#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Locale#getCountry()
	 * @see #getLocale()
	 * @generated
	 */
	EAttribute getLocale_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Locale#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Locale#getLanguage()
	 * @see #getLocale()
	 * @generated
	 */
	EAttribute getLocale_Language();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette <em>Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Palette</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette
	 * @generated
	 */
	EClass getPalette();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette#getActive()
	 * @see #getPalette()
	 * @generated
	 */
	EReference getPalette_Active();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette#getInactive <em>Inactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inactive</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette#getInactive()
	 * @see #getPalette()
	 * @generated
	 */
	EReference getPalette_Inactive();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disabled</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette#getDisabled()
	 * @see #getPalette()
	 * @generated
	 */
	EReference getPalette_Disabled();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PointF <em>Point F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point F</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PointF
	 * @generated
	 */
	EClass getPointF();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PointF#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PointF#getX()
	 * @see #getPointF()
	 * @generated
	 */
	EAttribute getPointF_X();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PointF#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PointF#getY()
	 * @see #getPointF()
	 * @generated
	 */
	EAttribute getPointF_Y();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Properties#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Properties#getProperty()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Property();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getBool()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Bool();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getColor()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getCstring <em>Cstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cstring</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getCstring()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Cstring();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getCursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getCursor()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Cursor();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getCursorshape <em>Cursorshape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursorshape</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getCursorshape()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Cursorshape();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getEnum()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Enum();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getFont()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Font();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getIconset <em>Iconset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iconset</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getIconset()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Iconset();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getPixmap <em>Pixmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pixmap</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getPixmap()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Pixmap();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getPalette <em>Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Palette</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getPalette()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Palette();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getPoint()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Point();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getRect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rect</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getRect()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Rect();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getSet()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Set();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locale</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getLocale()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Locale();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getSizepolicy <em>Sizepolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sizepolicy</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getSizepolicy()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Sizepolicy();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getSize()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Size();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getString()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_String();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getStringlist <em>Stringlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stringlist</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getStringlist()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Stringlist();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getNumber()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getFloat()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Float();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getDouble <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getDouble()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Double();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getDate()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Date();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getTime()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getDatetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datetime</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getDatetime()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Datetime();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getPointf <em>Pointf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pointf</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getPointf()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Pointf();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getRectf <em>Rectf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rectf</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getRectf()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Rectf();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getSizef <em>Sizef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sizef</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getSizef()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Sizef();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getLonglong <em>Longlong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longlong</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getLonglong()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Longlong();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Char</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getChar()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Char();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getUrl()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getUint <em>Uint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uint</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getUint()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Uint();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getUInt1 <em>UInt1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UInt1</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getUInt1()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_UInt1();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getUlonglong <em>Ulonglong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ulonglong</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getUlonglong()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Ulonglong();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getBrush <em>Brush</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Brush</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getBrush()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Brush();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getStdset <em>Stdset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stdset</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property#getStdset()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Stdset();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertyData <em>Property Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Data</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertyData
	 * @generated
	 */
	EClass getPropertyData();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertyData#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertyData#getType()
	 * @see #getPropertyData()
	 * @generated
	 */
	EAttribute getPropertyData_Type();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertySpecifications <em>Property Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Specifications</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertySpecifications
	 * @generated
	 */
	EClass getPropertySpecifications();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertySpecifications#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertySpecifications#getGroup()
	 * @see #getPropertySpecifications()
	 * @generated
	 */
	EAttribute getPropertySpecifications_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertySpecifications#getStringpropertyspecification <em>Stringpropertyspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stringpropertyspecification</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertySpecifications#getStringpropertyspecification()
	 * @see #getPropertySpecifications()
	 * @generated
	 */
	EReference getPropertySpecifications_Stringpropertyspecification();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rect</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect
	 * @generated
	 */
	EClass getRect();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect#getX()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_X();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect#getY()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect#getWidth()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect#getHeight()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Height();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF <em>Rect F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rect F</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF
	 * @generated
	 */
	EClass getRectF();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF#getX()
	 * @see #getRectF()
	 * @generated
	 */
	EAttribute getRectF_X();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF#getY()
	 * @see #getRectF()
	 * @generated
	 */
	EAttribute getRectF_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF#getWidth()
	 * @see #getRectF()
	 * @generated
	 */
	EAttribute getRectF_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF#getHeight()
	 * @see #getRectF()
	 * @generated
	 */
	EAttribute getRectF_Height();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resource#getLocation()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Location();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon <em>Resource Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Icon</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon
	 * @generated
	 */
	EClass getResourceIcon();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getMixed()
	 * @see #getResourceIcon()
	 * @generated
	 */
	EAttribute getResourceIcon_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getNormaloff <em>Normaloff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Normaloff</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getNormaloff()
	 * @see #getResourceIcon()
	 * @generated
	 */
	EReference getResourceIcon_Normaloff();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getNormalon <em>Normalon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Normalon</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getNormalon()
	 * @see #getResourceIcon()
	 * @generated
	 */
	EReference getResourceIcon_Normalon();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getDisabledoff <em>Disabledoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disabledoff</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getDisabledoff()
	 * @see #getResourceIcon()
	 * @generated
	 */
	EReference getResourceIcon_Disabledoff();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getDisabledon <em>Disabledon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disabledon</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getDisabledon()
	 * @see #getResourceIcon()
	 * @generated
	 */
	EReference getResourceIcon_Disabledon();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getActiveoff <em>Activeoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activeoff</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getActiveoff()
	 * @see #getResourceIcon()
	 * @generated
	 */
	EReference getResourceIcon_Activeoff();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getActiveon <em>Activeon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activeon</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getActiveon()
	 * @see #getResourceIcon()
	 * @generated
	 */
	EReference getResourceIcon_Activeon();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getSelectedoff <em>Selectedoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selectedoff</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getSelectedoff()
	 * @see #getResourceIcon()
	 * @generated
	 */
	EReference getResourceIcon_Selectedoff();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getSelectedon <em>Selectedon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selectedon</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getSelectedon()
	 * @see #getResourceIcon()
	 * @generated
	 */
	EReference getResourceIcon_Selectedon();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getResource()
	 * @see #getResourceIcon()
	 * @generated
	 */
	EAttribute getResourceIcon_Resource();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon#getTheme()
	 * @see #getResourceIcon()
	 * @generated
	 */
	EAttribute getResourceIcon_Theme();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourcePixmap <em>Resource Pixmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Pixmap</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourcePixmap
	 * @generated
	 */
	EClass getResourcePixmap();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourcePixmap#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourcePixmap#getMixed()
	 * @see #getResourcePixmap()
	 * @generated
	 */
	EAttribute getResourcePixmap_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourcePixmap#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourcePixmap#getAlias()
	 * @see #getResourcePixmap()
	 * @generated
	 */
	EAttribute getResourcePixmap_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourcePixmap#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourcePixmap#getResource()
	 * @see #getResourcePixmap()
	 * @generated
	 */
	EAttribute getResourcePixmap_Resource();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resources
	 * @generated
	 */
	EClass getResources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resources#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resources#getInclude()
	 * @see #getResources()
	 * @generated
	 */
	EReference getResources_Include();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resources#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resources#getName()
	 * @see #getResources()
	 * @generated
	 */
	EAttribute getResources_Name();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Row#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Row#getProperty()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Property();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Script#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Script#getLanguage()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Script#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Script#getSource()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Source();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Size
	 * @generated
	 */
	EClass getSize();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Size#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Size#getWidth()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Size#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Size#getHeight()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Height();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizeF <em>Size F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size F</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizeF
	 * @generated
	 */
	EClass getSizeF();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizeF#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizeF#getWidth()
	 * @see #getSizeF()
	 * @generated
	 */
	EAttribute getSizeF_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizeF#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizeF#getHeight()
	 * @see #getSizeF()
	 * @generated
	 */
	EAttribute getSizeF_Height();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy <em>Size Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Policy</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy
	 * @generated
	 */
	EClass getSizePolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy#getHsizetype <em>Hsizetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hsizetype</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy#getHsizetype()
	 * @see #getSizePolicy()
	 * @generated
	 */
	EAttribute getSizePolicy_Hsizetype();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy#getVsizetype <em>Vsizetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vsizetype</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy#getVsizetype()
	 * @see #getSizePolicy()
	 * @generated
	 */
	EAttribute getSizePolicy_Vsizetype();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy#getHorstretch <em>Horstretch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horstretch</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy#getHorstretch()
	 * @see #getSizePolicy()
	 * @generated
	 */
	EAttribute getSizePolicy_Horstretch();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy#getVerstretch <em>Verstretch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verstretch</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy#getVerstretch()
	 * @see #getSizePolicy()
	 * @generated
	 */
	EAttribute getSizePolicy_Verstretch();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy#getHsizetype1 <em>Hsizetype1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hsizetype1</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy#getHsizetype1()
	 * @see #getSizePolicy()
	 * @generated
	 */
	EAttribute getSizePolicy_Hsizetype1();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy#getVsizetype1 <em>Vsizetype1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vsizetype1</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy#getVsizetype1()
	 * @see #getSizePolicy()
	 * @generated
	 */
	EAttribute getSizePolicy_Vsizetype1();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicyData <em>Size Policy Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Policy Data</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicyData
	 * @generated
	 */
	EClass getSizePolicyData();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicyData#getHordata <em>Hordata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hordata</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicyData#getHordata()
	 * @see #getSizePolicyData()
	 * @generated
	 */
	EAttribute getSizePolicyData_Hordata();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicyData#getVerdata <em>Verdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verdata</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicyData#getVerdata()
	 * @see #getSizePolicyData()
	 * @generated
	 */
	EAttribute getSizePolicyData_Verdata();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Slots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slots</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Slots
	 * @generated
	 */
	EClass getSlots();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Slots#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Slots#getGroup()
	 * @see #getSlots()
	 * @generated
	 */
	EAttribute getSlots_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Slots#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Signal</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Slots#getSignal()
	 * @see #getSlots()
	 * @generated
	 */
	EAttribute getSlots_Signal();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Slots#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Slot</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Slots#getSlot()
	 * @see #getSlots()
	 * @generated
	 */
	EAttribute getSlots_Slot();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Spacer <em>Spacer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacer</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Spacer
	 * @generated
	 */
	EClass getSpacer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Spacer#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Spacer#getProperty()
	 * @see #getSpacer()
	 * @generated
	 */
	EReference getSpacer_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Spacer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Spacer#getName()
	 * @see #getSpacer()
	 * @generated
	 */
	EAttribute getSpacer_Name();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String#getMixed()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String#getComment()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String#getExtracomment <em>Extracomment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extracomment</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String#getExtracomment()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Extracomment();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String#getNotr <em>Notr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notr</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String#getNotr()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Notr();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringList <em>String List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String List</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringList
	 * @generated
	 */
	EClass getStringList();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringList#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>String</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringList#getString()
	 * @see #getStringList()
	 * @generated
	 */
	EAttribute getStringList_String();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringPropertySpecification <em>String Property Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Property Specification</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringPropertySpecification
	 * @generated
	 */
	EClass getStringPropertySpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringPropertySpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringPropertySpecification#getName()
	 * @see #getStringPropertySpecification()
	 * @generated
	 */
	EAttribute getStringPropertySpecification_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringPropertySpecification#getNotr <em>Notr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notr</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringPropertySpecification#getNotr()
	 * @see #getStringPropertySpecification()
	 * @generated
	 */
	EAttribute getStringPropertySpecification_Notr();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringPropertySpecification#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringPropertySpecification#getType()
	 * @see #getStringPropertySpecification()
	 * @generated
	 */
	EAttribute getStringPropertySpecification_Type();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.TabStops <em>Tab Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Stops</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.TabStops
	 * @generated
	 */
	EClass getTabStops();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.TabStops#getTabstop <em>Tabstop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tabstop</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.TabStops#getTabstop()
	 * @see #getTabStops()
	 * @generated
	 */
	EAttribute getTabStops_Tabstop();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Time#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Time#getHour()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Hour();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Time#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Time#getMinute()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Minute();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Time#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Time#getSecond()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Second();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI
	 * @generated
	 */
	EClass getUI();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getAuthor()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getComment()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getExportmacro <em>Exportmacro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exportmacro</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getExportmacro()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_Exportmacro();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getClass_()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_Class();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getWidget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Widget</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getWidget()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Widget();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getLayoutdefault <em>Layoutdefault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layoutdefault</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getLayoutdefault()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Layoutdefault();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getLayoutfunction <em>Layoutfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layoutfunction</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getLayoutfunction()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Layoutfunction();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getPixmapfunction <em>Pixmapfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pixmapfunction</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getPixmapfunction()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_Pixmapfunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getCustomwidgets <em>Customwidgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customwidgets</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getCustomwidgets()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Customwidgets();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getTabstops <em>Tabstops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tabstops</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getTabstops()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Tabstops();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Images</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getImages()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Images();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Includes</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getIncludes()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Includes();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getResources()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connections</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getConnections()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Connections();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getDesignerdata <em>Designerdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Designerdata</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getDesignerdata()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Designerdata();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slots</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getSlots()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Slots();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getButtongroups <em>Buttongroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buttongroups</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getButtongroups()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Buttongroups();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getDisplayname <em>Displayname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Displayname</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getDisplayname()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_Displayname();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getLanguage()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getStdsetdef <em>Stdsetdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stdsetdef</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getStdsetdef()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_Stdsetdef();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getStdSetDef1 <em>Std Set Def1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std Set Def1</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getStdSetDef1()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_StdSetDef1();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI#getVersion()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_Version();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Url
	 * @generated
	 */
	EClass getUrl();

	/**
	 * Returns the meta object for the containment reference '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Url#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Url#getString()
	 * @see #getUrl()
	 * @generated
	 */
	EReference getUrl_String();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Class</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getClass_()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getProperty()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getScript()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Script();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getWidgetdata <em>Widgetdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgetdata</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getWidgetdata()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Widgetdata();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getAttribute()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getRow()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Row();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getColumn()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Column();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getItem()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layout</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getLayout()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getWidget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widget</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getWidget()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Widget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getAction()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getActiongroup <em>Actiongroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actiongroup</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getActiongroup()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Actiongroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getAddaction <em>Addaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addaction</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getAddaction()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Addaction();

	/**
	 * Returns the meta object for the attribute list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getZorder <em>Zorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Zorder</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getZorder()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Zorder();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getClass1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class1</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getClass1()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Class1();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#getName()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#isNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget#isNative()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Native();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.WidgetData <em>Widget Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Data</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.WidgetData
	 * @generated
	 */
	EClass getWidgetData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.WidgetData#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.WidgetData#getProperty()
	 * @see #getWidgetData()
	 * @generated
	 */
	EReference getWidgetData_Property();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Qt48XmlschemaQwtEnhancedFactory getQt48XmlschemaQwtEnhancedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__GROUP = eINSTANCE.getAction_Group();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PROPERTY = eINSTANCE.getAction_Property();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ATTRIBUTE = eINSTANCE.getAction_Attribute();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__MENU = eINSTANCE.getAction_Menu();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionGroupImpl <em>Action Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionGroupImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getActionGroup()
		 * @generated
		 */
		EClass ACTION_GROUP = eINSTANCE.getActionGroup();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_GROUP__GROUP = eINSTANCE.getActionGroup_Group();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUP__ACTION = eINSTANCE.getActionGroup_Action();

		/**
		 * The meta object literal for the '<em><b>Actiongroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUP__ACTIONGROUP = eINSTANCE.getActionGroup_Actiongroup();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUP__PROPERTY = eINSTANCE.getActionGroup_Property();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUP__ATTRIBUTE = eINSTANCE.getActionGroup_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_GROUP__NAME = eINSTANCE.getActionGroup_Name();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionRefImpl <em>Action Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionRefImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getActionRef()
		 * @generated
		 */
		EClass ACTION_REF = eINSTANCE.getActionRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_REF__NAME = eINSTANCE.getActionRef_Name();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.BrushImpl <em>Brush</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.BrushImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getBrush()
		 * @generated
		 */
		EClass BRUSH = eINSTANCE.getBrush();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRUSH__COLOR = eINSTANCE.getBrush_Color();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRUSH__TEXTURE = eINSTANCE.getBrush_Texture();

		/**
		 * The meta object literal for the '<em><b>Gradient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRUSH__GRADIENT = eINSTANCE.getBrush_Gradient();

		/**
		 * The meta object literal for the '<em><b>Brushstyle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRUSH__BRUSHSTYLE = eINSTANCE.getBrush_Brushstyle();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ButtonGroupImpl <em>Button Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ButtonGroupImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getButtonGroup()
		 * @generated
		 */
		EClass BUTTON_GROUP = eINSTANCE.getButtonGroup();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_GROUP__GROUP = eINSTANCE.getButtonGroup_Group();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_GROUP__PROPERTY = eINSTANCE.getButtonGroup_Property();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_GROUP__ATTRIBUTE = eINSTANCE.getButtonGroup_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_GROUP__NAME = eINSTANCE.getButtonGroup_Name();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ButtonGroupsImpl <em>Button Groups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ButtonGroupsImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getButtonGroups()
		 * @generated
		 */
		EClass BUTTON_GROUPS = eINSTANCE.getButtonGroups();

		/**
		 * The meta object literal for the '<em><b>Buttongroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_GROUPS__BUTTONGROUP = eINSTANCE.getButtonGroups_Buttongroup();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.CharImpl <em>Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.CharImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getChar()
		 * @generated
		 */
		EClass CHAR = eINSTANCE.getChar();

		/**
		 * The meta object literal for the '<em><b>Unicode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR__UNICODE = eINSTANCE.getChar_Unicode();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColorImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__RED = eINSTANCE.getColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__GREEN = eINSTANCE.getColor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__BLUE = eINSTANCE.getColor_Blue();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__ALPHA = eINSTANCE.getColor_Alpha();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColorGroupImpl <em>Color Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColorGroupImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getColorGroup()
		 * @generated
		 */
		EClass COLOR_GROUP = eINSTANCE.getColorGroup();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_GROUP__GROUP = eINSTANCE.getColorGroup_Group();

		/**
		 * The meta object literal for the '<em><b>Colorrole</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_GROUP__COLORROLE = eINSTANCE.getColorGroup_Colorrole();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_GROUP__COLOR = eINSTANCE.getColorGroup_Color();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColorRoleImpl <em>Color Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColorRoleImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getColorRole()
		 * @generated
		 */
		EClass COLOR_ROLE = eINSTANCE.getColorRole();

		/**
		 * The meta object literal for the '<em><b>Brush</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_ROLE__BRUSH = eINSTANCE.getColorRole_Brush();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_ROLE__ROLE = eINSTANCE.getColorRole_Role();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ColumnImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__PROPERTY = eINSTANCE.getColumn_Property();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__SENDER = eINSTANCE.getConnection_Sender();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__SIGNAL = eINSTANCE.getConnection_Signal();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__RECEIVER = eINSTANCE.getConnection_Receiver();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__SLOT = eINSTANCE.getConnection_Slot();

		/**
		 * The meta object literal for the '<em><b>Hints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__HINTS = eINSTANCE.getConnection_Hints();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionHintImpl <em>Connection Hint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionHintImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getConnectionHint()
		 * @generated
		 */
		EClass CONNECTION_HINT = eINSTANCE.getConnectionHint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_HINT__X = eINSTANCE.getConnectionHint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_HINT__Y = eINSTANCE.getConnectionHint_Y();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_HINT__TYPE = eINSTANCE.getConnectionHint_Type();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionHintsImpl <em>Connection Hints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionHintsImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getConnectionHints()
		 * @generated
		 */
		EClass CONNECTION_HINTS = eINSTANCE.getConnectionHints();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_HINTS__HINT = eINSTANCE.getConnectionHints_Hint();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionsImpl <em>Connections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionsImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getConnections()
		 * @generated
		 */
		EClass CONNECTIONS = eINSTANCE.getConnections();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIONS__CONNECTION = eINSTANCE.getConnections_Connection();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.CustomWidgetImpl <em>Custom Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.CustomWidgetImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getCustomWidget()
		 * @generated
		 */
		EClass CUSTOM_WIDGET = eINSTANCE.getCustomWidget();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_WIDGET__CLASS = eINSTANCE.getCustomWidget_Class();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_WIDGET__EXTENDS = eINSTANCE.getCustomWidget_Extends();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_WIDGET__HEADER = eINSTANCE.getCustomWidget_Header();

		/**
		 * The meta object literal for the '<em><b>Sizehint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_WIDGET__SIZEHINT = eINSTANCE.getCustomWidget_Sizehint();

		/**
		 * The meta object literal for the '<em><b>Addpagemethod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_WIDGET__ADDPAGEMETHOD = eINSTANCE.getCustomWidget_Addpagemethod();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_WIDGET__CONTAINER = eINSTANCE.getCustomWidget_Container();

		/**
		 * The meta object literal for the '<em><b>Sizepolicy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_WIDGET__SIZEPOLICY = eINSTANCE.getCustomWidget_Sizepolicy();

		/**
		 * The meta object literal for the '<em><b>Pixmap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_WIDGET__PIXMAP = eINSTANCE.getCustomWidget_Pixmap();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_WIDGET__SCRIPT = eINSTANCE.getCustomWidget_Script();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_WIDGET__PROPERTIES = eINSTANCE.getCustomWidget_Properties();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_WIDGET__SLOTS = eINSTANCE.getCustomWidget_Slots();

		/**
		 * The meta object literal for the '<em><b>Propertyspecifications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_WIDGET__PROPERTYSPECIFICATIONS = eINSTANCE.getCustomWidget_Propertyspecifications();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.CustomWidgetsImpl <em>Custom Widgets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.CustomWidgetsImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getCustomWidgets()
		 * @generated
		 */
		EClass CUSTOM_WIDGETS = eINSTANCE.getCustomWidgets();

		/**
		 * The meta object literal for the '<em><b>Customwidget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_WIDGETS__CUSTOMWIDGET = eINSTANCE.getCustomWidgets_Customwidget();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DateImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__YEAR = eINSTANCE.getDate_Year();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__MONTH = eINSTANCE.getDate_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__DAY = eINSTANCE.getDate_Day();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DateTimeImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getDateTime()
		 * @generated
		 */
		EClass DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__HOUR = eINSTANCE.getDateTime_Hour();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__MINUTE = eINSTANCE.getDateTime_Minute();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__SECOND = eINSTANCE.getDateTime_Second();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__YEAR = eINSTANCE.getDateTime_Year();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__MONTH = eINSTANCE.getDateTime_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__DAY = eINSTANCE.getDateTime_Day();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DesignerDataImpl <em>Designer Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DesignerDataImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getDesignerData()
		 * @generated
		 */
		EClass DESIGNER_DATA = eINSTANCE.getDesignerData();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGNER_DATA__PROPERTY = eINSTANCE.getDesignerData_Property();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.DocumentRootImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Ui</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UI = eINSTANCE.getDocumentRoot_Ui();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl <em>Font</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getFont()
		 * @generated
		 */
		EClass FONT = eINSTANCE.getFont();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__FAMILY = eINSTANCE.getFont_Family();

		/**
		 * The meta object literal for the '<em><b>Pointsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__POINTSIZE = eINSTANCE.getFont_Pointsize();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__WEIGHT = eINSTANCE.getFont_Weight();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__ITALIC = eINSTANCE.getFont_Italic();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__BOLD = eINSTANCE.getFont_Bold();

		/**
		 * The meta object literal for the '<em><b>Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__UNDERLINE = eINSTANCE.getFont_Underline();

		/**
		 * The meta object literal for the '<em><b>Strikeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__STRIKEOUT = eINSTANCE.getFont_Strikeout();

		/**
		 * The meta object literal for the '<em><b>Antialiasing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__ANTIALIASING = eINSTANCE.getFont_Antialiasing();

		/**
		 * The meta object literal for the '<em><b>Stylestrategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__STYLESTRATEGY = eINSTANCE.getFont_Stylestrategy();

		/**
		 * The meta object literal for the '<em><b>Kerning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__KERNING = eINSTANCE.getFont_Kerning();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl <em>Gradient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getGradient()
		 * @generated
		 */
		EClass GRADIENT = eINSTANCE.getGradient();

		/**
		 * The meta object literal for the '<em><b>Gradient Stop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADIENT__GRADIENT_STOP = eINSTANCE.getGradient_GradientStop();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT__ANGLE = eINSTANCE.getGradient_Angle();

		/**
		 * The meta object literal for the '<em><b>Centralx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT__CENTRALX = eINSTANCE.getGradient_Centralx();

		/**
		 * The meta object literal for the '<em><b>Centraly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT__CENTRALY = eINSTANCE.getGradient_Centraly();

		/**
		 * The meta object literal for the '<em><b>Coordinatemode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT__COORDINATEMODE = eINSTANCE.getGradient_Coordinatemode();

		/**
		 * The meta object literal for the '<em><b>Endx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT__ENDX = eINSTANCE.getGradient_Endx();

		/**
		 * The meta object literal for the '<em><b>Endy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT__ENDY = eINSTANCE.getGradient_Endy();

		/**
		 * The meta object literal for the '<em><b>Focalx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT__FOCALX = eINSTANCE.getGradient_Focalx();

		/**
		 * The meta object literal for the '<em><b>Focaly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT__FOCALY = eINSTANCE.getGradient_Focaly();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT__RADIUS = eINSTANCE.getGradient_Radius();

		/**
		 * The meta object literal for the '<em><b>Spread</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT__SPREAD = eINSTANCE.getGradient_Spread();

		/**
		 * The meta object literal for the '<em><b>Startx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT__STARTX = eINSTANCE.getGradient_Startx();

		/**
		 * The meta object literal for the '<em><b>Starty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT__STARTY = eINSTANCE.getGradient_Starty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT__TYPE = eINSTANCE.getGradient_Type();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientStopImpl <em>Gradient Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientStopImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getGradientStop()
		 * @generated
		 */
		EClass GRADIENT_STOP = eINSTANCE.getGradientStop();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADIENT_STOP__COLOR = eINSTANCE.getGradientStop_Color();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_STOP__POSITION = eINSTANCE.getGradientStop_Position();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.HeaderImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__MIXED = eINSTANCE.getHeader_Mixed();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__LOCATION = eINSTANCE.getHeader_Location();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ImageImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__DATA = eINSTANCE.getImage_Data();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__NAME = eINSTANCE.getImage_Name();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ImageDataImpl <em>Image Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ImageDataImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getImageData()
		 * @generated
		 */
		EClass IMAGE_DATA = eINSTANCE.getImageData();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_DATA__MIXED = eINSTANCE.getImageData_Mixed();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_DATA__FORMAT = eINSTANCE.getImageData_Format();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_DATA__LENGTH = eINSTANCE.getImageData_Length();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ImagesImpl <em>Images</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ImagesImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getImages()
		 * @generated
		 */
		EClass IMAGES = eINSTANCE.getImages();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGES__IMAGE = eINSTANCE.getImages_Image();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.IncludeImpl <em>Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.IncludeImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getInclude()
		 * @generated
		 */
		EClass INCLUDE = eINSTANCE.getInclude();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE__MIXED = eINSTANCE.getInclude_Mixed();

		/**
		 * The meta object literal for the '<em><b>Impldecl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE__IMPLDECL = eINSTANCE.getInclude_Impldecl();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE__LOCATION = eINSTANCE.getInclude_Location();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.IncludesImpl <em>Includes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.IncludesImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getIncludes()
		 * @generated
		 */
		EClass INCLUDES = eINSTANCE.getIncludes();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDES__INCLUDE = eINSTANCE.getIncludes_Include();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ItemImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__GROUP = eINSTANCE.getItem_Group();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__PROPERTY = eINSTANCE.getItem_Property();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ITEM = eINSTANCE.getItem_Item();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__COLUMN = eINSTANCE.getItem_Column();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ROW = eINSTANCE.getItem_Row();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__GROUP = eINSTANCE.getLayout_Group();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__PROPERTY = eINSTANCE.getLayout_Property();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__ATTRIBUTE = eINSTANCE.getLayout_Attribute();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__ITEM = eINSTANCE.getLayout_Item();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__CLASS = eINSTANCE.getLayout_Class();

		/**
		 * The meta object literal for the '<em><b>Columnminimumwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__COLUMNMINIMUMWIDTH = eINSTANCE.getLayout_Columnminimumwidth();

		/**
		 * The meta object literal for the '<em><b>Columnstretch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__COLUMNSTRETCH = eINSTANCE.getLayout_Columnstretch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__NAME = eINSTANCE.getLayout_Name();

		/**
		 * The meta object literal for the '<em><b>Rowminimumheight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__ROWMINIMUMHEIGHT = eINSTANCE.getLayout_Rowminimumheight();

		/**
		 * The meta object literal for the '<em><b>Rowstretch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__ROWSTRETCH = eINSTANCE.getLayout_Rowstretch();

		/**
		 * The meta object literal for the '<em><b>Stretch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__STRETCH = eINSTANCE.getLayout_Stretch();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutDefaultImpl <em>Layout Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutDefaultImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getLayoutDefault()
		 * @generated
		 */
		EClass LAYOUT_DEFAULT = eINSTANCE.getLayoutDefault();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DEFAULT__MARGIN = eINSTANCE.getLayoutDefault_Margin();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DEFAULT__SPACING = eINSTANCE.getLayoutDefault_Spacing();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutFunctionImpl <em>Layout Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutFunctionImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getLayoutFunction()
		 * @generated
		 */
		EClass LAYOUT_FUNCTION = eINSTANCE.getLayoutFunction();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_FUNCTION__MARGIN = eINSTANCE.getLayoutFunction_Margin();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_FUNCTION__SPACING = eINSTANCE.getLayoutFunction_Spacing();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutItemImpl <em>Layout Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutItemImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getLayoutItem()
		 * @generated
		 */
		EClass LAYOUT_ITEM = eINSTANCE.getLayoutItem();

		/**
		 * The meta object literal for the '<em><b>Widget</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_ITEM__WIDGET = eINSTANCE.getLayoutItem_Widget();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_ITEM__LAYOUT = eINSTANCE.getLayoutItem_Layout();

		/**
		 * The meta object literal for the '<em><b>Spacer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_ITEM__SPACER = eINSTANCE.getLayoutItem_Spacer();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_ITEM__ALIGNMENT = eINSTANCE.getLayoutItem_Alignment();

		/**
		 * The meta object literal for the '<em><b>Colspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_ITEM__COLSPAN = eINSTANCE.getLayoutItem_Colspan();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_ITEM__COLUMN = eINSTANCE.getLayoutItem_Column();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_ITEM__ROW = eINSTANCE.getLayoutItem_Row();

		/**
		 * The meta object literal for the '<em><b>Rowspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_ITEM__ROWSPAN = eINSTANCE.getLayoutItem_Rowspan();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LocaleImpl <em>Locale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LocaleImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getLocale()
		 * @generated
		 */
		EClass LOCALE = eINSTANCE.getLocale();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE__COUNTRY = eINSTANCE.getLocale_Country();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE__LANGUAGE = eINSTANCE.getLocale_Language();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PaletteImpl <em>Palette</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PaletteImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getPalette()
		 * @generated
		 */
		EClass PALETTE = eINSTANCE.getPalette();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PALETTE__ACTIVE = eINSTANCE.getPalette_Active();

		/**
		 * The meta object literal for the '<em><b>Inactive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PALETTE__INACTIVE = eINSTANCE.getPalette_Inactive();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PALETTE__DISABLED = eINSTANCE.getPalette_Disabled();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PointImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PointFImpl <em>Point F</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PointFImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getPointF()
		 * @generated
		 */
		EClass POINT_F = eINSTANCE.getPointF();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_F__X = eINSTANCE.getPointF_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_F__Y = eINSTANCE.getPointF_Y();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertiesImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__PROPERTY = eINSTANCE.getProperties_Property();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Bool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__BOOL = eINSTANCE.getProperty_Bool();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__COLOR = eINSTANCE.getProperty_Color();

		/**
		 * The meta object literal for the '<em><b>Cstring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__CSTRING = eINSTANCE.getProperty_Cstring();

		/**
		 * The meta object literal for the '<em><b>Cursor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__CURSOR = eINSTANCE.getProperty_Cursor();

		/**
		 * The meta object literal for the '<em><b>Cursorshape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__CURSORSHAPE = eINSTANCE.getProperty_Cursorshape();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__ENUM = eINSTANCE.getProperty_Enum();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__FONT = eINSTANCE.getProperty_Font();

		/**
		 * The meta object literal for the '<em><b>Iconset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ICONSET = eINSTANCE.getProperty_Iconset();

		/**
		 * The meta object literal for the '<em><b>Pixmap</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PIXMAP = eINSTANCE.getProperty_Pixmap();

		/**
		 * The meta object literal for the '<em><b>Palette</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PALETTE = eINSTANCE.getProperty_Palette();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__POINT = eINSTANCE.getProperty_Point();

		/**
		 * The meta object literal for the '<em><b>Rect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__RECT = eINSTANCE.getProperty_Rect();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__SET = eINSTANCE.getProperty_Set();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__LOCALE = eINSTANCE.getProperty_Locale();

		/**
		 * The meta object literal for the '<em><b>Sizepolicy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SIZEPOLICY = eINSTANCE.getProperty_Sizepolicy();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SIZE = eINSTANCE.getProperty_Size();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__STRING = eINSTANCE.getProperty_String();

		/**
		 * The meta object literal for the '<em><b>Stringlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__STRINGLIST = eINSTANCE.getProperty_Stringlist();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NUMBER = eINSTANCE.getProperty_Number();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__FLOAT = eINSTANCE.getProperty_Float();

		/**
		 * The meta object literal for the '<em><b>Double</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DOUBLE = eINSTANCE.getProperty_Double();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__DATE = eINSTANCE.getProperty_Date();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TIME = eINSTANCE.getProperty_Time();

		/**
		 * The meta object literal for the '<em><b>Datetime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__DATETIME = eINSTANCE.getProperty_Datetime();

		/**
		 * The meta object literal for the '<em><b>Pointf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__POINTF = eINSTANCE.getProperty_Pointf();

		/**
		 * The meta object literal for the '<em><b>Rectf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__RECTF = eINSTANCE.getProperty_Rectf();

		/**
		 * The meta object literal for the '<em><b>Sizef</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SIZEF = eINSTANCE.getProperty_Sizef();

		/**
		 * The meta object literal for the '<em><b>Longlong</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__LONGLONG = eINSTANCE.getProperty_Longlong();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CHAR = eINSTANCE.getProperty_Char();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__URL = eINSTANCE.getProperty_Url();

		/**
		 * The meta object literal for the '<em><b>Uint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UINT = eINSTANCE.getProperty_Uint();

		/**
		 * The meta object literal for the '<em><b>UInt1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UINT1 = eINSTANCE.getProperty_UInt1();

		/**
		 * The meta object literal for the '<em><b>Ulonglong</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__ULONGLONG = eINSTANCE.getProperty_Ulonglong();

		/**
		 * The meta object literal for the '<em><b>Brush</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__BRUSH = eINSTANCE.getProperty_Brush();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Stdset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__STDSET = eINSTANCE.getProperty_Stdset();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyDataImpl <em>Property Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyDataImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getPropertyData()
		 * @generated
		 */
		EClass PROPERTY_DATA = eINSTANCE.getPropertyData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DATA__TYPE = eINSTANCE.getPropertyData_Type();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertySpecificationsImpl <em>Property Specifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertySpecificationsImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getPropertySpecifications()
		 * @generated
		 */
		EClass PROPERTY_SPECIFICATIONS = eINSTANCE.getPropertySpecifications();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_SPECIFICATIONS__GROUP = eINSTANCE.getPropertySpecifications_Group();

		/**
		 * The meta object literal for the '<em><b>Stringpropertyspecification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_SPECIFICATIONS__STRINGPROPERTYSPECIFICATION = eINSTANCE.getPropertySpecifications_Stringpropertyspecification();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.RectImpl <em>Rect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.RectImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getRect()
		 * @generated
		 */
		EClass RECT = eINSTANCE.getRect();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__X = eINSTANCE.getRect_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__Y = eINSTANCE.getRect_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__WIDTH = eINSTANCE.getRect_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__HEIGHT = eINSTANCE.getRect_Height();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.RectFImpl <em>Rect F</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.RectFImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getRectF()
		 * @generated
		 */
		EClass RECT_F = eINSTANCE.getRectF();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT_F__X = eINSTANCE.getRectF_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT_F__Y = eINSTANCE.getRectF_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT_F__WIDTH = eINSTANCE.getRectF_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT_F__HEIGHT = eINSTANCE.getRectF_Height();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourceImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__LOCATION = eINSTANCE.getResource_Location();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourceIconImpl <em>Resource Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourceIconImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getResourceIcon()
		 * @generated
		 */
		EClass RESOURCE_ICON = eINSTANCE.getResourceIcon();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ICON__MIXED = eINSTANCE.getResourceIcon_Mixed();

		/**
		 * The meta object literal for the '<em><b>Normaloff</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ICON__NORMALOFF = eINSTANCE.getResourceIcon_Normaloff();

		/**
		 * The meta object literal for the '<em><b>Normalon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ICON__NORMALON = eINSTANCE.getResourceIcon_Normalon();

		/**
		 * The meta object literal for the '<em><b>Disabledoff</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ICON__DISABLEDOFF = eINSTANCE.getResourceIcon_Disabledoff();

		/**
		 * The meta object literal for the '<em><b>Disabledon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ICON__DISABLEDON = eINSTANCE.getResourceIcon_Disabledon();

		/**
		 * The meta object literal for the '<em><b>Activeoff</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ICON__ACTIVEOFF = eINSTANCE.getResourceIcon_Activeoff();

		/**
		 * The meta object literal for the '<em><b>Activeon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ICON__ACTIVEON = eINSTANCE.getResourceIcon_Activeon();

		/**
		 * The meta object literal for the '<em><b>Selectedoff</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ICON__SELECTEDOFF = eINSTANCE.getResourceIcon_Selectedoff();

		/**
		 * The meta object literal for the '<em><b>Selectedon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ICON__SELECTEDON = eINSTANCE.getResourceIcon_Selectedon();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ICON__RESOURCE = eINSTANCE.getResourceIcon_Resource();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ICON__THEME = eINSTANCE.getResourceIcon_Theme();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourcePixmapImpl <em>Resource Pixmap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourcePixmapImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getResourcePixmap()
		 * @generated
		 */
		EClass RESOURCE_PIXMAP = eINSTANCE.getResourcePixmap();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PIXMAP__MIXED = eINSTANCE.getResourcePixmap_Mixed();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PIXMAP__ALIAS = eINSTANCE.getResourcePixmap_Alias();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PIXMAP__RESOURCE = eINSTANCE.getResourcePixmap_Resource();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourcesImpl <em>Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ResourcesImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getResources()
		 * @generated
		 */
		EClass RESOURCES = eINSTANCE.getResources();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES__INCLUDE = eINSTANCE.getResources_Include();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES__NAME = eINSTANCE.getResources_Name();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.RowImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__PROPERTY = eINSTANCE.getRow_Property();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ScriptImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__LANGUAGE = eINSTANCE.getScript_Language();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__SOURCE = eINSTANCE.getScript_Source();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizeImpl <em>Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizeImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getSize()
		 * @generated
		 */
		EClass SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__WIDTH = eINSTANCE.getSize_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__HEIGHT = eINSTANCE.getSize_Height();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizeFImpl <em>Size F</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizeFImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getSizeF()
		 * @generated
		 */
		EClass SIZE_F = eINSTANCE.getSizeF();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_F__WIDTH = eINSTANCE.getSizeF_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_F__HEIGHT = eINSTANCE.getSizeF_Height();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyImpl <em>Size Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getSizePolicy()
		 * @generated
		 */
		EClass SIZE_POLICY = eINSTANCE.getSizePolicy();

		/**
		 * The meta object literal for the '<em><b>Hsizetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_POLICY__HSIZETYPE = eINSTANCE.getSizePolicy_Hsizetype();

		/**
		 * The meta object literal for the '<em><b>Vsizetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_POLICY__VSIZETYPE = eINSTANCE.getSizePolicy_Vsizetype();

		/**
		 * The meta object literal for the '<em><b>Horstretch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_POLICY__HORSTRETCH = eINSTANCE.getSizePolicy_Horstretch();

		/**
		 * The meta object literal for the '<em><b>Verstretch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_POLICY__VERSTRETCH = eINSTANCE.getSizePolicy_Verstretch();

		/**
		 * The meta object literal for the '<em><b>Hsizetype1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_POLICY__HSIZETYPE1 = eINSTANCE.getSizePolicy_Hsizetype1();

		/**
		 * The meta object literal for the '<em><b>Vsizetype1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_POLICY__VSIZETYPE1 = eINSTANCE.getSizePolicy_Vsizetype1();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyDataImpl <em>Size Policy Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyDataImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getSizePolicyData()
		 * @generated
		 */
		EClass SIZE_POLICY_DATA = eINSTANCE.getSizePolicyData();

		/**
		 * The meta object literal for the '<em><b>Hordata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_POLICY_DATA__HORDATA = eINSTANCE.getSizePolicyData_Hordata();

		/**
		 * The meta object literal for the '<em><b>Verdata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_POLICY_DATA__VERDATA = eINSTANCE.getSizePolicyData_Verdata();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SlotsImpl <em>Slots</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SlotsImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getSlots()
		 * @generated
		 */
		EClass SLOTS = eINSTANCE.getSlots();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOTS__GROUP = eINSTANCE.getSlots_Group();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOTS__SIGNAL = eINSTANCE.getSlots_Signal();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOTS__SLOT = eINSTANCE.getSlots_Slot();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SpacerImpl <em>Spacer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SpacerImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getSpacer()
		 * @generated
		 */
		EClass SPACER = eINSTANCE.getSpacer();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACER__PROPERTY = eINSTANCE.getSpacer_Property();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACER__NAME = eINSTANCE.getSpacer_Name();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.StringImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__MIXED = eINSTANCE.getString_Mixed();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__COMMENT = eINSTANCE.getString_Comment();

		/**
		 * The meta object literal for the '<em><b>Extracomment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__EXTRACOMMENT = eINSTANCE.getString_Extracomment();

		/**
		 * The meta object literal for the '<em><b>Notr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__NOTR = eINSTANCE.getString_Notr();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.StringListImpl <em>String List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.StringListImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getStringList()
		 * @generated
		 */
		EClass STRING_LIST = eINSTANCE.getStringList();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LIST__STRING = eINSTANCE.getStringList_String();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.StringPropertySpecificationImpl <em>String Property Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.StringPropertySpecificationImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getStringPropertySpecification()
		 * @generated
		 */
		EClass STRING_PROPERTY_SPECIFICATION = eINSTANCE.getStringPropertySpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_PROPERTY_SPECIFICATION__NAME = eINSTANCE.getStringPropertySpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Notr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_PROPERTY_SPECIFICATION__NOTR = eINSTANCE.getStringPropertySpecification_Notr();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_PROPERTY_SPECIFICATION__TYPE = eINSTANCE.getStringPropertySpecification_Type();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.TabStopsImpl <em>Tab Stops</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.TabStopsImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getTabStops()
		 * @generated
		 */
		EClass TAB_STOPS = eINSTANCE.getTabStops();

		/**
		 * The meta object literal for the '<em><b>Tabstop</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB_STOPS__TABSTOP = eINSTANCE.getTabStops_Tabstop();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.TimeImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__HOUR = eINSTANCE.getTime_Hour();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__MINUTE = eINSTANCE.getTime_Minute();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__SECOND = eINSTANCE.getTime_Second();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.UIImpl <em>UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.UIImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getUI()
		 * @generated
		 */
		EClass UI = eINSTANCE.getUI();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__AUTHOR = eINSTANCE.getUI_Author();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__COMMENT = eINSTANCE.getUI_Comment();

		/**
		 * The meta object literal for the '<em><b>Exportmacro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__EXPORTMACRO = eINSTANCE.getUI_Exportmacro();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__CLASS = eINSTANCE.getUI_Class();

		/**
		 * The meta object literal for the '<em><b>Widget</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__WIDGET = eINSTANCE.getUI_Widget();

		/**
		 * The meta object literal for the '<em><b>Layoutdefault</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__LAYOUTDEFAULT = eINSTANCE.getUI_Layoutdefault();

		/**
		 * The meta object literal for the '<em><b>Layoutfunction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__LAYOUTFUNCTION = eINSTANCE.getUI_Layoutfunction();

		/**
		 * The meta object literal for the '<em><b>Pixmapfunction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__PIXMAPFUNCTION = eINSTANCE.getUI_Pixmapfunction();

		/**
		 * The meta object literal for the '<em><b>Customwidgets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__CUSTOMWIDGETS = eINSTANCE.getUI_Customwidgets();

		/**
		 * The meta object literal for the '<em><b>Tabstops</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__TABSTOPS = eINSTANCE.getUI_Tabstops();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__IMAGES = eINSTANCE.getUI_Images();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__INCLUDES = eINSTANCE.getUI_Includes();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__RESOURCES = eINSTANCE.getUI_Resources();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__CONNECTIONS = eINSTANCE.getUI_Connections();

		/**
		 * The meta object literal for the '<em><b>Designerdata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__DESIGNERDATA = eINSTANCE.getUI_Designerdata();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__SLOTS = eINSTANCE.getUI_Slots();

		/**
		 * The meta object literal for the '<em><b>Buttongroups</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__BUTTONGROUPS = eINSTANCE.getUI_Buttongroups();

		/**
		 * The meta object literal for the '<em><b>Displayname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__DISPLAYNAME = eINSTANCE.getUI_Displayname();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__LANGUAGE = eINSTANCE.getUI_Language();

		/**
		 * The meta object literal for the '<em><b>Stdsetdef</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__STDSETDEF = eINSTANCE.getUI_Stdsetdef();

		/**
		 * The meta object literal for the '<em><b>Std Set Def1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__STD_SET_DEF1 = eINSTANCE.getUI_StdSetDef1();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__VERSION = eINSTANCE.getUI_Version();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.UrlImpl <em>Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.UrlImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getUrl()
		 * @generated
		 */
		EClass URL = eINSTANCE.getUrl();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference URL__STRING = eINSTANCE.getUrl_String();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__CLASS = eINSTANCE.getWidget_Class();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__PROPERTY = eINSTANCE.getWidget_Property();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__SCRIPT = eINSTANCE.getWidget_Script();

		/**
		 * The meta object literal for the '<em><b>Widgetdata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__WIDGETDATA = eINSTANCE.getWidget_Widgetdata();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__ATTRIBUTE = eINSTANCE.getWidget_Attribute();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__ROW = eINSTANCE.getWidget_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__COLUMN = eINSTANCE.getWidget_Column();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__ITEM = eINSTANCE.getWidget_Item();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__LAYOUT = eINSTANCE.getWidget_Layout();

		/**
		 * The meta object literal for the '<em><b>Widget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__WIDGET = eINSTANCE.getWidget_Widget();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__ACTION = eINSTANCE.getWidget_Action();

		/**
		 * The meta object literal for the '<em><b>Actiongroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__ACTIONGROUP = eINSTANCE.getWidget_Actiongroup();

		/**
		 * The meta object literal for the '<em><b>Addaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__ADDACTION = eINSTANCE.getWidget_Addaction();

		/**
		 * The meta object literal for the '<em><b>Zorder</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__ZORDER = eINSTANCE.getWidget_Zorder();

		/**
		 * The meta object literal for the '<em><b>Class1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__CLASS1 = eINSTANCE.getWidget_Class1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__NAME = eINSTANCE.getWidget_Name();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__NATIVE = eINSTANCE.getWidget_Native();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetDataImpl <em>Widget Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetDataImpl
		 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.Qt48XmlschemaQwtEnhancedPackageImpl#getWidgetData()
		 * @generated
		 */
		EClass WIDGET_DATA = eINSTANCE.getWidgetData();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_DATA__PROPERTY = eINSTANCE.getWidgetData_Property();

	}

} //Qt48XmlschemaQwtEnhancedPackage
