<?php
/**
 * CoreCalendarGetCalendarMonthlyView200Response
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
 * CoreCalendarGetCalendarMonthlyView200Response Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreCalendarGetCalendarMonthlyView200Response implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_calendar_get_calendar_monthly_view_200_response';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'calendarinstanceid' => 'int',
        'categoryid' => 'int',
        'courseid' => 'int',
        'date' => '\OpenAPI\Client\Model\CoreCalendarGetCalendarDayView200ResponseNextperiod',
        'daynames' => '\OpenAPI\Client\Model\CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner[]',
        'defaulteventcontext' => 'int',
        'filter_selector' => 'string',
        'includenavigation' => 'bool',
        'initialeventsloaded' => 'bool',
        'larrow' => 'string',
        'nextperiod' => '\OpenAPI\Client\Model\CoreCalendarGetCalendarDayView200ResponseNextperiod',
        'nextperiodlink' => 'string',
        'nextperiodname' => 'string',
        'periodname' => 'string',
        'previousperiod' => '\OpenAPI\Client\Model\CoreCalendarGetCalendarDayView200ResponseNextperiod',
        'previousperiodlink' => 'string',
        'previousperiodname' => 'string',
        'rarrow' => 'string',
        'showviewselector' => 'bool',
        'url' => 'string',
        'view' => 'string',
        'viewinginblock' => 'bool',
        'viewingmonth' => 'bool',
        'weeks' => '\OpenAPI\Client\Model\CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'calendarinstanceid' => null,
        'categoryid' => null,
        'courseid' => null,
        'date' => null,
        'daynames' => null,
        'defaulteventcontext' => null,
        'filter_selector' => null,
        'includenavigation' => null,
        'initialeventsloaded' => null,
        'larrow' => null,
        'nextperiod' => null,
        'nextperiodlink' => null,
        'nextperiodname' => null,
        'periodname' => null,
        'previousperiod' => null,
        'previousperiodlink' => null,
        'previousperiodname' => null,
        'rarrow' => null,
        'showviewselector' => null,
        'url' => null,
        'view' => null,
        'viewinginblock' => null,
        'viewingmonth' => null,
        'weeks' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'calendarinstanceid' => false,
        'categoryid' => false,
        'courseid' => false,
        'date' => false,
        'daynames' => false,
        'defaulteventcontext' => false,
        'filter_selector' => false,
        'includenavigation' => false,
        'initialeventsloaded' => false,
        'larrow' => false,
        'nextperiod' => false,
        'nextperiodlink' => false,
        'nextperiodname' => false,
        'periodname' => false,
        'previousperiod' => false,
        'previousperiodlink' => false,
        'previousperiodname' => false,
        'rarrow' => false,
        'showviewselector' => false,
        'url' => false,
        'view' => false,
        'viewinginblock' => false,
        'viewingmonth' => false,
        'weeks' => false
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
        'calendarinstanceid' => 'calendarinstanceid',
        'categoryid' => 'categoryid',
        'courseid' => 'courseid',
        'date' => 'date',
        'daynames' => 'daynames',
        'defaulteventcontext' => 'defaulteventcontext',
        'filter_selector' => 'filter_selector',
        'includenavigation' => 'includenavigation',
        'initialeventsloaded' => 'initialeventsloaded',
        'larrow' => 'larrow',
        'nextperiod' => 'nextperiod',
        'nextperiodlink' => 'nextperiodlink',
        'nextperiodname' => 'nextperiodname',
        'periodname' => 'periodname',
        'previousperiod' => 'previousperiod',
        'previousperiodlink' => 'previousperiodlink',
        'previousperiodname' => 'previousperiodname',
        'rarrow' => 'rarrow',
        'showviewselector' => 'showviewselector',
        'url' => 'url',
        'view' => 'view',
        'viewinginblock' => 'viewinginblock',
        'viewingmonth' => 'viewingmonth',
        'weeks' => 'weeks'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'calendarinstanceid' => 'setCalendarinstanceid',
        'categoryid' => 'setCategoryid',
        'courseid' => 'setCourseid',
        'date' => 'setDate',
        'daynames' => 'setDaynames',
        'defaulteventcontext' => 'setDefaulteventcontext',
        'filter_selector' => 'setFilterSelector',
        'includenavigation' => 'setIncludenavigation',
        'initialeventsloaded' => 'setInitialeventsloaded',
        'larrow' => 'setLarrow',
        'nextperiod' => 'setNextperiod',
        'nextperiodlink' => 'setNextperiodlink',
        'nextperiodname' => 'setNextperiodname',
        'periodname' => 'setPeriodname',
        'previousperiod' => 'setPreviousperiod',
        'previousperiodlink' => 'setPreviousperiodlink',
        'previousperiodname' => 'setPreviousperiodname',
        'rarrow' => 'setRarrow',
        'showviewselector' => 'setShowviewselector',
        'url' => 'setUrl',
        'view' => 'setView',
        'viewinginblock' => 'setViewinginblock',
        'viewingmonth' => 'setViewingmonth',
        'weeks' => 'setWeeks'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'calendarinstanceid' => 'getCalendarinstanceid',
        'categoryid' => 'getCategoryid',
        'courseid' => 'getCourseid',
        'date' => 'getDate',
        'daynames' => 'getDaynames',
        'defaulteventcontext' => 'getDefaulteventcontext',
        'filter_selector' => 'getFilterSelector',
        'includenavigation' => 'getIncludenavigation',
        'initialeventsloaded' => 'getInitialeventsloaded',
        'larrow' => 'getLarrow',
        'nextperiod' => 'getNextperiod',
        'nextperiodlink' => 'getNextperiodlink',
        'nextperiodname' => 'getNextperiodname',
        'periodname' => 'getPeriodname',
        'previousperiod' => 'getPreviousperiod',
        'previousperiodlink' => 'getPreviousperiodlink',
        'previousperiodname' => 'getPreviousperiodname',
        'rarrow' => 'getRarrow',
        'showviewselector' => 'getShowviewselector',
        'url' => 'getUrl',
        'view' => 'getView',
        'viewinginblock' => 'getViewinginblock',
        'viewingmonth' => 'getViewingmonth',
        'weeks' => 'getWeeks'
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
        $this->setIfExists('calendarinstanceid', $data ?? [], 0);
        $this->setIfExists('categoryid', $data ?? [], 0);
        $this->setIfExists('courseid', $data ?? [], null);
        $this->setIfExists('date', $data ?? [], null);
        $this->setIfExists('daynames', $data ?? [], null);
        $this->setIfExists('defaulteventcontext', $data ?? [], 0);
        $this->setIfExists('filter_selector', $data ?? [], null);
        $this->setIfExists('includenavigation', $data ?? [], true);
        $this->setIfExists('initialeventsloaded', $data ?? [], true);
        $this->setIfExists('larrow', $data ?? [], null);
        $this->setIfExists('nextperiod', $data ?? [], null);
        $this->setIfExists('nextperiodlink', $data ?? [], null);
        $this->setIfExists('nextperiodname', $data ?? [], null);
        $this->setIfExists('periodname', $data ?? [], null);
        $this->setIfExists('previousperiod', $data ?? [], null);
        $this->setIfExists('previousperiodlink', $data ?? [], null);
        $this->setIfExists('previousperiodname', $data ?? [], null);
        $this->setIfExists('rarrow', $data ?? [], null);
        $this->setIfExists('showviewselector', $data ?? [], true);
        $this->setIfExists('url', $data ?? [], null);
        $this->setIfExists('view', $data ?? [], 'null');
        $this->setIfExists('viewinginblock', $data ?? [], false);
        $this->setIfExists('viewingmonth', $data ?? [], true);
        $this->setIfExists('weeks', $data ?? [], null);
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

        if ($this->container['calendarinstanceid'] === null) {
            $invalidProperties[] = "'calendarinstanceid' can't be null";
        }
        if ($this->container['courseid'] === null) {
            $invalidProperties[] = "'courseid' can't be null";
        }
        if ($this->container['date'] === null) {
            $invalidProperties[] = "'date' can't be null";
        }
        if ($this->container['daynames'] === null) {
            $invalidProperties[] = "'daynames' can't be null";
        }
        if ($this->container['defaulteventcontext'] === null) {
            $invalidProperties[] = "'defaulteventcontext' can't be null";
        }
        if ($this->container['includenavigation'] === null) {
            $invalidProperties[] = "'includenavigation' can't be null";
        }
        if ($this->container['initialeventsloaded'] === null) {
            $invalidProperties[] = "'initialeventsloaded' can't be null";
        }
        if ($this->container['larrow'] === null) {
            $invalidProperties[] = "'larrow' can't be null";
        }
        if ($this->container['nextperiod'] === null) {
            $invalidProperties[] = "'nextperiod' can't be null";
        }
        if ($this->container['nextperiodlink'] === null) {
            $invalidProperties[] = "'nextperiodlink' can't be null";
        }
        if ($this->container['nextperiodname'] === null) {
            $invalidProperties[] = "'nextperiodname' can't be null";
        }
        if ($this->container['periodname'] === null) {
            $invalidProperties[] = "'periodname' can't be null";
        }
        if ($this->container['previousperiod'] === null) {
            $invalidProperties[] = "'previousperiod' can't be null";
        }
        if ($this->container['previousperiodlink'] === null) {
            $invalidProperties[] = "'previousperiodlink' can't be null";
        }
        if ($this->container['previousperiodname'] === null) {
            $invalidProperties[] = "'previousperiodname' can't be null";
        }
        if ($this->container['rarrow'] === null) {
            $invalidProperties[] = "'rarrow' can't be null";
        }
        if ($this->container['showviewselector'] === null) {
            $invalidProperties[] = "'showviewselector' can't be null";
        }
        if ($this->container['url'] === null) {
            $invalidProperties[] = "'url' can't be null";
        }
        if ($this->container['view'] === null) {
            $invalidProperties[] = "'view' can't be null";
        }
        if ($this->container['viewinginblock'] === null) {
            $invalidProperties[] = "'viewinginblock' can't be null";
        }
        if ($this->container['viewingmonth'] === null) {
            $invalidProperties[] = "'viewingmonth' can't be null";
        }
        if ($this->container['weeks'] === null) {
            $invalidProperties[] = "'weeks' can't be null";
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
     * Gets calendarinstanceid
     *
     * @return int
     */
    public function getCalendarinstanceid()
    {
        return $this->container['calendarinstanceid'];
    }

    /**
     * Sets calendarinstanceid
     *
     * @param int $calendarinstanceid calendarinstanceid
     *
     * @return self
     */
    public function setCalendarinstanceid($calendarinstanceid)
    {
        if (is_null($calendarinstanceid)) {
            throw new \InvalidArgumentException('non-nullable calendarinstanceid cannot be null');
        }
        $this->container['calendarinstanceid'] = $calendarinstanceid;

        return $this;
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
     * @param int|null $categoryid categoryid
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
     * Gets courseid
     *
     * @return int
     */
    public function getCourseid()
    {
        return $this->container['courseid'];
    }

    /**
     * Sets courseid
     *
     * @param int $courseid courseid
     *
     * @return self
     */
    public function setCourseid($courseid)
    {
        if (is_null($courseid)) {
            throw new \InvalidArgumentException('non-nullable courseid cannot be null');
        }
        $this->container['courseid'] = $courseid;

        return $this;
    }

    /**
     * Gets date
     *
     * @return \OpenAPI\Client\Model\CoreCalendarGetCalendarDayView200ResponseNextperiod
     */
    public function getDate()
    {
        return $this->container['date'];
    }

    /**
     * Sets date
     *
     * @param \OpenAPI\Client\Model\CoreCalendarGetCalendarDayView200ResponseNextperiod $date date
     *
     * @return self
     */
    public function setDate($date)
    {
        if (is_null($date)) {
            throw new \InvalidArgumentException('non-nullable date cannot be null');
        }
        $this->container['date'] = $date;

        return $this;
    }

    /**
     * Gets daynames
     *
     * @return \OpenAPI\Client\Model\CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner[]
     */
    public function getDaynames()
    {
        return $this->container['daynames'];
    }

    /**
     * Sets daynames
     *
     * @param \OpenAPI\Client\Model\CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner[] $daynames daynames
     *
     * @return self
     */
    public function setDaynames($daynames)
    {
        if (is_null($daynames)) {
            throw new \InvalidArgumentException('non-nullable daynames cannot be null');
        }
        $this->container['daynames'] = $daynames;

        return $this;
    }

    /**
     * Gets defaulteventcontext
     *
     * @return int
     */
    public function getDefaulteventcontext()
    {
        return $this->container['defaulteventcontext'];
    }

    /**
     * Sets defaulteventcontext
     *
     * @param int $defaulteventcontext defaulteventcontext
     *
     * @return self
     */
    public function setDefaulteventcontext($defaulteventcontext)
    {
        if (is_null($defaulteventcontext)) {
            throw new \InvalidArgumentException('non-nullable defaulteventcontext cannot be null');
        }
        $this->container['defaulteventcontext'] = $defaulteventcontext;

        return $this;
    }

    /**
     * Gets filter_selector
     *
     * @return string|null
     */
    public function getFilterSelector()
    {
        return $this->container['filter_selector'];
    }

    /**
     * Sets filter_selector
     *
     * @param string|null $filter_selector filter_selector
     *
     * @return self
     */
    public function setFilterSelector($filter_selector)
    {
        if (is_null($filter_selector)) {
            throw new \InvalidArgumentException('non-nullable filter_selector cannot be null');
        }
        $this->container['filter_selector'] = $filter_selector;

        return $this;
    }

    /**
     * Gets includenavigation
     *
     * @return bool
     */
    public function getIncludenavigation()
    {
        return $this->container['includenavigation'];
    }

    /**
     * Sets includenavigation
     *
     * @param bool $includenavigation includenavigation
     *
     * @return self
     */
    public function setIncludenavigation($includenavigation)
    {
        if (is_null($includenavigation)) {
            throw new \InvalidArgumentException('non-nullable includenavigation cannot be null');
        }
        $this->container['includenavigation'] = $includenavigation;

        return $this;
    }

    /**
     * Gets initialeventsloaded
     *
     * @return bool
     */
    public function getInitialeventsloaded()
    {
        return $this->container['initialeventsloaded'];
    }

    /**
     * Sets initialeventsloaded
     *
     * @param bool $initialeventsloaded initialeventsloaded
     *
     * @return self
     */
    public function setInitialeventsloaded($initialeventsloaded)
    {
        if (is_null($initialeventsloaded)) {
            throw new \InvalidArgumentException('non-nullable initialeventsloaded cannot be null');
        }
        $this->container['initialeventsloaded'] = $initialeventsloaded;

        return $this;
    }

    /**
     * Gets larrow
     *
     * @return string
     */
    public function getLarrow()
    {
        return $this->container['larrow'];
    }

    /**
     * Sets larrow
     *
     * @param string $larrow larrow
     *
     * @return self
     */
    public function setLarrow($larrow)
    {
        if (is_null($larrow)) {
            throw new \InvalidArgumentException('non-nullable larrow cannot be null');
        }
        $this->container['larrow'] = $larrow;

        return $this;
    }

    /**
     * Gets nextperiod
     *
     * @return \OpenAPI\Client\Model\CoreCalendarGetCalendarDayView200ResponseNextperiod
     */
    public function getNextperiod()
    {
        return $this->container['nextperiod'];
    }

    /**
     * Sets nextperiod
     *
     * @param \OpenAPI\Client\Model\CoreCalendarGetCalendarDayView200ResponseNextperiod $nextperiod nextperiod
     *
     * @return self
     */
    public function setNextperiod($nextperiod)
    {
        if (is_null($nextperiod)) {
            throw new \InvalidArgumentException('non-nullable nextperiod cannot be null');
        }
        $this->container['nextperiod'] = $nextperiod;

        return $this;
    }

    /**
     * Gets nextperiodlink
     *
     * @return string
     */
    public function getNextperiodlink()
    {
        return $this->container['nextperiodlink'];
    }

    /**
     * Sets nextperiodlink
     *
     * @param string $nextperiodlink nextperiodlink
     *
     * @return self
     */
    public function setNextperiodlink($nextperiodlink)
    {
        if (is_null($nextperiodlink)) {
            throw new \InvalidArgumentException('non-nullable nextperiodlink cannot be null');
        }
        $this->container['nextperiodlink'] = $nextperiodlink;

        return $this;
    }

    /**
     * Gets nextperiodname
     *
     * @return string
     */
    public function getNextperiodname()
    {
        return $this->container['nextperiodname'];
    }

    /**
     * Sets nextperiodname
     *
     * @param string $nextperiodname nextperiodname
     *
     * @return self
     */
    public function setNextperiodname($nextperiodname)
    {
        if (is_null($nextperiodname)) {
            throw new \InvalidArgumentException('non-nullable nextperiodname cannot be null');
        }
        $this->container['nextperiodname'] = $nextperiodname;

        return $this;
    }

    /**
     * Gets periodname
     *
     * @return string
     */
    public function getPeriodname()
    {
        return $this->container['periodname'];
    }

    /**
     * Sets periodname
     *
     * @param string $periodname periodname
     *
     * @return self
     */
    public function setPeriodname($periodname)
    {
        if (is_null($periodname)) {
            throw new \InvalidArgumentException('non-nullable periodname cannot be null');
        }
        $this->container['periodname'] = $periodname;

        return $this;
    }

    /**
     * Gets previousperiod
     *
     * @return \OpenAPI\Client\Model\CoreCalendarGetCalendarDayView200ResponseNextperiod
     */
    public function getPreviousperiod()
    {
        return $this->container['previousperiod'];
    }

    /**
     * Sets previousperiod
     *
     * @param \OpenAPI\Client\Model\CoreCalendarGetCalendarDayView200ResponseNextperiod $previousperiod previousperiod
     *
     * @return self
     */
    public function setPreviousperiod($previousperiod)
    {
        if (is_null($previousperiod)) {
            throw new \InvalidArgumentException('non-nullable previousperiod cannot be null');
        }
        $this->container['previousperiod'] = $previousperiod;

        return $this;
    }

    /**
     * Gets previousperiodlink
     *
     * @return string
     */
    public function getPreviousperiodlink()
    {
        return $this->container['previousperiodlink'];
    }

    /**
     * Sets previousperiodlink
     *
     * @param string $previousperiodlink previousperiodlink
     *
     * @return self
     */
    public function setPreviousperiodlink($previousperiodlink)
    {
        if (is_null($previousperiodlink)) {
            throw new \InvalidArgumentException('non-nullable previousperiodlink cannot be null');
        }
        $this->container['previousperiodlink'] = $previousperiodlink;

        return $this;
    }

    /**
     * Gets previousperiodname
     *
     * @return string
     */
    public function getPreviousperiodname()
    {
        return $this->container['previousperiodname'];
    }

    /**
     * Sets previousperiodname
     *
     * @param string $previousperiodname previousperiodname
     *
     * @return self
     */
    public function setPreviousperiodname($previousperiodname)
    {
        if (is_null($previousperiodname)) {
            throw new \InvalidArgumentException('non-nullable previousperiodname cannot be null');
        }
        $this->container['previousperiodname'] = $previousperiodname;

        return $this;
    }

    /**
     * Gets rarrow
     *
     * @return string
     */
    public function getRarrow()
    {
        return $this->container['rarrow'];
    }

    /**
     * Sets rarrow
     *
     * @param string $rarrow rarrow
     *
     * @return self
     */
    public function setRarrow($rarrow)
    {
        if (is_null($rarrow)) {
            throw new \InvalidArgumentException('non-nullable rarrow cannot be null');
        }
        $this->container['rarrow'] = $rarrow;

        return $this;
    }

    /**
     * Gets showviewselector
     *
     * @return bool
     */
    public function getShowviewselector()
    {
        return $this->container['showviewselector'];
    }

    /**
     * Sets showviewselector
     *
     * @param bool $showviewselector showviewselector
     *
     * @return self
     */
    public function setShowviewselector($showviewselector)
    {
        if (is_null($showviewselector)) {
            throw new \InvalidArgumentException('non-nullable showviewselector cannot be null');
        }
        $this->container['showviewselector'] = $showviewselector;

        return $this;
    }

    /**
     * Gets url
     *
     * @return string
     */
    public function getUrl()
    {
        return $this->container['url'];
    }

    /**
     * Sets url
     *
     * @param string $url url
     *
     * @return self
     */
    public function setUrl($url)
    {
        if (is_null($url)) {
            throw new \InvalidArgumentException('non-nullable url cannot be null');
        }
        $this->container['url'] = $url;

        return $this;
    }

    /**
     * Gets view
     *
     * @return string
     */
    public function getView()
    {
        return $this->container['view'];
    }

    /**
     * Sets view
     *
     * @param string $view view
     *
     * @return self
     */
    public function setView($view)
    {
        if (is_null($view)) {
            throw new \InvalidArgumentException('non-nullable view cannot be null');
        }
        $this->container['view'] = $view;

        return $this;
    }

    /**
     * Gets viewinginblock
     *
     * @return bool
     */
    public function getViewinginblock()
    {
        return $this->container['viewinginblock'];
    }

    /**
     * Sets viewinginblock
     *
     * @param bool $viewinginblock viewinginblock
     *
     * @return self
     */
    public function setViewinginblock($viewinginblock)
    {
        if (is_null($viewinginblock)) {
            throw new \InvalidArgumentException('non-nullable viewinginblock cannot be null');
        }
        $this->container['viewinginblock'] = $viewinginblock;

        return $this;
    }

    /**
     * Gets viewingmonth
     *
     * @return bool
     */
    public function getViewingmonth()
    {
        return $this->container['viewingmonth'];
    }

    /**
     * Sets viewingmonth
     *
     * @param bool $viewingmonth viewingmonth
     *
     * @return self
     */
    public function setViewingmonth($viewingmonth)
    {
        if (is_null($viewingmonth)) {
            throw new \InvalidArgumentException('non-nullable viewingmonth cannot be null');
        }
        $this->container['viewingmonth'] = $viewingmonth;

        return $this;
    }

    /**
     * Gets weeks
     *
     * @return \OpenAPI\Client\Model\CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner[]
     */
    public function getWeeks()
    {
        return $this->container['weeks'];
    }

    /**
     * Sets weeks
     *
     * @param \OpenAPI\Client\Model\CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner[] $weeks weeks
     *
     * @return self
     */
    public function setWeeks($weeks)
    {
        if (is_null($weeks)) {
            throw new \InvalidArgumentException('non-nullable weeks cannot be null');
        }
        $this->container['weeks'] = $weeks;

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


