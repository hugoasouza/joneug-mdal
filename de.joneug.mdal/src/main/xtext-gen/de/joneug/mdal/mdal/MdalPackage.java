/**
 * generated by Xtext 2.21.0
 */
package de.joneug.mdal.mdal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.joneug.mdal.mdal.MdalFactory
 * @model kind="package"
 * @generated
 */
public interface MdalPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mdal";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "https://www.example.org/mdal";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mdal";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MdalPackage eINSTANCE = de.joneug.mdal.mdal.impl.MdalPackageImpl.init();

  /**
   * The meta object id for the '{@link de.joneug.mdal.mdal.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.joneug.mdal.mdal.impl.ModelImpl
   * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Al Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__AL_EXTENSIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.joneug.mdal.mdal.impl.AlExtensionImpl <em>Al Extension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.joneug.mdal.mdal.impl.AlExtensionImpl
   * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getAlExtension()
   * @generated
   */
  int AL_EXTENSION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__ID = 1;

  /**
   * The feature id for the '<em><b>Id Ranges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__ID_RANGES = 2;

  /**
   * The feature id for the '<em><b>Platform</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__PLATFORM = 3;

  /**
   * The feature id for the '<em><b>Publisher</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__PUBLISHER = 4;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__VERSION = 5;

  /**
   * The feature id for the '<em><b>Brief</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__BRIEF = 6;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__DESCRIPTION = 7;

  /**
   * The feature id for the '<em><b>Privacy Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__PRIVACY_STATEMENT = 8;

  /**
   * The feature id for the '<em><b>Eula</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__EULA = 9;

  /**
   * The feature id for the '<em><b>Help</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__HELP = 10;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__URL = 11;

  /**
   * The feature id for the '<em><b>Context Sensitive Help Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__CONTEXT_SENSITIVE_HELP_URL = 12;

  /**
   * The feature id for the '<em><b>Show My Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__SHOW_MY_CODE = 13;

  /**
   * The feature id for the '<em><b>Runtime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION__RUNTIME = 14;

  /**
   * The number of structural features of the '<em>Al Extension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_EXTENSION_FEATURE_COUNT = 15;

  /**
   * The meta object id for the '{@link de.joneug.mdal.mdal.impl.DocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.joneug.mdal.mdal.impl.DocumentImpl
   * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getDocument()
   * @generated
   */
  int DOCUMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.joneug.mdal.mdal.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.joneug.mdal.mdal.impl.FieldImpl
   * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getField()
   * @generated
   */
  int FIELD = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>No</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NO = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 3;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.joneug.mdal.mdal.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.joneug.mdal.mdal.impl.TypeImpl
   * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.joneug.mdal.mdal.impl.TypeTextImpl <em>Type Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.joneug.mdal.mdal.impl.TypeTextImpl
   * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getTypeText()
   * @generated
   */
  int TYPE_TEXT = 5;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TEXT__LENGTH = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TEXT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.joneug.mdal.mdal.impl.IdRangeImpl <em>Id Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.joneug.mdal.mdal.impl.IdRangeImpl
   * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getIdRange()
   * @generated
   */
  int ID_RANGE = 6;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_RANGE__MIN = 0;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_RANGE__MAX = 1;

  /**
   * The number of structural features of the '<em>Id Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_RANGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.joneug.mdal.mdal.Bool <em>Bool</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.joneug.mdal.mdal.Bool
   * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getBool()
   * @generated
   */
  int BOOL = 7;


  /**
   * Returns the meta object for class '{@link de.joneug.mdal.mdal.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.joneug.mdal.mdal.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.joneug.mdal.mdal.Model#getAlExtensions <em>Al Extensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Al Extensions</em>'.
   * @see de.joneug.mdal.mdal.Model#getAlExtensions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_AlExtensions();

  /**
   * Returns the meta object for class '{@link de.joneug.mdal.mdal.AlExtension <em>Al Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Al Extension</em>'.
   * @see de.joneug.mdal.mdal.AlExtension
   * @generated
   */
  EClass getAlExtension();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getName()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_Name();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getId()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_Id();

  /**
   * Returns the meta object for the containment reference list '{@link de.joneug.mdal.mdal.AlExtension#getIdRanges <em>Id Ranges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id Ranges</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getIdRanges()
   * @see #getAlExtension()
   * @generated
   */
  EReference getAlExtension_IdRanges();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getPlatform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Platform</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getPlatform()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_Platform();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getPublisher <em>Publisher</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Publisher</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getPublisher()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_Publisher();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getVersion()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_Version();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getBrief <em>Brief</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Brief</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getBrief()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_Brief();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getDescription()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_Description();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getPrivacyStatement <em>Privacy Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Privacy Statement</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getPrivacyStatement()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_PrivacyStatement();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getEula <em>Eula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Eula</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getEula()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_Eula();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getHelp <em>Help</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Help</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getHelp()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_Help();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getUrl()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_Url();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getContextSensitiveHelpUrl <em>Context Sensitive Help Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context Sensitive Help Url</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getContextSensitiveHelpUrl()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_ContextSensitiveHelpUrl();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getShowMyCode <em>Show My Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Show My Code</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getShowMyCode()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_ShowMyCode();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.AlExtension#getRuntime <em>Runtime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Runtime</em>'.
   * @see de.joneug.mdal.mdal.AlExtension#getRuntime()
   * @see #getAlExtension()
   * @generated
   */
  EAttribute getAlExtension_Runtime();

  /**
   * Returns the meta object for class '{@link de.joneug.mdal.mdal.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document</em>'.
   * @see de.joneug.mdal.mdal.Document
   * @generated
   */
  EClass getDocument();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.Document#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.joneug.mdal.mdal.Document#getName()
   * @see #getDocument()
   * @generated
   */
  EAttribute getDocument_Name();

  /**
   * Returns the meta object for class '{@link de.joneug.mdal.mdal.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see de.joneug.mdal.mdal.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.joneug.mdal.mdal.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.Field#getNo <em>No</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No</em>'.
   * @see de.joneug.mdal.mdal.Field#getNo()
   * @see #getField()
   * @generated
   */
  EAttribute getField_No();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.Field#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see de.joneug.mdal.mdal.Field#getDescription()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Description();

  /**
   * Returns the meta object for the containment reference '{@link de.joneug.mdal.mdal.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.joneug.mdal.mdal.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for class '{@link de.joneug.mdal.mdal.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.joneug.mdal.mdal.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link de.joneug.mdal.mdal.TypeText <em>Type Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Text</em>'.
   * @see de.joneug.mdal.mdal.TypeText
   * @generated
   */
  EClass getTypeText();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.TypeText#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see de.joneug.mdal.mdal.TypeText#getLength()
   * @see #getTypeText()
   * @generated
   */
  EAttribute getTypeText_Length();

  /**
   * Returns the meta object for class '{@link de.joneug.mdal.mdal.IdRange <em>Id Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Range</em>'.
   * @see de.joneug.mdal.mdal.IdRange
   * @generated
   */
  EClass getIdRange();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.IdRange#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see de.joneug.mdal.mdal.IdRange#getMin()
   * @see #getIdRange()
   * @generated
   */
  EAttribute getIdRange_Min();

  /**
   * Returns the meta object for the attribute '{@link de.joneug.mdal.mdal.IdRange#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see de.joneug.mdal.mdal.IdRange#getMax()
   * @see #getIdRange()
   * @generated
   */
  EAttribute getIdRange_Max();

  /**
   * Returns the meta object for enum '{@link de.joneug.mdal.mdal.Bool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Bool</em>'.
   * @see de.joneug.mdal.mdal.Bool
   * @generated
   */
  EEnum getBool();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MdalFactory getMdalFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.joneug.mdal.mdal.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.joneug.mdal.mdal.impl.ModelImpl
     * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Al Extensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__AL_EXTENSIONS = eINSTANCE.getModel_AlExtensions();

    /**
     * The meta object literal for the '{@link de.joneug.mdal.mdal.impl.AlExtensionImpl <em>Al Extension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.joneug.mdal.mdal.impl.AlExtensionImpl
     * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getAlExtension()
     * @generated
     */
    EClass AL_EXTENSION = eINSTANCE.getAlExtension();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__NAME = eINSTANCE.getAlExtension_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__ID = eINSTANCE.getAlExtension_Id();

    /**
     * The meta object literal for the '<em><b>Id Ranges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AL_EXTENSION__ID_RANGES = eINSTANCE.getAlExtension_IdRanges();

    /**
     * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__PLATFORM = eINSTANCE.getAlExtension_Platform();

    /**
     * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__PUBLISHER = eINSTANCE.getAlExtension_Publisher();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__VERSION = eINSTANCE.getAlExtension_Version();

    /**
     * The meta object literal for the '<em><b>Brief</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__BRIEF = eINSTANCE.getAlExtension_Brief();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__DESCRIPTION = eINSTANCE.getAlExtension_Description();

    /**
     * The meta object literal for the '<em><b>Privacy Statement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__PRIVACY_STATEMENT = eINSTANCE.getAlExtension_PrivacyStatement();

    /**
     * The meta object literal for the '<em><b>Eula</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__EULA = eINSTANCE.getAlExtension_Eula();

    /**
     * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__HELP = eINSTANCE.getAlExtension_Help();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__URL = eINSTANCE.getAlExtension_Url();

    /**
     * The meta object literal for the '<em><b>Context Sensitive Help Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__CONTEXT_SENSITIVE_HELP_URL = eINSTANCE.getAlExtension_ContextSensitiveHelpUrl();

    /**
     * The meta object literal for the '<em><b>Show My Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__SHOW_MY_CODE = eINSTANCE.getAlExtension_ShowMyCode();

    /**
     * The meta object literal for the '<em><b>Runtime</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AL_EXTENSION__RUNTIME = eINSTANCE.getAlExtension_Runtime();

    /**
     * The meta object literal for the '{@link de.joneug.mdal.mdal.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.joneug.mdal.mdal.impl.DocumentImpl
     * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getDocument()
     * @generated
     */
    EClass DOCUMENT = eINSTANCE.getDocument();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

    /**
     * The meta object literal for the '{@link de.joneug.mdal.mdal.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.joneug.mdal.mdal.impl.FieldImpl
     * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>No</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NO = eINSTANCE.getField_No();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__DESCRIPTION = eINSTANCE.getField_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '{@link de.joneug.mdal.mdal.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.joneug.mdal.mdal.impl.TypeImpl
     * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link de.joneug.mdal.mdal.impl.TypeTextImpl <em>Type Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.joneug.mdal.mdal.impl.TypeTextImpl
     * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getTypeText()
     * @generated
     */
    EClass TYPE_TEXT = eINSTANCE.getTypeText();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TEXT__LENGTH = eINSTANCE.getTypeText_Length();

    /**
     * The meta object literal for the '{@link de.joneug.mdal.mdal.impl.IdRangeImpl <em>Id Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.joneug.mdal.mdal.impl.IdRangeImpl
     * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getIdRange()
     * @generated
     */
    EClass ID_RANGE = eINSTANCE.getIdRange();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_RANGE__MIN = eINSTANCE.getIdRange_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_RANGE__MAX = eINSTANCE.getIdRange_Max();

    /**
     * The meta object literal for the '{@link de.joneug.mdal.mdal.Bool <em>Bool</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.joneug.mdal.mdal.Bool
     * @see de.joneug.mdal.mdal.impl.MdalPackageImpl#getBool()
     * @generated
     */
    EEnum BOOL = eINSTANCE.getBool();

  }

} //MdalPackage
