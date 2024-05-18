<?php
/**
 * ModLtiGetLtisByCourses200ResponseLtisInner
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
 * ModLtiGetLtisByCourses200ResponseLtisInner Class Doc Comment
 *
 * @category Class
 * @description Tool
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModLtiGetLtisByCourses200ResponseLtisInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_lti_get_ltis_by_courses_200_response_ltis_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'course' => 'int',
        'coursemodule' => 'int',
        'debuglaunch' => 'int',
        'grade' => 'int',
        'groupingid' => 'int',
        'groupmode' => 'int',
        'icon' => 'string',
        'id' => 'int',
        'instructorchoiceacceptgrades' => 'int',
        'instructorchoiceallowroster' => 'int',
        'instructorchoiceallowsetting' => 'int',
        'instructorchoicesendemailaddr' => 'int',
        'instructorchoicesendname' => 'string',
        'instructorcustomparameters' => 'string',
        'intro' => 'string',
        'introfiles' => '\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]',
        'introformat' => 'int',
        'lang' => 'string',
        'launchcontainer' => 'int',
        'name' => 'string',
        'password' => 'string',
        'resourcekey' => 'string',
        'section' => 'int',
        'secureicon' => 'string',
        'securetoolurl' => 'string',
        'servicesalt' => 'string',
        'showdescriptionlaunch' => 'int',
        'showtitlelaunch' => 'int',
        'timecreated' => 'int',
        'timemodified' => 'int',
        'toolurl' => 'string',
        'typeid' => 'int',
        'visible' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'course' => null,
        'coursemodule' => null,
        'debuglaunch' => null,
        'grade' => null,
        'groupingid' => null,
        'groupmode' => null,
        'icon' => null,
        'id' => null,
        'instructorchoiceacceptgrades' => null,
        'instructorchoiceallowroster' => null,
        'instructorchoiceallowsetting' => null,
        'instructorchoicesendemailaddr' => null,
        'instructorchoicesendname' => null,
        'instructorcustomparameters' => null,
        'intro' => null,
        'introfiles' => null,
        'introformat' => null,
        'lang' => null,
        'launchcontainer' => null,
        'name' => null,
        'password' => null,
        'resourcekey' => null,
        'section' => null,
        'secureicon' => null,
        'securetoolurl' => null,
        'servicesalt' => null,
        'showdescriptionlaunch' => null,
        'showtitlelaunch' => null,
        'timecreated' => null,
        'timemodified' => null,
        'toolurl' => null,
        'typeid' => null,
        'visible' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'course' => false,
        'coursemodule' => false,
        'debuglaunch' => false,
        'grade' => false,
        'groupingid' => false,
        'groupmode' => false,
        'icon' => false,
        'id' => false,
        'instructorchoiceacceptgrades' => false,
        'instructorchoiceallowroster' => false,
        'instructorchoiceallowsetting' => false,
        'instructorchoicesendemailaddr' => false,
        'instructorchoicesendname' => false,
        'instructorcustomparameters' => false,
        'intro' => false,
        'introfiles' => false,
        'introformat' => false,
        'lang' => false,
        'launchcontainer' => false,
        'name' => false,
        'password' => false,
        'resourcekey' => false,
        'section' => false,
        'secureicon' => false,
        'securetoolurl' => false,
        'servicesalt' => false,
        'showdescriptionlaunch' => false,
        'showtitlelaunch' => false,
        'timecreated' => false,
        'timemodified' => false,
        'toolurl' => false,
        'typeid' => false,
        'visible' => false
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
        'course' => 'course',
        'coursemodule' => 'coursemodule',
        'debuglaunch' => 'debuglaunch',
        'grade' => 'grade',
        'groupingid' => 'groupingid',
        'groupmode' => 'groupmode',
        'icon' => 'icon',
        'id' => 'id',
        'instructorchoiceacceptgrades' => 'instructorchoiceacceptgrades',
        'instructorchoiceallowroster' => 'instructorchoiceallowroster',
        'instructorchoiceallowsetting' => 'instructorchoiceallowsetting',
        'instructorchoicesendemailaddr' => 'instructorchoicesendemailaddr',
        'instructorchoicesendname' => 'instructorchoicesendname',
        'instructorcustomparameters' => 'instructorcustomparameters',
        'intro' => 'intro',
        'introfiles' => 'introfiles',
        'introformat' => 'introformat',
        'lang' => 'lang',
        'launchcontainer' => 'launchcontainer',
        'name' => 'name',
        'password' => 'password',
        'resourcekey' => 'resourcekey',
        'section' => 'section',
        'secureicon' => 'secureicon',
        'securetoolurl' => 'securetoolurl',
        'servicesalt' => 'servicesalt',
        'showdescriptionlaunch' => 'showdescriptionlaunch',
        'showtitlelaunch' => 'showtitlelaunch',
        'timecreated' => 'timecreated',
        'timemodified' => 'timemodified',
        'toolurl' => 'toolurl',
        'typeid' => 'typeid',
        'visible' => 'visible'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'course' => 'setCourse',
        'coursemodule' => 'setCoursemodule',
        'debuglaunch' => 'setDebuglaunch',
        'grade' => 'setGrade',
        'groupingid' => 'setGroupingid',
        'groupmode' => 'setGroupmode',
        'icon' => 'setIcon',
        'id' => 'setId',
        'instructorchoiceacceptgrades' => 'setInstructorchoiceacceptgrades',
        'instructorchoiceallowroster' => 'setInstructorchoiceallowroster',
        'instructorchoiceallowsetting' => 'setInstructorchoiceallowsetting',
        'instructorchoicesendemailaddr' => 'setInstructorchoicesendemailaddr',
        'instructorchoicesendname' => 'setInstructorchoicesendname',
        'instructorcustomparameters' => 'setInstructorcustomparameters',
        'intro' => 'setIntro',
        'introfiles' => 'setIntrofiles',
        'introformat' => 'setIntroformat',
        'lang' => 'setLang',
        'launchcontainer' => 'setLaunchcontainer',
        'name' => 'setName',
        'password' => 'setPassword',
        'resourcekey' => 'setResourcekey',
        'section' => 'setSection',
        'secureicon' => 'setSecureicon',
        'securetoolurl' => 'setSecuretoolurl',
        'servicesalt' => 'setServicesalt',
        'showdescriptionlaunch' => 'setShowdescriptionlaunch',
        'showtitlelaunch' => 'setShowtitlelaunch',
        'timecreated' => 'setTimecreated',
        'timemodified' => 'setTimemodified',
        'toolurl' => 'setToolurl',
        'typeid' => 'setTypeid',
        'visible' => 'setVisible'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'course' => 'getCourse',
        'coursemodule' => 'getCoursemodule',
        'debuglaunch' => 'getDebuglaunch',
        'grade' => 'getGrade',
        'groupingid' => 'getGroupingid',
        'groupmode' => 'getGroupmode',
        'icon' => 'getIcon',
        'id' => 'getId',
        'instructorchoiceacceptgrades' => 'getInstructorchoiceacceptgrades',
        'instructorchoiceallowroster' => 'getInstructorchoiceallowroster',
        'instructorchoiceallowsetting' => 'getInstructorchoiceallowsetting',
        'instructorchoicesendemailaddr' => 'getInstructorchoicesendemailaddr',
        'instructorchoicesendname' => 'getInstructorchoicesendname',
        'instructorcustomparameters' => 'getInstructorcustomparameters',
        'intro' => 'getIntro',
        'introfiles' => 'getIntrofiles',
        'introformat' => 'getIntroformat',
        'lang' => 'getLang',
        'launchcontainer' => 'getLaunchcontainer',
        'name' => 'getName',
        'password' => 'getPassword',
        'resourcekey' => 'getResourcekey',
        'section' => 'getSection',
        'secureicon' => 'getSecureicon',
        'securetoolurl' => 'getSecuretoolurl',
        'servicesalt' => 'getServicesalt',
        'showdescriptionlaunch' => 'getShowdescriptionlaunch',
        'showtitlelaunch' => 'getShowtitlelaunch',
        'timecreated' => 'getTimecreated',
        'timemodified' => 'getTimemodified',
        'toolurl' => 'getToolurl',
        'typeid' => 'getTypeid',
        'visible' => 'getVisible'
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
        $this->setIfExists('course', $data ?? [], null);
        $this->setIfExists('coursemodule', $data ?? [], null);
        $this->setIfExists('debuglaunch', $data ?? [], null);
        $this->setIfExists('grade', $data ?? [], null);
        $this->setIfExists('groupingid', $data ?? [], null);
        $this->setIfExists('groupmode', $data ?? [], null);
        $this->setIfExists('icon', $data ?? [], 'null');
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('instructorchoiceacceptgrades', $data ?? [], null);
        $this->setIfExists('instructorchoiceallowroster', $data ?? [], null);
        $this->setIfExists('instructorchoiceallowsetting', $data ?? [], null);
        $this->setIfExists('instructorchoicesendemailaddr', $data ?? [], null);
        $this->setIfExists('instructorchoicesendname', $data ?? [], 'null');
        $this->setIfExists('instructorcustomparameters', $data ?? [], 'null');
        $this->setIfExists('intro', $data ?? [], null);
        $this->setIfExists('introfiles', $data ?? [], null);
        $this->setIfExists('introformat', $data ?? [], null);
        $this->setIfExists('lang', $data ?? [], null);
        $this->setIfExists('launchcontainer', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('password', $data ?? [], 'null');
        $this->setIfExists('resourcekey', $data ?? [], 'null');
        $this->setIfExists('section', $data ?? [], null);
        $this->setIfExists('secureicon', $data ?? [], 'null');
        $this->setIfExists('securetoolurl', $data ?? [], 'null');
        $this->setIfExists('servicesalt', $data ?? [], 'null');
        $this->setIfExists('showdescriptionlaunch', $data ?? [], null);
        $this->setIfExists('showtitlelaunch', $data ?? [], null);
        $this->setIfExists('timecreated', $data ?? [], null);
        $this->setIfExists('timemodified', $data ?? [], null);
        $this->setIfExists('toolurl', $data ?? [], 'null');
        $this->setIfExists('typeid', $data ?? [], null);
        $this->setIfExists('visible', $data ?? [], null);
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
     * Gets course
     *
     * @return int|null
     */
    public function getCourse()
    {
        return $this->container['course'];
    }

    /**
     * Sets course
     *
     * @param int|null $course Course id
     *
     * @return self
     */
    public function setCourse($course)
    {
        if (is_null($course)) {
            throw new \InvalidArgumentException('non-nullable course cannot be null');
        }
        $this->container['course'] = $course;

        return $this;
    }

    /**
     * Gets coursemodule
     *
     * @return int|null
     */
    public function getCoursemodule()
    {
        return $this->container['coursemodule'];
    }

    /**
     * Sets coursemodule
     *
     * @param int|null $coursemodule Course module id
     *
     * @return self
     */
    public function setCoursemodule($coursemodule)
    {
        if (is_null($coursemodule)) {
            throw new \InvalidArgumentException('non-nullable coursemodule cannot be null');
        }
        $this->container['coursemodule'] = $coursemodule;

        return $this;
    }

    /**
     * Gets debuglaunch
     *
     * @return int|null
     */
    public function getDebuglaunch()
    {
        return $this->container['debuglaunch'];
    }

    /**
     * Sets debuglaunch
     *
     * @param int|null $debuglaunch Debug launch
     *
     * @return self
     */
    public function setDebuglaunch($debuglaunch)
    {
        if (is_null($debuglaunch)) {
            throw new \InvalidArgumentException('non-nullable debuglaunch cannot be null');
        }
        $this->container['debuglaunch'] = $debuglaunch;

        return $this;
    }

    /**
     * Gets grade
     *
     * @return int|null
     */
    public function getGrade()
    {
        return $this->container['grade'];
    }

    /**
     * Sets grade
     *
     * @param int|null $grade Enable grades
     *
     * @return self
     */
    public function setGrade($grade)
    {
        if (is_null($grade)) {
            throw new \InvalidArgumentException('non-nullable grade cannot be null');
        }
        $this->container['grade'] = $grade;

        return $this;
    }

    /**
     * Gets groupingid
     *
     * @return int|null
     */
    public function getGroupingid()
    {
        return $this->container['groupingid'];
    }

    /**
     * Sets groupingid
     *
     * @param int|null $groupingid Group id
     *
     * @return self
     */
    public function setGroupingid($groupingid)
    {
        if (is_null($groupingid)) {
            throw new \InvalidArgumentException('non-nullable groupingid cannot be null');
        }
        $this->container['groupingid'] = $groupingid;

        return $this;
    }

    /**
     * Gets groupmode
     *
     * @return int|null
     */
    public function getGroupmode()
    {
        return $this->container['groupmode'];
    }

    /**
     * Sets groupmode
     *
     * @param int|null $groupmode Group mode
     *
     * @return self
     */
    public function setGroupmode($groupmode)
    {
        if (is_null($groupmode)) {
            throw new \InvalidArgumentException('non-nullable groupmode cannot be null');
        }
        $this->container['groupmode'] = $groupmode;

        return $this;
    }

    /**
     * Gets icon
     *
     * @return string|null
     */
    public function getIcon()
    {
        return $this->container['icon'];
    }

    /**
     * Sets icon
     *
     * @param string|null $icon Alternative icon URL
     *
     * @return self
     */
    public function setIcon($icon)
    {
        if (is_null($icon)) {
            throw new \InvalidArgumentException('non-nullable icon cannot be null');
        }
        $this->container['icon'] = $icon;

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
     * @param int|null $id Activity instance id
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
     * Gets instructorchoiceacceptgrades
     *
     * @return int|null
     */
    public function getInstructorchoiceacceptgrades()
    {
        return $this->container['instructorchoiceacceptgrades'];
    }

    /**
     * Sets instructorchoiceacceptgrades
     *
     * @param int|null $instructorchoiceacceptgrades instructor choice accept grades
     *
     * @return self
     */
    public function setInstructorchoiceacceptgrades($instructorchoiceacceptgrades)
    {
        if (is_null($instructorchoiceacceptgrades)) {
            throw new \InvalidArgumentException('non-nullable instructorchoiceacceptgrades cannot be null');
        }
        $this->container['instructorchoiceacceptgrades'] = $instructorchoiceacceptgrades;

        return $this;
    }

    /**
     * Gets instructorchoiceallowroster
     *
     * @return int|null
     */
    public function getInstructorchoiceallowroster()
    {
        return $this->container['instructorchoiceallowroster'];
    }

    /**
     * Sets instructorchoiceallowroster
     *
     * @param int|null $instructorchoiceallowroster Instructor choice allow roster
     *
     * @return self
     */
    public function setInstructorchoiceallowroster($instructorchoiceallowroster)
    {
        if (is_null($instructorchoiceallowroster)) {
            throw new \InvalidArgumentException('non-nullable instructorchoiceallowroster cannot be null');
        }
        $this->container['instructorchoiceallowroster'] = $instructorchoiceallowroster;

        return $this;
    }

    /**
     * Gets instructorchoiceallowsetting
     *
     * @return int|null
     */
    public function getInstructorchoiceallowsetting()
    {
        return $this->container['instructorchoiceallowsetting'];
    }

    /**
     * Sets instructorchoiceallowsetting
     *
     * @param int|null $instructorchoiceallowsetting Instructor choice allow setting
     *
     * @return self
     */
    public function setInstructorchoiceallowsetting($instructorchoiceallowsetting)
    {
        if (is_null($instructorchoiceallowsetting)) {
            throw new \InvalidArgumentException('non-nullable instructorchoiceallowsetting cannot be null');
        }
        $this->container['instructorchoiceallowsetting'] = $instructorchoiceallowsetting;

        return $this;
    }

    /**
     * Gets instructorchoicesendemailaddr
     *
     * @return int|null
     */
    public function getInstructorchoicesendemailaddr()
    {
        return $this->container['instructorchoicesendemailaddr'];
    }

    /**
     * Sets instructorchoicesendemailaddr
     *
     * @param int|null $instructorchoicesendemailaddr instructor choice send mail address
     *
     * @return self
     */
    public function setInstructorchoicesendemailaddr($instructorchoicesendemailaddr)
    {
        if (is_null($instructorchoicesendemailaddr)) {
            throw new \InvalidArgumentException('non-nullable instructorchoicesendemailaddr cannot be null');
        }
        $this->container['instructorchoicesendemailaddr'] = $instructorchoicesendemailaddr;

        return $this;
    }

    /**
     * Gets instructorchoicesendname
     *
     * @return string|null
     */
    public function getInstructorchoicesendname()
    {
        return $this->container['instructorchoicesendname'];
    }

    /**
     * Sets instructorchoicesendname
     *
     * @param string|null $instructorchoicesendname Instructor choice send name
     *
     * @return self
     */
    public function setInstructorchoicesendname($instructorchoicesendname)
    {
        if (is_null($instructorchoicesendname)) {
            throw new \InvalidArgumentException('non-nullable instructorchoicesendname cannot be null');
        }
        $this->container['instructorchoicesendname'] = $instructorchoicesendname;

        return $this;
    }

    /**
     * Gets instructorcustomparameters
     *
     * @return string|null
     */
    public function getInstructorcustomparameters()
    {
        return $this->container['instructorcustomparameters'];
    }

    /**
     * Sets instructorcustomparameters
     *
     * @param string|null $instructorcustomparameters instructor custom parameters
     *
     * @return self
     */
    public function setInstructorcustomparameters($instructorcustomparameters)
    {
        if (is_null($instructorcustomparameters)) {
            throw new \InvalidArgumentException('non-nullable instructorcustomparameters cannot be null');
        }
        $this->container['instructorcustomparameters'] = $instructorcustomparameters;

        return $this;
    }

    /**
     * Gets intro
     *
     * @return string|null
     */
    public function getIntro()
    {
        return $this->container['intro'];
    }

    /**
     * Sets intro
     *
     * @param string|null $intro Activity introduction
     *
     * @return self
     */
    public function setIntro($intro)
    {
        if (is_null($intro)) {
            throw new \InvalidArgumentException('non-nullable intro cannot be null');
        }
        $this->container['intro'] = $intro;

        return $this;
    }

    /**
     * Gets introfiles
     *
     * @return \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]|null
     */
    public function getIntrofiles()
    {
        return $this->container['introfiles'];
    }

    /**
     * Sets introfiles
     *
     * @param \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]|null $introfiles introfiles
     *
     * @return self
     */
    public function setIntrofiles($introfiles)
    {
        if (is_null($introfiles)) {
            throw new \InvalidArgumentException('non-nullable introfiles cannot be null');
        }
        $this->container['introfiles'] = $introfiles;

        return $this;
    }

    /**
     * Gets introformat
     *
     * @return int|null
     */
    public function getIntroformat()
    {
        return $this->container['introformat'];
    }

    /**
     * Sets introformat
     *
     * @param int|null $introformat intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     *
     * @return self
     */
    public function setIntroformat($introformat)
    {
        if (is_null($introformat)) {
            throw new \InvalidArgumentException('non-nullable introformat cannot be null');
        }
        $this->container['introformat'] = $introformat;

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
     * @param string|null $lang Forced activity language
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
     * Gets launchcontainer
     *
     * @return int|null
     */
    public function getLaunchcontainer()
    {
        return $this->container['launchcontainer'];
    }

    /**
     * Sets launchcontainer
     *
     * @param int|null $launchcontainer Launch container mode
     *
     * @return self
     */
    public function setLaunchcontainer($launchcontainer)
    {
        if (is_null($launchcontainer)) {
            throw new \InvalidArgumentException('non-nullable launchcontainer cannot be null');
        }
        $this->container['launchcontainer'] = $launchcontainer;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string|null $name Activity name
     *
     * @return self
     */
    public function setName($name)
    {
        if (is_null($name)) {
            throw new \InvalidArgumentException('non-nullable name cannot be null');
        }
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets password
     *
     * @return string|null
     */
    public function getPassword()
    {
        return $this->container['password'];
    }

    /**
     * Sets password
     *
     * @param string|null $password Shared secret
     *
     * @return self
     */
    public function setPassword($password)
    {
        if (is_null($password)) {
            throw new \InvalidArgumentException('non-nullable password cannot be null');
        }
        $this->container['password'] = $password;

        return $this;
    }

    /**
     * Gets resourcekey
     *
     * @return string|null
     */
    public function getResourcekey()
    {
        return $this->container['resourcekey'];
    }

    /**
     * Sets resourcekey
     *
     * @param string|null $resourcekey Resource key
     *
     * @return self
     */
    public function setResourcekey($resourcekey)
    {
        if (is_null($resourcekey)) {
            throw new \InvalidArgumentException('non-nullable resourcekey cannot be null');
        }
        $this->container['resourcekey'] = $resourcekey;

        return $this;
    }

    /**
     * Gets section
     *
     * @return int|null
     */
    public function getSection()
    {
        return $this->container['section'];
    }

    /**
     * Sets section
     *
     * @param int|null $section Course section id
     *
     * @return self
     */
    public function setSection($section)
    {
        if (is_null($section)) {
            throw new \InvalidArgumentException('non-nullable section cannot be null');
        }
        $this->container['section'] = $section;

        return $this;
    }

    /**
     * Gets secureicon
     *
     * @return string|null
     */
    public function getSecureicon()
    {
        return $this->container['secureicon'];
    }

    /**
     * Sets secureicon
     *
     * @param string|null $secureicon Secure icon URL
     *
     * @return self
     */
    public function setSecureicon($secureicon)
    {
        if (is_null($secureicon)) {
            throw new \InvalidArgumentException('non-nullable secureicon cannot be null');
        }
        $this->container['secureicon'] = $secureicon;

        return $this;
    }

    /**
     * Gets securetoolurl
     *
     * @return string|null
     */
    public function getSecuretoolurl()
    {
        return $this->container['securetoolurl'];
    }

    /**
     * Sets securetoolurl
     *
     * @param string|null $securetoolurl Secure tool url
     *
     * @return self
     */
    public function setSecuretoolurl($securetoolurl)
    {
        if (is_null($securetoolurl)) {
            throw new \InvalidArgumentException('non-nullable securetoolurl cannot be null');
        }
        $this->container['securetoolurl'] = $securetoolurl;

        return $this;
    }

    /**
     * Gets servicesalt
     *
     * @return string|null
     */
    public function getServicesalt()
    {
        return $this->container['servicesalt'];
    }

    /**
     * Sets servicesalt
     *
     * @param string|null $servicesalt Service salt
     *
     * @return self
     */
    public function setServicesalt($servicesalt)
    {
        if (is_null($servicesalt)) {
            throw new \InvalidArgumentException('non-nullable servicesalt cannot be null');
        }
        $this->container['servicesalt'] = $servicesalt;

        return $this;
    }

    /**
     * Gets showdescriptionlaunch
     *
     * @return int|null
     */
    public function getShowdescriptionlaunch()
    {
        return $this->container['showdescriptionlaunch'];
    }

    /**
     * Sets showdescriptionlaunch
     *
     * @param int|null $showdescriptionlaunch Show description launch
     *
     * @return self
     */
    public function setShowdescriptionlaunch($showdescriptionlaunch)
    {
        if (is_null($showdescriptionlaunch)) {
            throw new \InvalidArgumentException('non-nullable showdescriptionlaunch cannot be null');
        }
        $this->container['showdescriptionlaunch'] = $showdescriptionlaunch;

        return $this;
    }

    /**
     * Gets showtitlelaunch
     *
     * @return int|null
     */
    public function getShowtitlelaunch()
    {
        return $this->container['showtitlelaunch'];
    }

    /**
     * Sets showtitlelaunch
     *
     * @param int|null $showtitlelaunch Show title launch
     *
     * @return self
     */
    public function setShowtitlelaunch($showtitlelaunch)
    {
        if (is_null($showtitlelaunch)) {
            throw new \InvalidArgumentException('non-nullable showtitlelaunch cannot be null');
        }
        $this->container['showtitlelaunch'] = $showtitlelaunch;

        return $this;
    }

    /**
     * Gets timecreated
     *
     * @return int|null
     */
    public function getTimecreated()
    {
        return $this->container['timecreated'];
    }

    /**
     * Sets timecreated
     *
     * @param int|null $timecreated Time of creation
     *
     * @return self
     */
    public function setTimecreated($timecreated)
    {
        if (is_null($timecreated)) {
            throw new \InvalidArgumentException('non-nullable timecreated cannot be null');
        }
        $this->container['timecreated'] = $timecreated;

        return $this;
    }

    /**
     * Gets timemodified
     *
     * @return int|null
     */
    public function getTimemodified()
    {
        return $this->container['timemodified'];
    }

    /**
     * Sets timemodified
     *
     * @param int|null $timemodified Time of last modification
     *
     * @return self
     */
    public function setTimemodified($timemodified)
    {
        if (is_null($timemodified)) {
            throw new \InvalidArgumentException('non-nullable timemodified cannot be null');
        }
        $this->container['timemodified'] = $timemodified;

        return $this;
    }

    /**
     * Gets toolurl
     *
     * @return string|null
     */
    public function getToolurl()
    {
        return $this->container['toolurl'];
    }

    /**
     * Sets toolurl
     *
     * @param string|null $toolurl Tool url
     *
     * @return self
     */
    public function setToolurl($toolurl)
    {
        if (is_null($toolurl)) {
            throw new \InvalidArgumentException('non-nullable toolurl cannot be null');
        }
        $this->container['toolurl'] = $toolurl;

        return $this;
    }

    /**
     * Gets typeid
     *
     * @return int|null
     */
    public function getTypeid()
    {
        return $this->container['typeid'];
    }

    /**
     * Sets typeid
     *
     * @param int|null $typeid Type id
     *
     * @return self
     */
    public function setTypeid($typeid)
    {
        if (is_null($typeid)) {
            throw new \InvalidArgumentException('non-nullable typeid cannot be null');
        }
        $this->container['typeid'] = $typeid;

        return $this;
    }

    /**
     * Gets visible
     *
     * @return bool|null
     */
    public function getVisible()
    {
        return $this->container['visible'];
    }

    /**
     * Sets visible
     *
     * @param bool|null $visible Visible
     *
     * @return self
     */
    public function setVisible($visible)
    {
        if (is_null($visible)) {
            throw new \InvalidArgumentException('non-nullable visible cannot be null');
        }
        $this->container['visible'] = $visible;

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

