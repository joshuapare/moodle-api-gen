<?php
/**
 * CoreCalendarGetCalendarDayView200ResponseNextperiod
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
 * CoreCalendarGetCalendarDayView200ResponseNextperiod Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreCalendarGetCalendarDayView200ResponseNextperiod implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_calendar_get_calendar_day_view_200_response_nextperiod';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'hours' => 'int',
        'mday' => 'int',
        'minutes' => 'int',
        'mon' => 'int',
        'month' => 'string',
        'seconds' => 'int',
        'timestamp' => 'int',
        'wday' => 'int',
        'weekday' => 'string',
        'yday' => 'int',
        'year' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'hours' => null,
        'mday' => null,
        'minutes' => null,
        'mon' => null,
        'month' => null,
        'seconds' => null,
        'timestamp' => null,
        'wday' => null,
        'weekday' => null,
        'yday' => null,
        'year' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'hours' => false,
        'mday' => false,
        'minutes' => false,
        'mon' => false,
        'month' => false,
        'seconds' => false,
        'timestamp' => false,
        'wday' => false,
        'weekday' => false,
        'yday' => false,
        'year' => false
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
        'hours' => 'hours',
        'mday' => 'mday',
        'minutes' => 'minutes',
        'mon' => 'mon',
        'month' => 'month',
        'seconds' => 'seconds',
        'timestamp' => 'timestamp',
        'wday' => 'wday',
        'weekday' => 'weekday',
        'yday' => 'yday',
        'year' => 'year'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'hours' => 'setHours',
        'mday' => 'setMday',
        'minutes' => 'setMinutes',
        'mon' => 'setMon',
        'month' => 'setMonth',
        'seconds' => 'setSeconds',
        'timestamp' => 'setTimestamp',
        'wday' => 'setWday',
        'weekday' => 'setWeekday',
        'yday' => 'setYday',
        'year' => 'setYear'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'hours' => 'getHours',
        'mday' => 'getMday',
        'minutes' => 'getMinutes',
        'mon' => 'getMon',
        'month' => 'getMonth',
        'seconds' => 'getSeconds',
        'timestamp' => 'getTimestamp',
        'wday' => 'getWday',
        'weekday' => 'getWeekday',
        'yday' => 'getYday',
        'year' => 'getYear'
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
        $this->setIfExists('hours', $data ?? [], null);
        $this->setIfExists('mday', $data ?? [], null);
        $this->setIfExists('minutes', $data ?? [], null);
        $this->setIfExists('mon', $data ?? [], null);
        $this->setIfExists('month', $data ?? [], null);
        $this->setIfExists('seconds', $data ?? [], null);
        $this->setIfExists('timestamp', $data ?? [], null);
        $this->setIfExists('wday', $data ?? [], null);
        $this->setIfExists('weekday', $data ?? [], null);
        $this->setIfExists('yday', $data ?? [], null);
        $this->setIfExists('year', $data ?? [], null);
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

        if ($this->container['hours'] === null) {
            $invalidProperties[] = "'hours' can't be null";
        }
        if ($this->container['mday'] === null) {
            $invalidProperties[] = "'mday' can't be null";
        }
        if ($this->container['minutes'] === null) {
            $invalidProperties[] = "'minutes' can't be null";
        }
        if ($this->container['mon'] === null) {
            $invalidProperties[] = "'mon' can't be null";
        }
        if ($this->container['month'] === null) {
            $invalidProperties[] = "'month' can't be null";
        }
        if ($this->container['seconds'] === null) {
            $invalidProperties[] = "'seconds' can't be null";
        }
        if ($this->container['timestamp'] === null) {
            $invalidProperties[] = "'timestamp' can't be null";
        }
        if ($this->container['wday'] === null) {
            $invalidProperties[] = "'wday' can't be null";
        }
        if ($this->container['weekday'] === null) {
            $invalidProperties[] = "'weekday' can't be null";
        }
        if ($this->container['yday'] === null) {
            $invalidProperties[] = "'yday' can't be null";
        }
        if ($this->container['year'] === null) {
            $invalidProperties[] = "'year' can't be null";
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
     * Gets hours
     *
     * @return int
     */
    public function getHours()
    {
        return $this->container['hours'];
    }

    /**
     * Sets hours
     *
     * @param int $hours hours
     *
     * @return self
     */
    public function setHours($hours)
    {
        if (is_null($hours)) {
            throw new \InvalidArgumentException('non-nullable hours cannot be null');
        }
        $this->container['hours'] = $hours;

        return $this;
    }

    /**
     * Gets mday
     *
     * @return int
     */
    public function getMday()
    {
        return $this->container['mday'];
    }

    /**
     * Sets mday
     *
     * @param int $mday mday
     *
     * @return self
     */
    public function setMday($mday)
    {
        if (is_null($mday)) {
            throw new \InvalidArgumentException('non-nullable mday cannot be null');
        }
        $this->container['mday'] = $mday;

        return $this;
    }

    /**
     * Gets minutes
     *
     * @return int
     */
    public function getMinutes()
    {
        return $this->container['minutes'];
    }

    /**
     * Sets minutes
     *
     * @param int $minutes minutes
     *
     * @return self
     */
    public function setMinutes($minutes)
    {
        if (is_null($minutes)) {
            throw new \InvalidArgumentException('non-nullable minutes cannot be null');
        }
        $this->container['minutes'] = $minutes;

        return $this;
    }

    /**
     * Gets mon
     *
     * @return int
     */
    public function getMon()
    {
        return $this->container['mon'];
    }

    /**
     * Sets mon
     *
     * @param int $mon mon
     *
     * @return self
     */
    public function setMon($mon)
    {
        if (is_null($mon)) {
            throw new \InvalidArgumentException('non-nullable mon cannot be null');
        }
        $this->container['mon'] = $mon;

        return $this;
    }

    /**
     * Gets month
     *
     * @return string
     */
    public function getMonth()
    {
        return $this->container['month'];
    }

    /**
     * Sets month
     *
     * @param string $month month
     *
     * @return self
     */
    public function setMonth($month)
    {
        if (is_null($month)) {
            throw new \InvalidArgumentException('non-nullable month cannot be null');
        }
        $this->container['month'] = $month;

        return $this;
    }

    /**
     * Gets seconds
     *
     * @return int
     */
    public function getSeconds()
    {
        return $this->container['seconds'];
    }

    /**
     * Sets seconds
     *
     * @param int $seconds seconds
     *
     * @return self
     */
    public function setSeconds($seconds)
    {
        if (is_null($seconds)) {
            throw new \InvalidArgumentException('non-nullable seconds cannot be null');
        }
        $this->container['seconds'] = $seconds;

        return $this;
    }

    /**
     * Gets timestamp
     *
     * @return int
     */
    public function getTimestamp()
    {
        return $this->container['timestamp'];
    }

    /**
     * Sets timestamp
     *
     * @param int $timestamp timestamp
     *
     * @return self
     */
    public function setTimestamp($timestamp)
    {
        if (is_null($timestamp)) {
            throw new \InvalidArgumentException('non-nullable timestamp cannot be null');
        }
        $this->container['timestamp'] = $timestamp;

        return $this;
    }

    /**
     * Gets wday
     *
     * @return int
     */
    public function getWday()
    {
        return $this->container['wday'];
    }

    /**
     * Sets wday
     *
     * @param int $wday wday
     *
     * @return self
     */
    public function setWday($wday)
    {
        if (is_null($wday)) {
            throw new \InvalidArgumentException('non-nullable wday cannot be null');
        }
        $this->container['wday'] = $wday;

        return $this;
    }

    /**
     * Gets weekday
     *
     * @return string
     */
    public function getWeekday()
    {
        return $this->container['weekday'];
    }

    /**
     * Sets weekday
     *
     * @param string $weekday weekday
     *
     * @return self
     */
    public function setWeekday($weekday)
    {
        if (is_null($weekday)) {
            throw new \InvalidArgumentException('non-nullable weekday cannot be null');
        }
        $this->container['weekday'] = $weekday;

        return $this;
    }

    /**
     * Gets yday
     *
     * @return int
     */
    public function getYday()
    {
        return $this->container['yday'];
    }

    /**
     * Sets yday
     *
     * @param int $yday yday
     *
     * @return self
     */
    public function setYday($yday)
    {
        if (is_null($yday)) {
            throw new \InvalidArgumentException('non-nullable yday cannot be null');
        }
        $this->container['yday'] = $yday;

        return $this;
    }

    /**
     * Gets year
     *
     * @return int
     */
    public function getYear()
    {
        return $this->container['year'];
    }

    /**
     * Sets year
     *
     * @param int $year year
     *
     * @return self
     */
    public function setYear($year)
    {
        if (is_null($year)) {
            throw new \InvalidArgumentException('non-nullable year cannot be null');
        }
        $this->container['year'] = $year;

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

