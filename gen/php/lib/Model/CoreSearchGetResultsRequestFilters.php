<?php
/**
 * CoreSearchGetResultsRequestFilters
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
 * CoreSearchGetResultsRequestFilters Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreSearchGetResultsRequestFilters implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_search_get_results_request_filters';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'areaids' => 'object[]',
        'cat' => 'string',
        'contextids' => 'object[]',
        'courseids' => 'object[]',
        'groupids' => 'object[]',
        'mycoursesonly' => 'bool',
        'order' => 'string',
        'timeend' => 'int',
        'timestart' => 'int',
        'title' => 'string',
        'userids' => 'object[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'areaids' => null,
        'cat' => null,
        'contextids' => null,
        'courseids' => null,
        'groupids' => null,
        'mycoursesonly' => null,
        'order' => null,
        'timeend' => null,
        'timestart' => null,
        'title' => null,
        'userids' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'areaids' => false,
        'cat' => false,
        'contextids' => false,
        'courseids' => false,
        'groupids' => false,
        'mycoursesonly' => false,
        'order' => false,
        'timeend' => false,
        'timestart' => false,
        'title' => false,
        'userids' => false
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
        'areaids' => 'areaids',
        'cat' => 'cat',
        'contextids' => 'contextids',
        'courseids' => 'courseids',
        'groupids' => 'groupids',
        'mycoursesonly' => 'mycoursesonly',
        'order' => 'order',
        'timeend' => 'timeend',
        'timestart' => 'timestart',
        'title' => 'title',
        'userids' => 'userids'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'areaids' => 'setAreaids',
        'cat' => 'setCat',
        'contextids' => 'setContextids',
        'courseids' => 'setCourseids',
        'groupids' => 'setGroupids',
        'mycoursesonly' => 'setMycoursesonly',
        'order' => 'setOrder',
        'timeend' => 'setTimeend',
        'timestart' => 'setTimestart',
        'title' => 'setTitle',
        'userids' => 'setUserids'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'areaids' => 'getAreaids',
        'cat' => 'getCat',
        'contextids' => 'getContextids',
        'courseids' => 'getCourseids',
        'groupids' => 'getGroupids',
        'mycoursesonly' => 'getMycoursesonly',
        'order' => 'getOrder',
        'timeend' => 'getTimeend',
        'timestart' => 'getTimestart',
        'title' => 'getTitle',
        'userids' => 'getUserids'
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
        $this->setIfExists('areaids', $data ?? [], null);
        $this->setIfExists('cat', $data ?? [], '');
        $this->setIfExists('contextids', $data ?? [], null);
        $this->setIfExists('courseids', $data ?? [], null);
        $this->setIfExists('groupids', $data ?? [], null);
        $this->setIfExists('mycoursesonly', $data ?? [], false);
        $this->setIfExists('order', $data ?? [], '');
        $this->setIfExists('timeend', $data ?? [], 0);
        $this->setIfExists('timestart', $data ?? [], 0);
        $this->setIfExists('title', $data ?? [], 'null');
        $this->setIfExists('userids', $data ?? [], null);
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
     * Gets areaids
     *
     * @return object[]|null
     */
    public function getAreaids()
    {
        return $this->container['areaids'];
    }

    /**
     * Sets areaids
     *
     * @param object[]|null $areaids areaids
     *
     * @return self
     */
    public function setAreaids($areaids)
    {
        if (is_null($areaids)) {
            throw new \InvalidArgumentException('non-nullable areaids cannot be null');
        }
        $this->container['areaids'] = $areaids;

        return $this;
    }

    /**
     * Gets cat
     *
     * @return string|null
     */
    public function getCat()
    {
        return $this->container['cat'];
    }

    /**
     * Sets cat
     *
     * @param string|null $cat category to filter areas
     *
     * @return self
     */
    public function setCat($cat)
    {
        if (is_null($cat)) {
            throw new \InvalidArgumentException('non-nullable cat cannot be null');
        }
        $this->container['cat'] = $cat;

        return $this;
    }

    /**
     * Gets contextids
     *
     * @return object[]|null
     */
    public function getContextids()
    {
        return $this->container['contextids'];
    }

    /**
     * Sets contextids
     *
     * @param object[]|null $contextids contextids
     *
     * @return self
     */
    public function setContextids($contextids)
    {
        if (is_null($contextids)) {
            throw new \InvalidArgumentException('non-nullable contextids cannot be null');
        }
        $this->container['contextids'] = $contextids;

        return $this;
    }

    /**
     * Gets courseids
     *
     * @return object[]|null
     */
    public function getCourseids()
    {
        return $this->container['courseids'];
    }

    /**
     * Sets courseids
     *
     * @param object[]|null $courseids courseids
     *
     * @return self
     */
    public function setCourseids($courseids)
    {
        if (is_null($courseids)) {
            throw new \InvalidArgumentException('non-nullable courseids cannot be null');
        }
        $this->container['courseids'] = $courseids;

        return $this;
    }

    /**
     * Gets groupids
     *
     * @return object[]|null
     */
    public function getGroupids()
    {
        return $this->container['groupids'];
    }

    /**
     * Sets groupids
     *
     * @param object[]|null $groupids groupids
     *
     * @return self
     */
    public function setGroupids($groupids)
    {
        if (is_null($groupids)) {
            throw new \InvalidArgumentException('non-nullable groupids cannot be null');
        }
        $this->container['groupids'] = $groupids;

        return $this;
    }

    /**
     * Gets mycoursesonly
     *
     * @return bool|null
     */
    public function getMycoursesonly()
    {
        return $this->container['mycoursesonly'];
    }

    /**
     * Sets mycoursesonly
     *
     * @param bool|null $mycoursesonly only results from my courses
     *
     * @return self
     */
    public function setMycoursesonly($mycoursesonly)
    {
        if (is_null($mycoursesonly)) {
            throw new \InvalidArgumentException('non-nullable mycoursesonly cannot be null');
        }
        $this->container['mycoursesonly'] = $mycoursesonly;

        return $this;
    }

    /**
     * Gets order
     *
     * @return string|null
     */
    public function getOrder()
    {
        return $this->container['order'];
    }

    /**
     * Sets order
     *
     * @param string|null $order how to order
     *
     * @return self
     */
    public function setOrder($order)
    {
        if (is_null($order)) {
            throw new \InvalidArgumentException('non-nullable order cannot be null');
        }
        $this->container['order'] = $order;

        return $this;
    }

    /**
     * Gets timeend
     *
     * @return int|null
     */
    public function getTimeend()
    {
        return $this->container['timeend'];
    }

    /**
     * Sets timeend
     *
     * @param int|null $timeend docs modified before this date
     *
     * @return self
     */
    public function setTimeend($timeend)
    {
        if (is_null($timeend)) {
            throw new \InvalidArgumentException('non-nullable timeend cannot be null');
        }
        $this->container['timeend'] = $timeend;

        return $this;
    }

    /**
     * Gets timestart
     *
     * @return int|null
     */
    public function getTimestart()
    {
        return $this->container['timestart'];
    }

    /**
     * Sets timestart
     *
     * @param int|null $timestart docs modified after this date
     *
     * @return self
     */
    public function setTimestart($timestart)
    {
        if (is_null($timestart)) {
            throw new \InvalidArgumentException('non-nullable timestart cannot be null');
        }
        $this->container['timestart'] = $timestart;

        return $this;
    }

    /**
     * Gets title
     *
     * @return string|null
     */
    public function getTitle()
    {
        return $this->container['title'];
    }

    /**
     * Sets title
     *
     * @param string|null $title result title
     *
     * @return self
     */
    public function setTitle($title)
    {
        if (is_null($title)) {
            throw new \InvalidArgumentException('non-nullable title cannot be null');
        }
        $this->container['title'] = $title;

        return $this;
    }

    /**
     * Gets userids
     *
     * @return object[]|null
     */
    public function getUserids()
    {
        return $this->container['userids'];
    }

    /**
     * Sets userids
     *
     * @param object[]|null $userids userids
     *
     * @return self
     */
    public function setUserids($userids)
    {
        if (is_null($userids)) {
            throw new \InvalidArgumentException('non-nullable userids cannot be null');
        }
        $this->container['userids'] = $userids;

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

