<?php
/**
 * CoreCalendarGetActionEventsByCourseRequest
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
 * CoreCalendarGetActionEventsByCourseRequest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreCalendarGetActionEventsByCourseRequest implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_calendar_get_action_events_by_course_request';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'aftereventid' => 'int',
        'courseid' => 'int',
        'limitnum' => 'int',
        'searchvalue' => 'string',
        'timesortfrom' => 'int',
        'timesortto' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'aftereventid' => null,
        'courseid' => null,
        'limitnum' => null,
        'searchvalue' => null,
        'timesortfrom' => null,
        'timesortto' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'aftereventid' => false,
        'courseid' => false,
        'limitnum' => false,
        'searchvalue' => false,
        'timesortfrom' => false,
        'timesortto' => false
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
        'aftereventid' => 'aftereventid',
        'courseid' => 'courseid',
        'limitnum' => 'limitnum',
        'searchvalue' => 'searchvalue',
        'timesortfrom' => 'timesortfrom',
        'timesortto' => 'timesortto'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'aftereventid' => 'setAftereventid',
        'courseid' => 'setCourseid',
        'limitnum' => 'setLimitnum',
        'searchvalue' => 'setSearchvalue',
        'timesortfrom' => 'setTimesortfrom',
        'timesortto' => 'setTimesortto'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'aftereventid' => 'getAftereventid',
        'courseid' => 'getCourseid',
        'limitnum' => 'getLimitnum',
        'searchvalue' => 'getSearchvalue',
        'timesortfrom' => 'getTimesortfrom',
        'timesortto' => 'getTimesortto'
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
        $this->setIfExists('aftereventid', $data ?? [], 0);
        $this->setIfExists('courseid', $data ?? [], null);
        $this->setIfExists('limitnum', $data ?? [], 20);
        $this->setIfExists('searchvalue', $data ?? [], 'null');
        $this->setIfExists('timesortfrom', $data ?? [], null);
        $this->setIfExists('timesortto', $data ?? [], null);
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

        if ($this->container['courseid'] === null) {
            $invalidProperties[] = "'courseid' can't be null";
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
     * Gets aftereventid
     *
     * @return int|null
     */
    public function getAftereventid()
    {
        return $this->container['aftereventid'];
    }

    /**
     * Sets aftereventid
     *
     * @param int|null $aftereventid The last seen event id
     *
     * @return self
     */
    public function setAftereventid($aftereventid)
    {
        if (is_null($aftereventid)) {
            throw new \InvalidArgumentException('non-nullable aftereventid cannot be null');
        }
        $this->container['aftereventid'] = $aftereventid;

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
     * @param int $courseid Course id
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
     * Gets limitnum
     *
     * @return int|null
     */
    public function getLimitnum()
    {
        return $this->container['limitnum'];
    }

    /**
     * Sets limitnum
     *
     * @param int|null $limitnum Limit number
     *
     * @return self
     */
    public function setLimitnum($limitnum)
    {
        if (is_null($limitnum)) {
            throw new \InvalidArgumentException('non-nullable limitnum cannot be null');
        }
        $this->container['limitnum'] = $limitnum;

        return $this;
    }

    /**
     * Gets searchvalue
     *
     * @return string|null
     */
    public function getSearchvalue()
    {
        return $this->container['searchvalue'];
    }

    /**
     * Sets searchvalue
     *
     * @param string|null $searchvalue The value a user wishes to search against
     *
     * @return self
     */
    public function setSearchvalue($searchvalue)
    {
        if (is_null($searchvalue)) {
            throw new \InvalidArgumentException('non-nullable searchvalue cannot be null');
        }
        $this->container['searchvalue'] = $searchvalue;

        return $this;
    }

    /**
     * Gets timesortfrom
     *
     * @return int|null
     */
    public function getTimesortfrom()
    {
        return $this->container['timesortfrom'];
    }

    /**
     * Sets timesortfrom
     *
     * @param int|null $timesortfrom Time sort from
     *
     * @return self
     */
    public function setTimesortfrom($timesortfrom)
    {
        if (is_null($timesortfrom)) {
            throw new \InvalidArgumentException('non-nullable timesortfrom cannot be null');
        }
        $this->container['timesortfrom'] = $timesortfrom;

        return $this;
    }

    /**
     * Gets timesortto
     *
     * @return int|null
     */
    public function getTimesortto()
    {
        return $this->container['timesortto'];
    }

    /**
     * Sets timesortto
     *
     * @param int|null $timesortto Time sort to
     *
     * @return self
     */
    public function setTimesortto($timesortto)
    {
        if (is_null($timesortto)) {
            throw new \InvalidArgumentException('non-nullable timesortto cannot be null');
        }
        $this->container['timesortto'] = $timesortto;

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


