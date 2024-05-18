<?php
/**
 * ModForumSetPinState200ResponseCapabilities
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
 * ModForumSetPinState200ResponseCapabilities Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModForumSetPinState200ResponseCapabilities implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_forum_set_pin_state_200_response_capabilities';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'favourite' => 'bool',
        'manage' => 'bool',
        'move' => 'bool',
        'pin' => 'bool',
        'post' => 'bool',
        'subscribe' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'favourite' => null,
        'manage' => null,
        'move' => null,
        'pin' => null,
        'post' => null,
        'subscribe' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'favourite' => false,
        'manage' => false,
        'move' => false,
        'pin' => false,
        'post' => false,
        'subscribe' => false
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
        'favourite' => 'favourite',
        'manage' => 'manage',
        'move' => 'move',
        'pin' => 'pin',
        'post' => 'post',
        'subscribe' => 'subscribe'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'favourite' => 'setFavourite',
        'manage' => 'setManage',
        'move' => 'setMove',
        'pin' => 'setPin',
        'post' => 'setPost',
        'subscribe' => 'setSubscribe'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'favourite' => 'getFavourite',
        'manage' => 'getManage',
        'move' => 'getMove',
        'pin' => 'getPin',
        'post' => 'getPost',
        'subscribe' => 'getSubscribe'
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
        $this->setIfExists('favourite', $data ?? [], null);
        $this->setIfExists('manage', $data ?? [], null);
        $this->setIfExists('move', $data ?? [], null);
        $this->setIfExists('pin', $data ?? [], null);
        $this->setIfExists('post', $data ?? [], null);
        $this->setIfExists('subscribe', $data ?? [], null);
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

        if ($this->container['favourite'] === null) {
            $invalidProperties[] = "'favourite' can't be null";
        }
        if ($this->container['manage'] === null) {
            $invalidProperties[] = "'manage' can't be null";
        }
        if ($this->container['move'] === null) {
            $invalidProperties[] = "'move' can't be null";
        }
        if ($this->container['pin'] === null) {
            $invalidProperties[] = "'pin' can't be null";
        }
        if ($this->container['post'] === null) {
            $invalidProperties[] = "'post' can't be null";
        }
        if ($this->container['subscribe'] === null) {
            $invalidProperties[] = "'subscribe' can't be null";
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
     * Gets favourite
     *
     * @return bool
     */
    public function getFavourite()
    {
        return $this->container['favourite'];
    }

    /**
     * Sets favourite
     *
     * @param bool $favourite favourite
     *
     * @return self
     */
    public function setFavourite($favourite)
    {
        if (is_null($favourite)) {
            throw new \InvalidArgumentException('non-nullable favourite cannot be null');
        }
        $this->container['favourite'] = $favourite;

        return $this;
    }

    /**
     * Gets manage
     *
     * @return bool
     */
    public function getManage()
    {
        return $this->container['manage'];
    }

    /**
     * Sets manage
     *
     * @param bool $manage manage
     *
     * @return self
     */
    public function setManage($manage)
    {
        if (is_null($manage)) {
            throw new \InvalidArgumentException('non-nullable manage cannot be null');
        }
        $this->container['manage'] = $manage;

        return $this;
    }

    /**
     * Gets move
     *
     * @return bool
     */
    public function getMove()
    {
        return $this->container['move'];
    }

    /**
     * Sets move
     *
     * @param bool $move move
     *
     * @return self
     */
    public function setMove($move)
    {
        if (is_null($move)) {
            throw new \InvalidArgumentException('non-nullable move cannot be null');
        }
        $this->container['move'] = $move;

        return $this;
    }

    /**
     * Gets pin
     *
     * @return bool
     */
    public function getPin()
    {
        return $this->container['pin'];
    }

    /**
     * Sets pin
     *
     * @param bool $pin pin
     *
     * @return self
     */
    public function setPin($pin)
    {
        if (is_null($pin)) {
            throw new \InvalidArgumentException('non-nullable pin cannot be null');
        }
        $this->container['pin'] = $pin;

        return $this;
    }

    /**
     * Gets post
     *
     * @return bool
     */
    public function getPost()
    {
        return $this->container['post'];
    }

    /**
     * Sets post
     *
     * @param bool $post post
     *
     * @return self
     */
    public function setPost($post)
    {
        if (is_null($post)) {
            throw new \InvalidArgumentException('non-nullable post cannot be null');
        }
        $this->container['post'] = $post;

        return $this;
    }

    /**
     * Gets subscribe
     *
     * @return bool
     */
    public function getSubscribe()
    {
        return $this->container['subscribe'];
    }

    /**
     * Sets subscribe
     *
     * @param bool $subscribe subscribe
     *
     * @return self
     */
    public function setSubscribe($subscribe)
    {
        if (is_null($subscribe)) {
            throw new \InvalidArgumentException('non-nullable subscribe cannot be null');
        }
        $this->container['subscribe'] = $subscribe;

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

