<?php
/**
 * ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls
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
 * ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_lti_get_tool_types_and_proxies_200_response_types_inner_urls';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'accesstoken' => 'string',
        'authrequest' => 'string',
        'course' => 'string',
        'edit' => 'string',
        'icon' => 'string',
        'publickeyset' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'accesstoken' => null,
        'authrequest' => null,
        'course' => null,
        'edit' => null,
        'icon' => null,
        'publickeyset' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'accesstoken' => false,
        'authrequest' => false,
        'course' => false,
        'edit' => false,
        'icon' => false,
        'publickeyset' => false
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
        'accesstoken' => 'accesstoken',
        'authrequest' => 'authrequest',
        'course' => 'course',
        'edit' => 'edit',
        'icon' => 'icon',
        'publickeyset' => 'publickeyset'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'accesstoken' => 'setAccesstoken',
        'authrequest' => 'setAuthrequest',
        'course' => 'setCourse',
        'edit' => 'setEdit',
        'icon' => 'setIcon',
        'publickeyset' => 'setPublickeyset'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'accesstoken' => 'getAccesstoken',
        'authrequest' => 'getAuthrequest',
        'course' => 'getCourse',
        'edit' => 'getEdit',
        'icon' => 'getIcon',
        'publickeyset' => 'getPublickeyset'
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
        $this->setIfExists('accesstoken', $data ?? [], null);
        $this->setIfExists('authrequest', $data ?? [], null);
        $this->setIfExists('course', $data ?? [], null);
        $this->setIfExists('edit', $data ?? [], null);
        $this->setIfExists('icon', $data ?? [], null);
        $this->setIfExists('publickeyset', $data ?? [], null);
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

        if ($this->container['accesstoken'] === null) {
            $invalidProperties[] = "'accesstoken' can't be null";
        }
        if ($this->container['authrequest'] === null) {
            $invalidProperties[] = "'authrequest' can't be null";
        }
        if ($this->container['edit'] === null) {
            $invalidProperties[] = "'edit' can't be null";
        }
        if ($this->container['icon'] === null) {
            $invalidProperties[] = "'icon' can't be null";
        }
        if ($this->container['publickeyset'] === null) {
            $invalidProperties[] = "'publickeyset' can't be null";
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
     * Gets accesstoken
     *
     * @return string
     */
    public function getAccesstoken()
    {
        return $this->container['accesstoken'];
    }

    /**
     * Sets accesstoken
     *
     * @param string $accesstoken Access Token URL
     *
     * @return self
     */
    public function setAccesstoken($accesstoken)
    {
        if (is_null($accesstoken)) {
            throw new \InvalidArgumentException('non-nullable accesstoken cannot be null');
        }
        $this->container['accesstoken'] = $accesstoken;

        return $this;
    }

    /**
     * Gets authrequest
     *
     * @return string
     */
    public function getAuthrequest()
    {
        return $this->container['authrequest'];
    }

    /**
     * Sets authrequest
     *
     * @param string $authrequest Authorisation Request URL
     *
     * @return self
     */
    public function setAuthrequest($authrequest)
    {
        if (is_null($authrequest)) {
            throw new \InvalidArgumentException('non-nullable authrequest cannot be null');
        }
        $this->container['authrequest'] = $authrequest;

        return $this;
    }

    /**
     * Gets course
     *
     * @return string|null
     */
    public function getCourse()
    {
        return $this->container['course'];
    }

    /**
     * Sets course
     *
     * @param string|null $course Tool type edit URL
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
     * Gets edit
     *
     * @return string
     */
    public function getEdit()
    {
        return $this->container['edit'];
    }

    /**
     * Sets edit
     *
     * @param string $edit Tool type edit URL
     *
     * @return self
     */
    public function setEdit($edit)
    {
        if (is_null($edit)) {
            throw new \InvalidArgumentException('non-nullable edit cannot be null');
        }
        $this->container['edit'] = $edit;

        return $this;
    }

    /**
     * Gets icon
     *
     * @return string
     */
    public function getIcon()
    {
        return $this->container['icon'];
    }

    /**
     * Sets icon
     *
     * @param string $icon Tool type icon URL
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
     * Gets publickeyset
     *
     * @return string
     */
    public function getPublickeyset()
    {
        return $this->container['publickeyset'];
    }

    /**
     * Sets publickeyset
     *
     * @param string $publickeyset Public Keyset URL
     *
     * @return self
     */
    public function setPublickeyset($publickeyset)
    {
        if (is_null($publickeyset)) {
            throw new \InvalidArgumentException('non-nullable publickeyset cannot be null');
        }
        $this->container['publickeyset'] = $publickeyset;

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

