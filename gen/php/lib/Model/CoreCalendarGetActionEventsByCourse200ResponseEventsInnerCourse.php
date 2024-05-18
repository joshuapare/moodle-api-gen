<?php
/**
 * CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse
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
 * CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_calendar_get_action_events_by_course_200_response_events_inner_course';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'coursecategory' => 'string',
        'courseimage' => 'string',
        'enddate' => 'int',
        'fullname' => 'string',
        'fullnamedisplay' => 'string',
        'hasprogress' => 'bool',
        'hidden' => 'bool',
        'id' => 'int',
        'idnumber' => 'string',
        'isfavourite' => 'bool',
        'pdfexportfont' => 'string',
        'progress' => 'int',
        'shortname' => 'string',
        'showactivitydates' => 'bool',
        'showcompletionconditions' => 'bool',
        'showshortname' => 'bool',
        'startdate' => 'int',
        'summary' => 'string',
        'summaryformat' => 'int',
        'timeaccess' => 'int',
        'viewurl' => 'string',
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
        'coursecategory' => null,
        'courseimage' => null,
        'enddate' => null,
        'fullname' => null,
        'fullnamedisplay' => null,
        'hasprogress' => null,
        'hidden' => null,
        'id' => null,
        'idnumber' => null,
        'isfavourite' => null,
        'pdfexportfont' => null,
        'progress' => null,
        'shortname' => null,
        'showactivitydates' => null,
        'showcompletionconditions' => null,
        'showshortname' => null,
        'startdate' => null,
        'summary' => null,
        'summaryformat' => null,
        'timeaccess' => null,
        'viewurl' => null,
        'visible' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'coursecategory' => false,
        'courseimage' => false,
        'enddate' => false,
        'fullname' => false,
        'fullnamedisplay' => false,
        'hasprogress' => false,
        'hidden' => false,
        'id' => false,
        'idnumber' => false,
        'isfavourite' => false,
        'pdfexportfont' => false,
        'progress' => false,
        'shortname' => false,
        'showactivitydates' => false,
        'showcompletionconditions' => false,
        'showshortname' => false,
        'startdate' => false,
        'summary' => false,
        'summaryformat' => false,
        'timeaccess' => false,
        'viewurl' => false,
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
        'coursecategory' => 'coursecategory',
        'courseimage' => 'courseimage',
        'enddate' => 'enddate',
        'fullname' => 'fullname',
        'fullnamedisplay' => 'fullnamedisplay',
        'hasprogress' => 'hasprogress',
        'hidden' => 'hidden',
        'id' => 'id',
        'idnumber' => 'idnumber',
        'isfavourite' => 'isfavourite',
        'pdfexportfont' => 'pdfexportfont',
        'progress' => 'progress',
        'shortname' => 'shortname',
        'showactivitydates' => 'showactivitydates',
        'showcompletionconditions' => 'showcompletionconditions',
        'showshortname' => 'showshortname',
        'startdate' => 'startdate',
        'summary' => 'summary',
        'summaryformat' => 'summaryformat',
        'timeaccess' => 'timeaccess',
        'viewurl' => 'viewurl',
        'visible' => 'visible'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'coursecategory' => 'setCoursecategory',
        'courseimage' => 'setCourseimage',
        'enddate' => 'setEnddate',
        'fullname' => 'setFullname',
        'fullnamedisplay' => 'setFullnamedisplay',
        'hasprogress' => 'setHasprogress',
        'hidden' => 'setHidden',
        'id' => 'setId',
        'idnumber' => 'setIdnumber',
        'isfavourite' => 'setIsfavourite',
        'pdfexportfont' => 'setPdfexportfont',
        'progress' => 'setProgress',
        'shortname' => 'setShortname',
        'showactivitydates' => 'setShowactivitydates',
        'showcompletionconditions' => 'setShowcompletionconditions',
        'showshortname' => 'setShowshortname',
        'startdate' => 'setStartdate',
        'summary' => 'setSummary',
        'summaryformat' => 'setSummaryformat',
        'timeaccess' => 'setTimeaccess',
        'viewurl' => 'setViewurl',
        'visible' => 'setVisible'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'coursecategory' => 'getCoursecategory',
        'courseimage' => 'getCourseimage',
        'enddate' => 'getEnddate',
        'fullname' => 'getFullname',
        'fullnamedisplay' => 'getFullnamedisplay',
        'hasprogress' => 'getHasprogress',
        'hidden' => 'getHidden',
        'id' => 'getId',
        'idnumber' => 'getIdnumber',
        'isfavourite' => 'getIsfavourite',
        'pdfexportfont' => 'getPdfexportfont',
        'progress' => 'getProgress',
        'shortname' => 'getShortname',
        'showactivitydates' => 'getShowactivitydates',
        'showcompletionconditions' => 'getShowcompletionconditions',
        'showshortname' => 'getShowshortname',
        'startdate' => 'getStartdate',
        'summary' => 'getSummary',
        'summaryformat' => 'getSummaryformat',
        'timeaccess' => 'getTimeaccess',
        'viewurl' => 'getViewurl',
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
        $this->setIfExists('coursecategory', $data ?? [], 'null');
        $this->setIfExists('courseimage', $data ?? [], 'null');
        $this->setIfExists('enddate', $data ?? [], null);
        $this->setIfExists('fullname', $data ?? [], 'null');
        $this->setIfExists('fullnamedisplay', $data ?? [], 'null');
        $this->setIfExists('hasprogress', $data ?? [], null);
        $this->setIfExists('hidden', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('idnumber', $data ?? [], 'null');
        $this->setIfExists('isfavourite', $data ?? [], null);
        $this->setIfExists('pdfexportfont', $data ?? [], 'null');
        $this->setIfExists('progress', $data ?? [], null);
        $this->setIfExists('shortname', $data ?? [], 'null');
        $this->setIfExists('showactivitydates', $data ?? [], null);
        $this->setIfExists('showcompletionconditions', $data ?? [], null);
        $this->setIfExists('showshortname', $data ?? [], null);
        $this->setIfExists('startdate', $data ?? [], null);
        $this->setIfExists('summary', $data ?? [], 'null');
        $this->setIfExists('summaryformat', $data ?? [], null);
        $this->setIfExists('timeaccess', $data ?? [], null);
        $this->setIfExists('viewurl', $data ?? [], 'null');
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

        if ($this->container['coursecategory'] === null) {
            $invalidProperties[] = "'coursecategory' can't be null";
        }
        if ($this->container['courseimage'] === null) {
            $invalidProperties[] = "'courseimage' can't be null";
        }
        if ($this->container['enddate'] === null) {
            $invalidProperties[] = "'enddate' can't be null";
        }
        if ($this->container['fullname'] === null) {
            $invalidProperties[] = "'fullname' can't be null";
        }
        if ($this->container['fullnamedisplay'] === null) {
            $invalidProperties[] = "'fullnamedisplay' can't be null";
        }
        if ($this->container['hasprogress'] === null) {
            $invalidProperties[] = "'hasprogress' can't be null";
        }
        if ($this->container['hidden'] === null) {
            $invalidProperties[] = "'hidden' can't be null";
        }
        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['idnumber'] === null) {
            $invalidProperties[] = "'idnumber' can't be null";
        }
        if ($this->container['isfavourite'] === null) {
            $invalidProperties[] = "'isfavourite' can't be null";
        }
        if ($this->container['pdfexportfont'] === null) {
            $invalidProperties[] = "'pdfexportfont' can't be null";
        }
        if ($this->container['shortname'] === null) {
            $invalidProperties[] = "'shortname' can't be null";
        }
        if ($this->container['showactivitydates'] === null) {
            $invalidProperties[] = "'showactivitydates' can't be null";
        }
        if ($this->container['showcompletionconditions'] === null) {
            $invalidProperties[] = "'showcompletionconditions' can't be null";
        }
        if ($this->container['showshortname'] === null) {
            $invalidProperties[] = "'showshortname' can't be null";
        }
        if ($this->container['startdate'] === null) {
            $invalidProperties[] = "'startdate' can't be null";
        }
        if ($this->container['summary'] === null) {
            $invalidProperties[] = "'summary' can't be null";
        }
        if ($this->container['summaryformat'] === null) {
            $invalidProperties[] = "'summaryformat' can't be null";
        }
        if ($this->container['viewurl'] === null) {
            $invalidProperties[] = "'viewurl' can't be null";
        }
        if ($this->container['visible'] === null) {
            $invalidProperties[] = "'visible' can't be null";
        }
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
     * Gets coursecategory
     *
     * @return string
     */
    public function getCoursecategory()
    {
        return $this->container['coursecategory'];
    }

    /**
     * Sets coursecategory
     *
     * @param string $coursecategory coursecategory
     *
     * @return self
     */
    public function setCoursecategory($coursecategory)
    {
        if (is_null($coursecategory)) {
            throw new \InvalidArgumentException('non-nullable coursecategory cannot be null');
        }
        $this->container['coursecategory'] = $coursecategory;

        return $this;
    }

    /**
     * Gets courseimage
     *
     * @return string
     */
    public function getCourseimage()
    {
        return $this->container['courseimage'];
    }

    /**
     * Sets courseimage
     *
     * @param string $courseimage courseimage
     *
     * @return self
     */
    public function setCourseimage($courseimage)
    {
        if (is_null($courseimage)) {
            throw new \InvalidArgumentException('non-nullable courseimage cannot be null');
        }
        $this->container['courseimage'] = $courseimage;

        return $this;
    }

    /**
     * Gets enddate
     *
     * @return int
     */
    public function getEnddate()
    {
        return $this->container['enddate'];
    }

    /**
     * Sets enddate
     *
     * @param int $enddate enddate
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
     * Gets fullname
     *
     * @return string
     */
    public function getFullname()
    {
        return $this->container['fullname'];
    }

    /**
     * Sets fullname
     *
     * @param string $fullname fullname
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
     * Gets fullnamedisplay
     *
     * @return string
     */
    public function getFullnamedisplay()
    {
        return $this->container['fullnamedisplay'];
    }

    /**
     * Sets fullnamedisplay
     *
     * @param string $fullnamedisplay fullnamedisplay
     *
     * @return self
     */
    public function setFullnamedisplay($fullnamedisplay)
    {
        if (is_null($fullnamedisplay)) {
            throw new \InvalidArgumentException('non-nullable fullnamedisplay cannot be null');
        }
        $this->container['fullnamedisplay'] = $fullnamedisplay;

        return $this;
    }

    /**
     * Gets hasprogress
     *
     * @return bool
     */
    public function getHasprogress()
    {
        return $this->container['hasprogress'];
    }

    /**
     * Sets hasprogress
     *
     * @param bool $hasprogress hasprogress
     *
     * @return self
     */
    public function setHasprogress($hasprogress)
    {
        if (is_null($hasprogress)) {
            throw new \InvalidArgumentException('non-nullable hasprogress cannot be null');
        }
        $this->container['hasprogress'] = $hasprogress;

        return $this;
    }

    /**
     * Gets hidden
     *
     * @return bool
     */
    public function getHidden()
    {
        return $this->container['hidden'];
    }

    /**
     * Sets hidden
     *
     * @param bool $hidden hidden
     *
     * @return self
     */
    public function setHidden($hidden)
    {
        if (is_null($hidden)) {
            throw new \InvalidArgumentException('non-nullable hidden cannot be null');
        }
        $this->container['hidden'] = $hidden;

        return $this;
    }

    /**
     * Gets id
     *
     * @return int
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int $id id
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
     * @return string
     */
    public function getIdnumber()
    {
        return $this->container['idnumber'];
    }

    /**
     * Sets idnumber
     *
     * @param string $idnumber idnumber
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
     * Gets isfavourite
     *
     * @return bool
     */
    public function getIsfavourite()
    {
        return $this->container['isfavourite'];
    }

    /**
     * Sets isfavourite
     *
     * @param bool $isfavourite isfavourite
     *
     * @return self
     */
    public function setIsfavourite($isfavourite)
    {
        if (is_null($isfavourite)) {
            throw new \InvalidArgumentException('non-nullable isfavourite cannot be null');
        }
        $this->container['isfavourite'] = $isfavourite;

        return $this;
    }

    /**
     * Gets pdfexportfont
     *
     * @return string
     */
    public function getPdfexportfont()
    {
        return $this->container['pdfexportfont'];
    }

    /**
     * Sets pdfexportfont
     *
     * @param string $pdfexportfont pdfexportfont
     *
     * @return self
     */
    public function setPdfexportfont($pdfexportfont)
    {
        if (is_null($pdfexportfont)) {
            throw new \InvalidArgumentException('non-nullable pdfexportfont cannot be null');
        }
        $this->container['pdfexportfont'] = $pdfexportfont;

        return $this;
    }

    /**
     * Gets progress
     *
     * @return int|null
     */
    public function getProgress()
    {
        return $this->container['progress'];
    }

    /**
     * Sets progress
     *
     * @param int|null $progress progress
     *
     * @return self
     */
    public function setProgress($progress)
    {
        if (is_null($progress)) {
            throw new \InvalidArgumentException('non-nullable progress cannot be null');
        }
        $this->container['progress'] = $progress;

        return $this;
    }

    /**
     * Gets shortname
     *
     * @return string
     */
    public function getShortname()
    {
        return $this->container['shortname'];
    }

    /**
     * Sets shortname
     *
     * @param string $shortname shortname
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
     * Gets showactivitydates
     *
     * @return bool
     */
    public function getShowactivitydates()
    {
        return $this->container['showactivitydates'];
    }

    /**
     * Sets showactivitydates
     *
     * @param bool $showactivitydates showactivitydates
     *
     * @return self
     */
    public function setShowactivitydates($showactivitydates)
    {
        if (is_null($showactivitydates)) {
            throw new \InvalidArgumentException('non-nullable showactivitydates cannot be null');
        }
        $this->container['showactivitydates'] = $showactivitydates;

        return $this;
    }

    /**
     * Gets showcompletionconditions
     *
     * @return bool
     */
    public function getShowcompletionconditions()
    {
        return $this->container['showcompletionconditions'];
    }

    /**
     * Sets showcompletionconditions
     *
     * @param bool $showcompletionconditions showcompletionconditions
     *
     * @return self
     */
    public function setShowcompletionconditions($showcompletionconditions)
    {
        if (is_null($showcompletionconditions)) {
            throw new \InvalidArgumentException('non-nullable showcompletionconditions cannot be null');
        }
        $this->container['showcompletionconditions'] = $showcompletionconditions;

        return $this;
    }

    /**
     * Gets showshortname
     *
     * @return bool
     */
    public function getShowshortname()
    {
        return $this->container['showshortname'];
    }

    /**
     * Sets showshortname
     *
     * @param bool $showshortname showshortname
     *
     * @return self
     */
    public function setShowshortname($showshortname)
    {
        if (is_null($showshortname)) {
            throw new \InvalidArgumentException('non-nullable showshortname cannot be null');
        }
        $this->container['showshortname'] = $showshortname;

        return $this;
    }

    /**
     * Gets startdate
     *
     * @return int
     */
    public function getStartdate()
    {
        return $this->container['startdate'];
    }

    /**
     * Sets startdate
     *
     * @param int $startdate startdate
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
     * @return string
     */
    public function getSummary()
    {
        return $this->container['summary'];
    }

    /**
     * Sets summary
     *
     * @param string $summary summary
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
     * @return int
     */
    public function getSummaryformat()
    {
        return $this->container['summaryformat'];
    }

    /**
     * Sets summaryformat
     *
     * @param int $summaryformat summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
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
     * Gets timeaccess
     *
     * @return int|null
     */
    public function getTimeaccess()
    {
        return $this->container['timeaccess'];
    }

    /**
     * Sets timeaccess
     *
     * @param int|null $timeaccess timeaccess
     *
     * @return self
     */
    public function setTimeaccess($timeaccess)
    {
        if (is_null($timeaccess)) {
            throw new \InvalidArgumentException('non-nullable timeaccess cannot be null');
        }
        $this->container['timeaccess'] = $timeaccess;

        return $this;
    }

    /**
     * Gets viewurl
     *
     * @return string
     */
    public function getViewurl()
    {
        return $this->container['viewurl'];
    }

    /**
     * Sets viewurl
     *
     * @param string $viewurl viewurl
     *
     * @return self
     */
    public function setViewurl($viewurl)
    {
        if (is_null($viewurl)) {
            throw new \InvalidArgumentException('non-nullable viewurl cannot be null');
        }
        $this->container['viewurl'] = $viewurl;

        return $this;
    }

    /**
     * Gets visible
     *
     * @return bool
     */
    public function getVisible()
    {
        return $this->container['visible'];
    }

    /**
     * Sets visible
     *
     * @param bool $visible visible
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

