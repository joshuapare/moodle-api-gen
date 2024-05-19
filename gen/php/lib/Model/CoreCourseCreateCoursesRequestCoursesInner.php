<?php
/**
 * CoreCourseCreateCoursesRequestCoursesInner
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
 * CoreCourseCreateCoursesRequestCoursesInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreCourseCreateCoursesRequestCoursesInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_course_create_courses_request_courses_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'categoryid' => 'int',
        'completionnotify' => 'int',
        'courseformatoptions' => '\OpenAPI\Client\Model\CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner[]',
        'customfields' => '\OpenAPI\Client\Model\CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner[]',
        'defaultgroupingid' => 'int',
        'enablecompletion' => 'int',
        'enddate' => 'int',
        'forcetheme' => 'string',
        'format' => 'string',
        'fullname' => 'string',
        'groupmode' => 'int',
        'groupmodeforce' => 'int',
        'hiddensections' => 'int',
        'idnumber' => 'string',
        'lang' => 'string',
        'maxbytes' => 'int',
        'newsitems' => 'int',
        'numsections' => 'int',
        'shortname' => 'string',
        'showgrades' => 'int',
        'showreports' => 'int',
        'startdate' => 'int',
        'summary' => 'string',
        'summaryformat' => 'int',
        'visible' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'categoryid' => null,
        'completionnotify' => null,
        'courseformatoptions' => null,
        'customfields' => null,
        'defaultgroupingid' => null,
        'enablecompletion' => null,
        'enddate' => null,
        'forcetheme' => null,
        'format' => null,
        'fullname' => null,
        'groupmode' => null,
        'groupmodeforce' => null,
        'hiddensections' => null,
        'idnumber' => null,
        'lang' => null,
        'maxbytes' => null,
        'newsitems' => null,
        'numsections' => null,
        'shortname' => null,
        'showgrades' => null,
        'showreports' => null,
        'startdate' => null,
        'summary' => null,
        'summaryformat' => null,
        'visible' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'categoryid' => false,
        'completionnotify' => false,
        'courseformatoptions' => false,
        'customfields' => false,
        'defaultgroupingid' => false,
        'enablecompletion' => false,
        'enddate' => false,
        'forcetheme' => false,
        'format' => false,
        'fullname' => false,
        'groupmode' => false,
        'groupmodeforce' => false,
        'hiddensections' => false,
        'idnumber' => false,
        'lang' => false,
        'maxbytes' => false,
        'newsitems' => false,
        'numsections' => false,
        'shortname' => false,
        'showgrades' => false,
        'showreports' => false,
        'startdate' => false,
        'summary' => false,
        'summaryformat' => false,
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
        'categoryid' => 'categoryid',
        'completionnotify' => 'completionnotify',
        'courseformatoptions' => 'courseformatoptions',
        'customfields' => 'customfields',
        'defaultgroupingid' => 'defaultgroupingid',
        'enablecompletion' => 'enablecompletion',
        'enddate' => 'enddate',
        'forcetheme' => 'forcetheme',
        'format' => 'format',
        'fullname' => 'fullname',
        'groupmode' => 'groupmode',
        'groupmodeforce' => 'groupmodeforce',
        'hiddensections' => 'hiddensections',
        'idnumber' => 'idnumber',
        'lang' => 'lang',
        'maxbytes' => 'maxbytes',
        'newsitems' => 'newsitems',
        'numsections' => 'numsections',
        'shortname' => 'shortname',
        'showgrades' => 'showgrades',
        'showreports' => 'showreports',
        'startdate' => 'startdate',
        'summary' => 'summary',
        'summaryformat' => 'summaryformat',
        'visible' => 'visible'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'categoryid' => 'setCategoryid',
        'completionnotify' => 'setCompletionnotify',
        'courseformatoptions' => 'setCourseformatoptions',
        'customfields' => 'setCustomfields',
        'defaultgroupingid' => 'setDefaultgroupingid',
        'enablecompletion' => 'setEnablecompletion',
        'enddate' => 'setEnddate',
        'forcetheme' => 'setForcetheme',
        'format' => 'setFormat',
        'fullname' => 'setFullname',
        'groupmode' => 'setGroupmode',
        'groupmodeforce' => 'setGroupmodeforce',
        'hiddensections' => 'setHiddensections',
        'idnumber' => 'setIdnumber',
        'lang' => 'setLang',
        'maxbytes' => 'setMaxbytes',
        'newsitems' => 'setNewsitems',
        'numsections' => 'setNumsections',
        'shortname' => 'setShortname',
        'showgrades' => 'setShowgrades',
        'showreports' => 'setShowreports',
        'startdate' => 'setStartdate',
        'summary' => 'setSummary',
        'summaryformat' => 'setSummaryformat',
        'visible' => 'setVisible'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'categoryid' => 'getCategoryid',
        'completionnotify' => 'getCompletionnotify',
        'courseformatoptions' => 'getCourseformatoptions',
        'customfields' => 'getCustomfields',
        'defaultgroupingid' => 'getDefaultgroupingid',
        'enablecompletion' => 'getEnablecompletion',
        'enddate' => 'getEnddate',
        'forcetheme' => 'getForcetheme',
        'format' => 'getFormat',
        'fullname' => 'getFullname',
        'groupmode' => 'getGroupmode',
        'groupmodeforce' => 'getGroupmodeforce',
        'hiddensections' => 'getHiddensections',
        'idnumber' => 'getIdnumber',
        'lang' => 'getLang',
        'maxbytes' => 'getMaxbytes',
        'newsitems' => 'getNewsitems',
        'numsections' => 'getNumsections',
        'shortname' => 'getShortname',
        'showgrades' => 'getShowgrades',
        'showreports' => 'getShowreports',
        'startdate' => 'getStartdate',
        'summary' => 'getSummary',
        'summaryformat' => 'getSummaryformat',
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
        $this->setIfExists('categoryid', $data ?? [], null);
        $this->setIfExists('completionnotify', $data ?? [], null);
        $this->setIfExists('courseformatoptions', $data ?? [], null);
        $this->setIfExists('customfields', $data ?? [], null);
        $this->setIfExists('defaultgroupingid', $data ?? [], 0);
        $this->setIfExists('enablecompletion', $data ?? [], null);
        $this->setIfExists('enddate', $data ?? [], null);
        $this->setIfExists('forcetheme', $data ?? [], 'null');
        $this->setIfExists('format', $data ?? [], 'topics');
        $this->setIfExists('fullname', $data ?? [], 'null');
        $this->setIfExists('groupmode', $data ?? [], 0);
        $this->setIfExists('groupmodeforce', $data ?? [], 0);
        $this->setIfExists('hiddensections', $data ?? [], null);
        $this->setIfExists('idnumber', $data ?? [], 'null');
        $this->setIfExists('lang', $data ?? [], 'null');
        $this->setIfExists('maxbytes', $data ?? [], 0);
        $this->setIfExists('newsitems', $data ?? [], 5);
        $this->setIfExists('numsections', $data ?? [], null);
        $this->setIfExists('shortname', $data ?? [], 'null');
        $this->setIfExists('showgrades', $data ?? [], 1);
        $this->setIfExists('showreports', $data ?? [], 0);
        $this->setIfExists('startdate', $data ?? [], null);
        $this->setIfExists('summary', $data ?? [], null);
        $this->setIfExists('summaryformat', $data ?? [], 1);
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
     * Gets categoryid
     *
     * @return int|null
     */
    public function getCategoryid()
    {
        return $this->container['categoryid'];
    }

    /**
     * Sets categoryid
     *
     * @param int|null $categoryid category id
     *
     * @return self
     */
    public function setCategoryid($categoryid)
    {
        if (is_null($categoryid)) {
            throw new \InvalidArgumentException('non-nullable categoryid cannot be null');
        }
        $this->container['categoryid'] = $categoryid;

        return $this;
    }

    /**
     * Gets completionnotify
     *
     * @return int|null
     */
    public function getCompletionnotify()
    {
        return $this->container['completionnotify'];
    }

    /**
     * Sets completionnotify
     *
     * @param int|null $completionnotify 1: yes 0: no
     *
     * @return self
     */
    public function setCompletionnotify($completionnotify)
    {
        if (is_null($completionnotify)) {
            throw new \InvalidArgumentException('non-nullable completionnotify cannot be null');
        }
        $this->container['completionnotify'] = $completionnotify;

        return $this;
    }

    /**
     * Gets courseformatoptions
     *
     * @return \OpenAPI\Client\Model\CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner[]|null
     */
    public function getCourseformatoptions()
    {
        return $this->container['courseformatoptions'];
    }

    /**
     * Sets courseformatoptions
     *
     * @param \OpenAPI\Client\Model\CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner[]|null $courseformatoptions courseformatoptions
     *
     * @return self
     */
    public function setCourseformatoptions($courseformatoptions)
    {
        if (is_null($courseformatoptions)) {
            throw new \InvalidArgumentException('non-nullable courseformatoptions cannot be null');
        }
        $this->container['courseformatoptions'] = $courseformatoptions;

        return $this;
    }

    /**
     * Gets customfields
     *
     * @return \OpenAPI\Client\Model\CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner[]|null
     */
    public function getCustomfields()
    {
        return $this->container['customfields'];
    }

    /**
     * Sets customfields
     *
     * @param \OpenAPI\Client\Model\CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner[]|null $customfields customfields
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
     * Gets defaultgroupingid
     *
     * @return int|null
     */
    public function getDefaultgroupingid()
    {
        return $this->container['defaultgroupingid'];
    }

    /**
     * Sets defaultgroupingid
     *
     * @param int|null $defaultgroupingid default grouping id
     *
     * @return self
     */
    public function setDefaultgroupingid($defaultgroupingid)
    {
        if (is_null($defaultgroupingid)) {
            throw new \InvalidArgumentException('non-nullable defaultgroupingid cannot be null');
        }
        $this->container['defaultgroupingid'] = $defaultgroupingid;

        return $this;
    }

    /**
     * Gets enablecompletion
     *
     * @return int|null
     */
    public function getEnablecompletion()
    {
        return $this->container['enablecompletion'];
    }

    /**
     * Sets enablecompletion
     *
     * @param int|null $enablecompletion Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings.
     *
     * @return self
     */
    public function setEnablecompletion($enablecompletion)
    {
        if (is_null($enablecompletion)) {
            throw new \InvalidArgumentException('non-nullable enablecompletion cannot be null');
        }
        $this->container['enablecompletion'] = $enablecompletion;

        return $this;
    }

    /**
     * Gets enddate
     *
     * @return int|null
     */
    public function getEnddate()
    {
        return $this->container['enddate'];
    }

    /**
     * Sets enddate
     *
     * @param int|null $enddate timestamp when the course end
     *
     * @return self
     */
    public function setEnddate($enddate)
    {
        if (is_null($enddate)) {
            throw new \InvalidArgumentException('non-nullable enddate cannot be null');
        }
        $this->container['enddate'] = $enddate;

        return $this;
    }

    /**
     * Gets forcetheme
     *
     * @return string|null
     */
    public function getForcetheme()
    {
        return $this->container['forcetheme'];
    }

    /**
     * Sets forcetheme
     *
     * @param string|null $forcetheme name of the force theme
     *
     * @return self
     */
    public function setForcetheme($forcetheme)
    {
        if (is_null($forcetheme)) {
            throw new \InvalidArgumentException('non-nullable forcetheme cannot be null');
        }
        $this->container['forcetheme'] = $forcetheme;

        return $this;
    }

    /**
     * Gets format
     *
     * @return string|null
     */
    public function getFormat()
    {
        return $this->container['format'];
    }

    /**
     * Sets format
     *
     * @param string|null $format course format: weeks, topics, social, site,..
     *
     * @return self
     */
    public function setFormat($format)
    {
        if (is_null($format)) {
            throw new \InvalidArgumentException('non-nullable format cannot be null');
        }
        $this->container['format'] = $format;

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
     * @param string|null $fullname full name
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
     * @param int|null $groupmode no group, separate, visible
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
     * Gets groupmodeforce
     *
     * @return int|null
     */
    public function getGroupmodeforce()
    {
        return $this->container['groupmodeforce'];
    }

    /**
     * Sets groupmodeforce
     *
     * @param int|null $groupmodeforce 1: yes, 0: no
     *
     * @return self
     */
    public function setGroupmodeforce($groupmodeforce)
    {
        if (is_null($groupmodeforce)) {
            throw new \InvalidArgumentException('non-nullable groupmodeforce cannot be null');
        }
        $this->container['groupmodeforce'] = $groupmodeforce;

        return $this;
    }

    /**
     * Gets hiddensections
     *
     * @return int|null
     */
    public function getHiddensections()
    {
        return $this->container['hiddensections'];
    }

    /**
     * Sets hiddensections
     *
     * @param int|null $hiddensections (deprecated, use courseformatoptions) How the hidden sections in the course are displayed to students
     *
     * @return self
     */
    public function setHiddensections($hiddensections)
    {
        if (is_null($hiddensections)) {
            throw new \InvalidArgumentException('non-nullable hiddensections cannot be null');
        }
        $this->container['hiddensections'] = $hiddensections;

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
     * @param string|null $idnumber id number
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
     * @param string|null $lang forced course language
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
     * Gets maxbytes
     *
     * @return int|null
     */
    public function getMaxbytes()
    {
        return $this->container['maxbytes'];
    }

    /**
     * Sets maxbytes
     *
     * @param int|null $maxbytes largest size of file that can be uploaded into the course
     *
     * @return self
     */
    public function setMaxbytes($maxbytes)
    {
        if (is_null($maxbytes)) {
            throw new \InvalidArgumentException('non-nullable maxbytes cannot be null');
        }
        $this->container['maxbytes'] = $maxbytes;

        return $this;
    }

    /**
     * Gets newsitems
     *
     * @return int|null
     */
    public function getNewsitems()
    {
        return $this->container['newsitems'];
    }

    /**
     * Sets newsitems
     *
     * @param int|null $newsitems number of recent items appearing on the course page
     *
     * @return self
     */
    public function setNewsitems($newsitems)
    {
        if (is_null($newsitems)) {
            throw new \InvalidArgumentException('non-nullable newsitems cannot be null');
        }
        $this->container['newsitems'] = $newsitems;

        return $this;
    }

    /**
     * Gets numsections
     *
     * @return int|null
     */
    public function getNumsections()
    {
        return $this->container['numsections'];
    }

    /**
     * Sets numsections
     *
     * @param int|null $numsections (deprecated, use courseformatoptions) number of weeks/topics
     *
     * @return self
     */
    public function setNumsections($numsections)
    {
        if (is_null($numsections)) {
            throw new \InvalidArgumentException('non-nullable numsections cannot be null');
        }
        $this->container['numsections'] = $numsections;

        return $this;
    }

    /**
     * Gets shortname
     *
     * @return string|null
     */
    public function getShortname()
    {
        return $this->container['shortname'];
    }

    /**
     * Sets shortname
     *
     * @param string|null $shortname course short name
     *
     * @return self
     */
    public function setShortname($shortname)
    {
        if (is_null($shortname)) {
            throw new \InvalidArgumentException('non-nullable shortname cannot be null');
        }
        $this->container['shortname'] = $shortname;

        return $this;
    }

    /**
     * Gets showgrades
     *
     * @return int|null
     */
    public function getShowgrades()
    {
        return $this->container['showgrades'];
    }

    /**
     * Sets showgrades
     *
     * @param int|null $showgrades 1 if grades are shown, otherwise 0
     *
     * @return self
     */
    public function setShowgrades($showgrades)
    {
        if (is_null($showgrades)) {
            throw new \InvalidArgumentException('non-nullable showgrades cannot be null');
        }
        $this->container['showgrades'] = $showgrades;

        return $this;
    }

    /**
     * Gets showreports
     *
     * @return int|null
     */
    public function getShowreports()
    {
        return $this->container['showreports'];
    }

    /**
     * Sets showreports
     *
     * @param int|null $showreports are activity report shown (yes = 1, no =0)
     *
     * @return self
     */
    public function setShowreports($showreports)
    {
        if (is_null($showreports)) {
            throw new \InvalidArgumentException('non-nullable showreports cannot be null');
        }
        $this->container['showreports'] = $showreports;

        return $this;
    }

    /**
     * Gets startdate
     *
     * @return int|null
     */
    public function getStartdate()
    {
        return $this->container['startdate'];
    }

    /**
     * Sets startdate
     *
     * @param int|null $startdate timestamp when the course start
     *
     * @return self
     */
    public function setStartdate($startdate)
    {
        if (is_null($startdate)) {
            throw new \InvalidArgumentException('non-nullable startdate cannot be null');
        }
        $this->container['startdate'] = $startdate;

        return $this;
    }

    /**
     * Gets summary
     *
     * @return string|null
     */
    public function getSummary()
    {
        return $this->container['summary'];
    }

    /**
     * Sets summary
     *
     * @param string|null $summary summary
     *
     * @return self
     */
    public function setSummary($summary)
    {
        if (is_null($summary)) {
            throw new \InvalidArgumentException('non-nullable summary cannot be null');
        }
        $this->container['summary'] = $summary;

        return $this;
    }

    /**
     * Gets summaryformat
     *
     * @return int|null
     */
    public function getSummaryformat()
    {
        return $this->container['summaryformat'];
    }

    /**
     * Sets summaryformat
     *
     * @param int|null $summaryformat summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     *
     * @return self
     */
    public function setSummaryformat($summaryformat)
    {
        if (is_null($summaryformat)) {
            throw new \InvalidArgumentException('non-nullable summaryformat cannot be null');
        }
        $this->container['summaryformat'] = $summaryformat;

        return $this;
    }

    /**
     * Gets visible
     *
     * @return int|null
     */
    public function getVisible()
    {
        return $this->container['visible'];
    }

    /**
     * Sets visible
     *
     * @param int|null $visible 1: available to student, 0:not available
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


