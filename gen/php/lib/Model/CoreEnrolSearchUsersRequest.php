<?php
/**
 * CoreEnrolSearchUsersRequest
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
 * CoreEnrolSearchUsersRequest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreEnrolSearchUsersRequest implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_enrol_search_users_request';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'contextid' => 'int',
        'courseid' => 'int',
        'page' => 'int',
        'perpage' => 'int',
        'search' => 'string',
        'searchanywhere' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'contextid' => null,
        'courseid' => null,
        'page' => null,
        'perpage' => null,
        'search' => null,
        'searchanywhere' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'contextid' => false,
        'courseid' => false,
        'page' => false,
        'perpage' => false,
        'search' => false,
        'searchanywhere' => false
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
        'contextid' => 'contextid',
        'courseid' => 'courseid',
        'page' => 'page',
        'perpage' => 'perpage',
        'search' => 'search',
        'searchanywhere' => 'searchanywhere'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'contextid' => 'setContextid',
        'courseid' => 'setCourseid',
        'page' => 'setPage',
        'perpage' => 'setPerpage',
        'search' => 'setSearch',
        'searchanywhere' => 'setSearchanywhere'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'contextid' => 'getContextid',
        'courseid' => 'getCourseid',
        'page' => 'getPage',
        'perpage' => 'getPerpage',
        'search' => 'getSearch',
        'searchanywhere' => 'getSearchanywhere'
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
        $this->setIfExists('contextid', $data ?? [], null);
        $this->setIfExists('courseid', $data ?? [], null);
        $this->setIfExists('page', $data ?? [], null);
        $this->setIfExists('perpage', $data ?? [], null);
        $this->setIfExists('search', $data ?? [], null);
        $this->setIfExists('searchanywhere', $data ?? [], null);
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
        if ($this->container['page'] === null) {
            $invalidProperties[] = "'page' can't be null";
        }
        if ($this->container['perpage'] === null) {
            $invalidProperties[] = "'perpage' can't be null";
        }
        if ($this->container['search'] === null) {
            $invalidProperties[] = "'search' can't be null";
        }
        if ($this->container['searchanywhere'] === null) {
            $invalidProperties[] = "'searchanywhere' can't be null";
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
     * Gets contextid
     *
     * @return int|null
     */
    public function getContextid()
    {
        return $this->container['contextid'];
    }

    /**
     * Sets contextid
     *
     * @param int|null $contextid Context ID
     *
     * @return self
     */
    public function setContextid($contextid)
    {
        if (is_null($contextid)) {
            throw new \InvalidArgumentException('non-nullable contextid cannot be null');
        }
        $this->container['contextid'] = $contextid;

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
     * @param int $courseid course id
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
     * Gets page
     *
     * @return int
     */
    public function getPage()
    {
        return $this->container['page'];
    }

    /**
     * Sets page
     *
     * @param int $page Page number
     *
     * @return self
     */
    public function setPage($page)
    {
        if (is_null($page)) {
            throw new \InvalidArgumentException('non-nullable page cannot be null');
        }
        $this->container['page'] = $page;

        return $this;
    }

    /**
     * Gets perpage
     *
     * @return int
     */
    public function getPerpage()
    {
        return $this->container['perpage'];
    }

    /**
     * Sets perpage
     *
     * @param int $perpage Number per page
     *
     * @return self
     */
    public function setPerpage($perpage)
    {
        if (is_null($perpage)) {
            throw new \InvalidArgumentException('non-nullable perpage cannot be null');
        }
        $this->container['perpage'] = $perpage;

        return $this;
    }

    /**
     * Gets search
     *
     * @return string
     */
    public function getSearch()
    {
        return $this->container['search'];
    }

    /**
     * Sets search
     *
     * @param string $search query
     *
     * @return self
     */
    public function setSearch($search)
    {
        if (is_null($search)) {
            throw new \InvalidArgumentException('non-nullable search cannot be null');
        }
        $this->container['search'] = $search;

        return $this;
    }

    /**
     * Gets searchanywhere
     *
     * @return bool
     */
    public function getSearchanywhere()
    {
        return $this->container['searchanywhere'];
    }

    /**
     * Sets searchanywhere
     *
     * @param bool $searchanywhere find a match anywhere, or only at the beginning
     *
     * @return self
     */
    public function setSearchanywhere($searchanywhere)
    {
        if (is_null($searchanywhere)) {
            throw new \InvalidArgumentException('non-nullable searchanywhere cannot be null');
        }
        $this->container['searchanywhere'] = $searchanywhere;

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

