<?php
/**
 * CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.5.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_grades_get_enrolled_users_for_selector_200_response_users_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'address' => 'string',
        'auth' => 'string',
        'calendartype' => 'string',
        'city' => 'string',
        'confirmed' => 'bool',
        'country' => 'string',
        'customfields' => '\OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner[]',
        'department' => 'string',
        'description' => 'string',
        'descriptionformat' => 'int',
        'email' => 'string',
        'firstaccess' => 'int',
        'firstname' => 'string',
        'fullname' => 'string',
        'id' => 'int',
        'idnumber' => 'string',
        'institution' => 'string',
        'interests' => 'string',
        'lang' => 'string',
        'lastaccess' => 'int',
        'lastname' => 'string',
        'mailformat' => 'int',
        'phone1' => 'string',
        'phone2' => 'string',
        'preferences' => '\OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner[]',
        'profileimageurl' => 'string',
        'profileimageurlsmall' => 'string',
        'suspended' => 'bool',
        'theme' => 'string',
        'timezone' => 'string',
        'username' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'address' => null,
        'auth' => null,
        'calendartype' => null,
        'city' => null,
        'confirmed' => null,
        'country' => null,
        'customfields' => null,
        'department' => null,
        'description' => null,
        'descriptionformat' => null,
        'email' => null,
        'firstaccess' => null,
        'firstname' => null,
        'fullname' => null,
        'id' => null,
        'idnumber' => null,
        'institution' => null,
        'interests' => null,
        'lang' => null,
        'lastaccess' => null,
        'lastname' => null,
        'mailformat' => null,
        'phone1' => null,
        'phone2' => null,
        'preferences' => null,
        'profileimageurl' => null,
        'profileimageurlsmall' => null,
        'suspended' => null,
        'theme' => null,
        'timezone' => null,
        'username' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'address' => false,
        'auth' => false,
        'calendartype' => false,
        'city' => false,
        'confirmed' => false,
        'country' => false,
        'customfields' => false,
        'department' => false,
        'description' => false,
        'descriptionformat' => false,
        'email' => false,
        'firstaccess' => false,
        'firstname' => false,
        'fullname' => false,
        'id' => false,
        'idnumber' => false,
        'institution' => false,
        'interests' => false,
        'lang' => false,
        'lastaccess' => false,
        'lastname' => false,
        'mailformat' => false,
        'phone1' => false,
        'phone2' => false,
        'preferences' => false,
        'profileimageurl' => false,
        'profileimageurlsmall' => false,
        'suspended' => false,
        'theme' => false,
        'timezone' => false,
        'username' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'address' => 'address',
        'auth' => 'auth',
        'calendartype' => 'calendartype',
        'city' => 'city',
        'confirmed' => 'confirmed',
        'country' => 'country',
        'customfields' => 'customfields',
        'department' => 'department',
        'description' => 'description',
        'descriptionformat' => 'descriptionformat',
        'email' => 'email',
        'firstaccess' => 'firstaccess',
        'firstname' => 'firstname',
        'fullname' => 'fullname',
        'id' => 'id',
        'idnumber' => 'idnumber',
        'institution' => 'institution',
        'interests' => 'interests',
        'lang' => 'lang',
        'lastaccess' => 'lastaccess',
        'lastname' => 'lastname',
        'mailformat' => 'mailformat',
        'phone1' => 'phone1',
        'phone2' => 'phone2',
        'preferences' => 'preferences',
        'profileimageurl' => 'profileimageurl',
        'profileimageurlsmall' => 'profileimageurlsmall',
        'suspended' => 'suspended',
        'theme' => 'theme',
        'timezone' => 'timezone',
        'username' => 'username'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'address' => 'setAddress',
        'auth' => 'setAuth',
        'calendartype' => 'setCalendartype',
        'city' => 'setCity',
        'confirmed' => 'setConfirmed',
        'country' => 'setCountry',
        'customfields' => 'setCustomfields',
        'department' => 'setDepartment',
        'description' => 'setDescription',
        'descriptionformat' => 'setDescriptionformat',
        'email' => 'setEmail',
        'firstaccess' => 'setFirstaccess',
        'firstname' => 'setFirstname',
        'fullname' => 'setFullname',
        'id' => 'setId',
        'idnumber' => 'setIdnumber',
        'institution' => 'setInstitution',
        'interests' => 'setInterests',
        'lang' => 'setLang',
        'lastaccess' => 'setLastaccess',
        'lastname' => 'setLastname',
        'mailformat' => 'setMailformat',
        'phone1' => 'setPhone1',
        'phone2' => 'setPhone2',
        'preferences' => 'setPreferences',
        'profileimageurl' => 'setProfileimageurl',
        'profileimageurlsmall' => 'setProfileimageurlsmall',
        'suspended' => 'setSuspended',
        'theme' => 'setTheme',
        'timezone' => 'setTimezone',
        'username' => 'setUsername'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'address' => 'getAddress',
        'auth' => 'getAuth',
        'calendartype' => 'getCalendartype',
        'city' => 'getCity',
        'confirmed' => 'getConfirmed',
        'country' => 'getCountry',
        'customfields' => 'getCustomfields',
        'department' => 'getDepartment',
        'description' => 'getDescription',
        'descriptionformat' => 'getDescriptionformat',
        'email' => 'getEmail',
        'firstaccess' => 'getFirstaccess',
        'firstname' => 'getFirstname',
        'fullname' => 'getFullname',
        'id' => 'getId',
        'idnumber' => 'getIdnumber',
        'institution' => 'getInstitution',
        'interests' => 'getInterests',
        'lang' => 'getLang',
        'lastaccess' => 'getLastaccess',
        'lastname' => 'getLastname',
        'mailformat' => 'getMailformat',
        'phone1' => 'getPhone1',
        'phone2' => 'getPhone2',
        'preferences' => 'getPreferences',
        'profileimageurl' => 'getProfileimageurl',
        'profileimageurlsmall' => 'getProfileimageurlsmall',
        'suspended' => 'getSuspended',
        'theme' => 'getTheme',
        'timezone' => 'getTimezone',
        'username' => 'getUsername'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('address', $data ?? [], 'null');
        $this->setIfExists('auth', $data ?? [], 'null');
        $this->setIfExists('calendartype', $data ?? [], 'null');
        $this->setIfExists('city', $data ?? [], 'null');
        $this->setIfExists('confirmed', $data ?? [], null);
        $this->setIfExists('country', $data ?? [], 'null');
        $this->setIfExists('customfields', $data ?? [], null);
        $this->setIfExists('department', $data ?? [], 'null');
        $this->setIfExists('description', $data ?? [], 'null');
        $this->setIfExists('descriptionformat', $data ?? [], null);
        $this->setIfExists('email', $data ?? [], null);
        $this->setIfExists('firstaccess', $data ?? [], null);
        $this->setIfExists('firstname', $data ?? [], null);
        $this->setIfExists('fullname', $data ?? [], 'null');
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('idnumber', $data ?? [], 'null');
        $this->setIfExists('institution', $data ?? [], 'null');
        $this->setIfExists('interests', $data ?? [], 'null');
        $this->setIfExists('lang', $data ?? [], 'null');
        $this->setIfExists('lastaccess', $data ?? [], null);
        $this->setIfExists('lastname', $data ?? [], null);
        $this->setIfExists('mailformat', $data ?? [], null);
        $this->setIfExists('phone1', $data ?? [], 'null');
        $this->setIfExists('phone2', $data ?? [], 'null');
        $this->setIfExists('preferences', $data ?? [], null);
        $this->setIfExists('profileimageurl', $data ?? [], 'null');
        $this->setIfExists('profileimageurlsmall', $data ?? [], 'null');
        $this->setIfExists('suspended', $data ?? [], null);
        $this->setIfExists('theme', $data ?? [], 'null');
        $this->setIfExists('timezone', $data ?? [], 'null');
        $this->setIfExists('username', $data ?? [], 'null');
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets address
     *
     * @return string|null
     */
    public function getAddress()
    {
        return $this->container['address'];
    }

    /**
     * Sets address
     *
     * @param string|null $address Postal address
     *
     * @return self
     */
    public function setAddress($address)
    {
        if (is_null($address)) {
            throw new \InvalidArgumentException('non-nullable address cannot be null');
        }
        $this->container['address'] = $address;

        return $this;
    }

    /**
     * Gets auth
     *
     * @return string|null
     */
    public function getAuth()
    {
        return $this->container['auth'];
    }

    /**
     * Sets auth
     *
     * @param string|null $auth Auth plugins include manual, ldap, etc
     *
     * @return self
     */
    public function setAuth($auth)
    {
        if (is_null($auth)) {
            throw new \InvalidArgumentException('non-nullable auth cannot be null');
        }
        $this->container['auth'] = $auth;

        return $this;
    }

    /**
     * Gets calendartype
     *
     * @return string|null
     */
    public function getCalendartype()
    {
        return $this->container['calendartype'];
    }

    /**
     * Sets calendartype
     *
     * @param string|null $calendartype Calendar type such as \"gregorian\", must exist on server
     *
     * @return self
     */
    public function setCalendartype($calendartype)
    {
        if (is_null($calendartype)) {
            throw new \InvalidArgumentException('non-nullable calendartype cannot be null');
        }
        $this->container['calendartype'] = $calendartype;

        return $this;
    }

    /**
     * Gets city
     *
     * @return string|null
     */
    public function getCity()
    {
        return $this->container['city'];
    }

    /**
     * Sets city
     *
     * @param string|null $city Home city of the user
     *
     * @return self
     */
    public function setCity($city)
    {
        if (is_null($city)) {
            throw new \InvalidArgumentException('non-nullable city cannot be null');
        }
        $this->container['city'] = $city;

        return $this;
    }

    /**
     * Gets confirmed
     *
     * @return bool|null
     */
    public function getConfirmed()
    {
        return $this->container['confirmed'];
    }

    /**
     * Sets confirmed
     *
     * @param bool|null $confirmed Active user: 1 if confirmed, 0 otherwise
     *
     * @return self
     */
    public function setConfirmed($confirmed)
    {
        if (is_null($confirmed)) {
            throw new \InvalidArgumentException('non-nullable confirmed cannot be null');
        }
        $this->container['confirmed'] = $confirmed;

        return $this;
    }

    /**
     * Gets country
     *
     * @return string|null
     */
    public function getCountry()
    {
        return $this->container['country'];
    }

    /**
     * Sets country
     *
     * @param string|null $country Home country code of the user, such as AU or CZ
     *
     * @return self
     */
    public function setCountry($country)
    {
        if (is_null($country)) {
            throw new \InvalidArgumentException('non-nullable country cannot be null');
        }
        $this->container['country'] = $country;

        return $this;
    }

    /**
     * Gets customfields
     *
     * @return \OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner[]|null
     */
    public function getCustomfields()
    {
        return $this->container['customfields'];
    }

    /**
     * Sets customfields
     *
     * @param \OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner[]|null $customfields customfields
     *
     * @return self
     */
    public function setCustomfields($customfields)
    {
        if (is_null($customfields)) {
            throw new \InvalidArgumentException('non-nullable customfields cannot be null');
        }
        $this->container['customfields'] = $customfields;

        return $this;
    }

    /**
     * Gets department
     *
     * @return string|null
     */
    public function getDepartment()
    {
        return $this->container['department'];
    }

    /**
     * Sets department
     *
     * @param string|null $department department
     *
     * @return self
     */
    public function setDepartment($department)
    {
        if (is_null($department)) {
            throw new \InvalidArgumentException('non-nullable department cannot be null');
        }
        $this->container['department'] = $department;

        return $this;
    }

    /**
     * Gets description
     *
     * @return string|null
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     *
     * @param string|null $description User profile description
     *
     * @return self
     */
    public function setDescription($description)
    {
        if (is_null($description)) {
            throw new \InvalidArgumentException('non-nullable description cannot be null');
        }
        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets descriptionformat
     *
     * @return int|null
     */
    public function getDescriptionformat()
    {
        return $this->container['descriptionformat'];
    }

    /**
     * Sets descriptionformat
     *
     * @param int|null $descriptionformat int format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     *
     * @return self
     */
    public function setDescriptionformat($descriptionformat)
    {
        if (is_null($descriptionformat)) {
            throw new \InvalidArgumentException('non-nullable descriptionformat cannot be null');
        }
        $this->container['descriptionformat'] = $descriptionformat;

        return $this;
    }

    /**
     * Gets email
     *
     * @return string|null
     */
    public function getEmail()
    {
        return $this->container['email'];
    }

    /**
     * Sets email
     *
     * @param string|null $email An email address - allow email as root@localhost
     *
     * @return self
     */
    public function setEmail($email)
    {
        if (is_null($email)) {
            throw new \InvalidArgumentException('non-nullable email cannot be null');
        }
        $this->container['email'] = $email;

        return $this;
    }

    /**
     * Gets firstaccess
     *
     * @return int|null
     */
    public function getFirstaccess()
    {
        return $this->container['firstaccess'];
    }

    /**
     * Sets firstaccess
     *
     * @param int|null $firstaccess first access to the site (0 if never)
     *
     * @return self
     */
    public function setFirstaccess($firstaccess)
    {
        if (is_null($firstaccess)) {
            throw new \InvalidArgumentException('non-nullable firstaccess cannot be null');
        }
        $this->container['firstaccess'] = $firstaccess;

        return $this;
    }

    /**
     * Gets firstname
     *
     * @return string|null
     */
    public function getFirstname()
    {
        return $this->container['firstname'];
    }

    /**
     * Sets firstname
     *
     * @param string|null $firstname The first name(s) of the user
     *
     * @return self
     */
    public function setFirstname($firstname)
    {
        if (is_null($firstname)) {
            throw new \InvalidArgumentException('non-nullable firstname cannot be null');
        }
        $this->container['firstname'] = $firstname;

        return $this;
    }

    /**
     * Gets fullname
     *
     * @return string|null
     */
    public function getFullname()
    {
        return $this->container['fullname'];
    }

    /**
     * Sets fullname
     *
     * @param string|null $fullname The fullname of the user
     *
     * @return self
     */
    public function setFullname($fullname)
    {
        if (is_null($fullname)) {
            throw new \InvalidArgumentException('non-nullable fullname cannot be null');
        }
        $this->container['fullname'] = $fullname;

        return $this;
    }

    /**
     * Gets id
     *
     * @return int|null
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int|null $id ID of the user
     *
     * @return self
     */
    public function setId($id)
    {
        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets idnumber
     *
     * @return string|null
     */
    public function getIdnumber()
    {
        return $this->container['idnumber'];
    }

    /**
     * Sets idnumber
     *
     * @param string|null $idnumber An arbitrary ID code number perhaps from the institution
     *
     * @return self
     */
    public function setIdnumber($idnumber)
    {
        if (is_null($idnumber)) {
            throw new \InvalidArgumentException('non-nullable idnumber cannot be null');
        }
        $this->container['idnumber'] = $idnumber;

        return $this;
    }

    /**
     * Gets institution
     *
     * @return string|null
     */
    public function getInstitution()
    {
        return $this->container['institution'];
    }

    /**
     * Sets institution
     *
     * @param string|null $institution institution
     *
     * @return self
     */
    public function setInstitution($institution)
    {
        if (is_null($institution)) {
            throw new \InvalidArgumentException('non-nullable institution cannot be null');
        }
        $this->container['institution'] = $institution;

        return $this;
    }

    /**
     * Gets interests
     *
     * @return string|null
     */
    public function getInterests()
    {
        return $this->container['interests'];
    }

    /**
     * Sets interests
     *
     * @param string|null $interests user interests (separated by commas)
     *
     * @return self
     */
    public function setInterests($interests)
    {
        if (is_null($interests)) {
            throw new \InvalidArgumentException('non-nullable interests cannot be null');
        }
        $this->container['interests'] = $interests;

        return $this;
    }

    /**
     * Gets lang
     *
     * @return string|null
     */
    public function getLang()
    {
        return $this->container['lang'];
    }

    /**
     * Sets lang
     *
     * @param string|null $lang Language code such as \"en\", must exist on server
     *
     * @return self
     */
    public function setLang($lang)
    {
        if (is_null($lang)) {
            throw new \InvalidArgumentException('non-nullable lang cannot be null');
        }
        $this->container['lang'] = $lang;

        return $this;
    }

    /**
     * Gets lastaccess
     *
     * @return int|null
     */
    public function getLastaccess()
    {
        return $this->container['lastaccess'];
    }

    /**
     * Sets lastaccess
     *
     * @param int|null $lastaccess last access to the site (0 if never)
     *
     * @return self
     */
    public function setLastaccess($lastaccess)
    {
        if (is_null($lastaccess)) {
            throw new \InvalidArgumentException('non-nullable lastaccess cannot be null');
        }
        $this->container['lastaccess'] = $lastaccess;

        return $this;
    }

    /**
     * Gets lastname
     *
     * @return string|null
     */
    public function getLastname()
    {
        return $this->container['lastname'];
    }

    /**
     * Sets lastname
     *
     * @param string|null $lastname The family name of the user
     *
     * @return self
     */
    public function setLastname($lastname)
    {
        if (is_null($lastname)) {
            throw new \InvalidArgumentException('non-nullable lastname cannot be null');
        }
        $this->container['lastname'] = $lastname;

        return $this;
    }

    /**
     * Gets mailformat
     *
     * @return int|null
     */
    public function getMailformat()
    {
        return $this->container['mailformat'];
    }

    /**
     * Sets mailformat
     *
     * @param int|null $mailformat Mail format code is 0 for plain text, 1 for HTML etc
     *
     * @return self
     */
    public function setMailformat($mailformat)
    {
        if (is_null($mailformat)) {
            throw new \InvalidArgumentException('non-nullable mailformat cannot be null');
        }
        $this->container['mailformat'] = $mailformat;

        return $this;
    }

    /**
     * Gets phone1
     *
     * @return string|null
     */
    public function getPhone1()
    {
        return $this->container['phone1'];
    }

    /**
     * Sets phone1
     *
     * @param string|null $phone1 Phone 1
     *
     * @return self
     */
    public function setPhone1($phone1)
    {
        if (is_null($phone1)) {
            throw new \InvalidArgumentException('non-nullable phone1 cannot be null');
        }
        $this->container['phone1'] = $phone1;

        return $this;
    }

    /**
     * Gets phone2
     *
     * @return string|null
     */
    public function getPhone2()
    {
        return $this->container['phone2'];
    }

    /**
     * Sets phone2
     *
     * @param string|null $phone2 Phone 2
     *
     * @return self
     */
    public function setPhone2($phone2)
    {
        if (is_null($phone2)) {
            throw new \InvalidArgumentException('non-nullable phone2 cannot be null');
        }
        $this->container['phone2'] = $phone2;

        return $this;
    }

    /**
     * Gets preferences
     *
     * @return \OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner[]|null
     */
    public function getPreferences()
    {
        return $this->container['preferences'];
    }

    /**
     * Sets preferences
     *
     * @param \OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner[]|null $preferences preferences
     *
     * @return self
     */
    public function setPreferences($preferences)
    {
        if (is_null($preferences)) {
            throw new \InvalidArgumentException('non-nullable preferences cannot be null');
        }
        $this->container['preferences'] = $preferences;

        return $this;
    }

    /**
     * Gets profileimageurl
     *
     * @return string|null
     */
    public function getProfileimageurl()
    {
        return $this->container['profileimageurl'];
    }

    /**
     * Sets profileimageurl
     *
     * @param string|null $profileimageurl User image profile URL - big version
     *
     * @return self
     */
    public function setProfileimageurl($profileimageurl)
    {
        if (is_null($profileimageurl)) {
            throw new \InvalidArgumentException('non-nullable profileimageurl cannot be null');
        }
        $this->container['profileimageurl'] = $profileimageurl;

        return $this;
    }

    /**
     * Gets profileimageurlsmall
     *
     * @return string|null
     */
    public function getProfileimageurlsmall()
    {
        return $this->container['profileimageurlsmall'];
    }

    /**
     * Sets profileimageurlsmall
     *
     * @param string|null $profileimageurlsmall User image profile URL - small version
     *
     * @return self
     */
    public function setProfileimageurlsmall($profileimageurlsmall)
    {
        if (is_null($profileimageurlsmall)) {
            throw new \InvalidArgumentException('non-nullable profileimageurlsmall cannot be null');
        }
        $this->container['profileimageurlsmall'] = $profileimageurlsmall;

        return $this;
    }

    /**
     * Gets suspended
     *
     * @return bool|null
     */
    public function getSuspended()
    {
        return $this->container['suspended'];
    }

    /**
     * Sets suspended
     *
     * @param bool|null $suspended Suspend user account, either false to enable user login or true to disable it
     *
     * @return self
     */
    public function setSuspended($suspended)
    {
        if (is_null($suspended)) {
            throw new \InvalidArgumentException('non-nullable suspended cannot be null');
        }
        $this->container['suspended'] = $suspended;

        return $this;
    }

    /**
     * Gets theme
     *
     * @return string|null
     */
    public function getTheme()
    {
        return $this->container['theme'];
    }

    /**
     * Sets theme
     *
     * @param string|null $theme Theme name such as \"standard\", must exist on server
     *
     * @return self
     */
    public function setTheme($theme)
    {
        if (is_null($theme)) {
            throw new \InvalidArgumentException('non-nullable theme cannot be null');
        }
        $this->container['theme'] = $theme;

        return $this;
    }

    /**
     * Gets timezone
     *
     * @return string|null
     */
    public function getTimezone()
    {
        return $this->container['timezone'];
    }

    /**
     * Sets timezone
     *
     * @param string|null $timezone Timezone code such as Australia/Perth, or 99 for default
     *
     * @return self
     */
    public function setTimezone($timezone)
    {
        if (is_null($timezone)) {
            throw new \InvalidArgumentException('non-nullable timezone cannot be null');
        }
        $this->container['timezone'] = $timezone;

        return $this;
    }

    /**
     * Gets username
     *
     * @return string|null
     */
    public function getUsername()
    {
        return $this->container['username'];
    }

    /**
     * Sets username
     *
     * @param string|null $username The username
     *
     * @return self
     */
    public function setUsername($username)
    {
        if (is_null($username)) {
            throw new \InvalidArgumentException('non-nullable username cannot be null');
        }
        $this->container['username'] = $username;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


