<?php
/**
 * ModAssignListParticipantsRequest
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
 * ModAssignListParticipantsRequest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModAssignListParticipantsRequest implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_assign_list_participants_request';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'assignid' => 'int',
        'filter' => 'string',
        'groupid' => 'int',
        'includeenrolments' => 'bool',
        'limit' => 'int',
        'onlyids' => 'bool',
        'skip' => 'int',
        'tablesort' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'assignid' => null,
        'filter' => null,
        'groupid' => null,
        'includeenrolments' => null,
        'limit' => null,
        'onlyids' => null,
        'skip' => null,
        'tablesort' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'assignid' => false,
        'filter' => false,
        'groupid' => false,
        'includeenrolments' => false,
        'limit' => false,
        'onlyids' => false,
        'skip' => false,
        'tablesort' => false
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
        'assignid' => 'assignid',
        'filter' => 'filter',
        'groupid' => 'groupid',
        'includeenrolments' => 'includeenrolments',
        'limit' => 'limit',
        'onlyids' => 'onlyids',
        'skip' => 'skip',
        'tablesort' => 'tablesort'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'assignid' => 'setAssignid',
        'filter' => 'setFilter',
        'groupid' => 'setGroupid',
        'includeenrolments' => 'setIncludeenrolments',
        'limit' => 'setLimit',
        'onlyids' => 'setOnlyids',
        'skip' => 'setSkip',
        'tablesort' => 'setTablesort'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'assignid' => 'getAssignid',
        'filter' => 'getFilter',
        'groupid' => 'getGroupid',
        'includeenrolments' => 'getIncludeenrolments',
        'limit' => 'getLimit',
        'onlyids' => 'getOnlyids',
        'skip' => 'getSkip',
        'tablesort' => 'getTablesort'
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
        $this->setIfExists('assignid', $data ?? [], null);
        $this->setIfExists('filter', $data ?? [], 'null');
        $this->setIfExists('groupid', $data ?? [], null);
        $this->setIfExists('includeenrolments', $data ?? [], true);
        $this->setIfExists('limit', $data ?? [], 0);
        $this->setIfExists('onlyids', $data ?? [], false);
        $this->setIfExists('skip', $data ?? [], 0);
        $this->setIfExists('tablesort', $data ?? [], false);
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

        if ($this->container['assignid'] === null) {
            $invalidProperties[] = "'assignid' can't be null";
        }
        if ($this->container['filter'] === null) {
            $invalidProperties[] = "'filter' can't be null";
        }
        if ($this->container['groupid'] === null) {
            $invalidProperties[] = "'groupid' can't be null";
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
     * Gets assignid
     *
     * @return int
     */
    public function getAssignid()
    {
        return $this->container['assignid'];
    }

    /**
     * Sets assignid
     *
     * @param int $assignid assign instance id
     *
     * @return self
     */
    public function setAssignid($assignid)
    {
        if (is_null($assignid)) {
            throw new \InvalidArgumentException('non-nullable assignid cannot be null');
        }
        $this->container['assignid'] = $assignid;

        return $this;
    }

    /**
     * Gets filter
     *
     * @return string
     */
    public function getFilter()
    {
        return $this->container['filter'];
    }

    /**
     * Sets filter
     *
     * @param string $filter search string to filter the results
     *
     * @return self
     */
    public function setFilter($filter)
    {
        if (is_null($filter)) {
            throw new \InvalidArgumentException('non-nullable filter cannot be null');
        }
        $this->container['filter'] = $filter;

        return $this;
    }

    /**
     * Gets groupid
     *
     * @return int
     */
    public function getGroupid()
    {
        return $this->container['groupid'];
    }

    /**
     * Sets groupid
     *
     * @param int $groupid group id
     *
     * @return self
     */
    public function setGroupid($groupid)
    {
        if (is_null($groupid)) {
            throw new \InvalidArgumentException('non-nullable groupid cannot be null');
        }
        $this->container['groupid'] = $groupid;

        return $this;
    }

    /**
     * Gets includeenrolments
     *
     * @return bool|null
     */
    public function getIncludeenrolments()
    {
        return $this->container['includeenrolments'];
    }

    /**
     * Sets includeenrolments
     *
     * @param bool|null $includeenrolments Do return courses where the user is enrolled
     *
     * @return self
     */
    public function setIncludeenrolments($includeenrolments)
    {
        if (is_null($includeenrolments)) {
            throw new \InvalidArgumentException('non-nullable includeenrolments cannot be null');
        }
        $this->container['includeenrolments'] = $includeenrolments;

        return $this;
    }

    /**
     * Gets limit
     *
     * @return int|null
     */
    public function getLimit()
    {
        return $this->container['limit'];
    }

    /**
     * Sets limit
     *
     * @param int|null $limit maximum number of records to return
     *
     * @return self
     */
    public function setLimit($limit)
    {
        if (is_null($limit)) {
            throw new \InvalidArgumentException('non-nullable limit cannot be null');
        }
        $this->container['limit'] = $limit;

        return $this;
    }

    /**
     * Gets onlyids
     *
     * @return bool|null
     */
    public function getOnlyids()
    {
        return $this->container['onlyids'];
    }

    /**
     * Sets onlyids
     *
     * @param bool|null $onlyids Do not return all user fields
     *
     * @return self
     */
    public function setOnlyids($onlyids)
    {
        if (is_null($onlyids)) {
            throw new \InvalidArgumentException('non-nullable onlyids cannot be null');
        }
        $this->container['onlyids'] = $onlyids;

        return $this;
    }

    /**
     * Gets skip
     *
     * @return int|null
     */
    public function getSkip()
    {
        return $this->container['skip'];
    }

    /**
     * Sets skip
     *
     * @param int|null $skip number of records to skip
     *
     * @return self
     */
    public function setSkip($skip)
    {
        if (is_null($skip)) {
            throw new \InvalidArgumentException('non-nullable skip cannot be null');
        }
        $this->container['skip'] = $skip;

        return $this;
    }

    /**
     * Gets tablesort
     *
     * @return bool|null
     */
    public function getTablesort()
    {
        return $this->container['tablesort'];
    }

    /**
     * Sets tablesort
     *
     * @param bool|null $tablesort Apply current user table sorting preferences.
     *
     * @return self
     */
    public function setTablesort($tablesort)
    {
        if (is_null($tablesort)) {
            throw new \InvalidArgumentException('non-nullable tablesort cannot be null');
        }
        $this->container['tablesort'] = $tablesort;

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

