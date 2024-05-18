<?php
/**
 * CoreTagGetTagAreas200ResponseAreasInner
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
 * CoreTagGetTagAreas200ResponseAreasInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreTagGetTagAreas200ResponseAreasInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_tag_get_tag_areas_200_response_areas_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'callback' => 'string',
        'callbackfile' => 'string',
        'component' => 'string',
        'enabled' => 'bool',
        'id' => 'int',
        'itemtype' => 'string',
        'locked' => 'bool',
        'multiplecontexts' => 'bool',
        'showstandard' => 'int',
        'tagcollid' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'callback' => null,
        'callbackfile' => null,
        'component' => null,
        'enabled' => null,
        'id' => null,
        'itemtype' => null,
        'locked' => null,
        'multiplecontexts' => null,
        'showstandard' => null,
        'tagcollid' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'callback' => false,
        'callbackfile' => false,
        'component' => false,
        'enabled' => false,
        'id' => false,
        'itemtype' => false,
        'locked' => false,
        'multiplecontexts' => false,
        'showstandard' => false,
        'tagcollid' => false
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
        'callback' => 'callback',
        'callbackfile' => 'callbackfile',
        'component' => 'component',
        'enabled' => 'enabled',
        'id' => 'id',
        'itemtype' => 'itemtype',
        'locked' => 'locked',
        'multiplecontexts' => 'multiplecontexts',
        'showstandard' => 'showstandard',
        'tagcollid' => 'tagcollid'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'callback' => 'setCallback',
        'callbackfile' => 'setCallbackfile',
        'component' => 'setComponent',
        'enabled' => 'setEnabled',
        'id' => 'setId',
        'itemtype' => 'setItemtype',
        'locked' => 'setLocked',
        'multiplecontexts' => 'setMultiplecontexts',
        'showstandard' => 'setShowstandard',
        'tagcollid' => 'setTagcollid'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'callback' => 'getCallback',
        'callbackfile' => 'getCallbackfile',
        'component' => 'getComponent',
        'enabled' => 'getEnabled',
        'id' => 'getId',
        'itemtype' => 'getItemtype',
        'locked' => 'getLocked',
        'multiplecontexts' => 'getMultiplecontexts',
        'showstandard' => 'getShowstandard',
        'tagcollid' => 'getTagcollid'
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
        $this->setIfExists('callback', $data ?? [], 'null');
        $this->setIfExists('callbackfile', $data ?? [], 'null');
        $this->setIfExists('component', $data ?? [], 'null');
        $this->setIfExists('enabled', $data ?? [], true);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('itemtype', $data ?? [], 'null');
        $this->setIfExists('locked', $data ?? [], false);
        $this->setIfExists('multiplecontexts', $data ?? [], false);
        $this->setIfExists('showstandard', $data ?? [], 0);
        $this->setIfExists('tagcollid', $data ?? [], null);
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
     * Gets callback
     *
     * @return string|null
     */
    public function getCallback()
    {
        return $this->container['callback'];
    }

    /**
     * Sets callback
     *
     * @param string|null $callback Component callback for processing tags.
     *
     * @return self
     */
    public function setCallback($callback)
    {
        if (is_null($callback)) {
            throw new \InvalidArgumentException('non-nullable callback cannot be null');
        }
        $this->container['callback'] = $callback;

        return $this;
    }

    /**
     * Gets callbackfile
     *
     * @return string|null
     */
    public function getCallbackfile()
    {
        return $this->container['callbackfile'];
    }

    /**
     * Sets callbackfile
     *
     * @param string|null $callbackfile Component callback file.
     *
     * @return self
     */
    public function setCallbackfile($callbackfile)
    {
        if (is_null($callbackfile)) {
            throw new \InvalidArgumentException('non-nullable callbackfile cannot be null');
        }
        $this->container['callbackfile'] = $callbackfile;

        return $this;
    }

    /**
     * Gets component
     *
     * @return string|null
     */
    public function getComponent()
    {
        return $this->container['component'];
    }

    /**
     * Sets component
     *
     * @param string|null $component Component the area is related to.
     *
     * @return self
     */
    public function setComponent($component)
    {
        if (is_null($component)) {
            throw new \InvalidArgumentException('non-nullable component cannot be null');
        }
        $this->container['component'] = $component;

        return $this;
    }

    /**
     * Gets enabled
     *
     * @return bool|null
     */
    public function getEnabled()
    {
        return $this->container['enabled'];
    }

    /**
     * Sets enabled
     *
     * @param bool|null $enabled Whether this area is enabled.
     *
     * @return self
     */
    public function setEnabled($enabled)
    {
        if (is_null($enabled)) {
            throw new \InvalidArgumentException('non-nullable enabled cannot be null');
        }
        $this->container['enabled'] = $enabled;

        return $this;
    }

    /**
     * Gets id
     *
     * @return int|null
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int|null $id Area id.
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
     * Gets itemtype
     *
     * @return string|null
     */
    public function getItemtype()
    {
        return $this->container['itemtype'];
    }

    /**
     * Sets itemtype
     *
     * @param string|null $itemtype Type of item in the component.
     *
     * @return self
     */
    public function setItemtype($itemtype)
    {
        if (is_null($itemtype)) {
            throw new \InvalidArgumentException('non-nullable itemtype cannot be null');
        }
        $this->container['itemtype'] = $itemtype;

        return $this;
    }

    /**
     * Gets locked
     *
     * @return bool|null
     */
    public function getLocked()
    {
        return $this->container['locked'];
    }

    /**
     * Sets locked
     *
     * @param bool|null $locked Whether the area is locked.
     *
     * @return self
     */
    public function setLocked($locked)
    {
        if (is_null($locked)) {
            throw new \InvalidArgumentException('non-nullable locked cannot be null');
        }
        $this->container['locked'] = $locked;

        return $this;
    }

    /**
     * Gets multiplecontexts
     *
     * @return bool|null
     */
    public function getMultiplecontexts()
    {
        return $this->container['multiplecontexts'];
    }

    /**
     * Sets multiplecontexts
     *
     * @param bool|null $multiplecontexts Whether the tag area allows tag instances to be created in multiple contexts.
     *
     * @return self
     */
    public function setMultiplecontexts($multiplecontexts)
    {
        if (is_null($multiplecontexts)) {
            throw new \InvalidArgumentException('non-nullable multiplecontexts cannot be null');
        }
        $this->container['multiplecontexts'] = $multiplecontexts;

        return $this;
    }

    /**
     * Gets showstandard
     *
     * @return int|null
     */
    public function getShowstandard()
    {
        return $this->container['showstandard'];
    }

    /**
     * Sets showstandard
     *
     * @param int|null $showstandard Return whether to display only standard, only non-standard or both tags.
     *
     * @return self
     */
    public function setShowstandard($showstandard)
    {
        if (is_null($showstandard)) {
            throw new \InvalidArgumentException('non-nullable showstandard cannot be null');
        }
        $this->container['showstandard'] = $showstandard;

        return $this;
    }

    /**
     * Gets tagcollid
     *
     * @return int|null
     */
    public function getTagcollid()
    {
        return $this->container['tagcollid'];
    }

    /**
     * Sets tagcollid
     *
     * @param int|null $tagcollid The tag collection this are belongs to.
     *
     * @return self
     */
    public function setTagcollid($tagcollid)
    {
        if (is_null($tagcollid)) {
            throw new \InvalidArgumentException('non-nullable tagcollid cannot be null');
        }
        $this->container['tagcollid'] = $tagcollid;

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


