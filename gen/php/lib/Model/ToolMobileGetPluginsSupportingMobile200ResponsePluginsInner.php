<?php
/**
 * ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner
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
 * ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'tool_mobile_get_plugins_supporting_mobile_200_response_plugins_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'addon' => 'string',
        'component' => 'string',
        'dependencies' => 'object[]',
        'filehash' => 'string',
        'filesize' => 'int',
        'fileurl' => 'string',
        'handlers' => 'string',
        'lang' => 'string',
        'version' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'addon' => null,
        'component' => null,
        'dependencies' => null,
        'filehash' => null,
        'filesize' => null,
        'fileurl' => null,
        'handlers' => null,
        'lang' => null,
        'version' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'addon' => false,
        'component' => false,
        'dependencies' => false,
        'filehash' => false,
        'filesize' => false,
        'fileurl' => false,
        'handlers' => false,
        'lang' => false,
        'version' => false
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
        'addon' => 'addon',
        'component' => 'component',
        'dependencies' => 'dependencies',
        'filehash' => 'filehash',
        'filesize' => 'filesize',
        'fileurl' => 'fileurl',
        'handlers' => 'handlers',
        'lang' => 'lang',
        'version' => 'version'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'addon' => 'setAddon',
        'component' => 'setComponent',
        'dependencies' => 'setDependencies',
        'filehash' => 'setFilehash',
        'filesize' => 'setFilesize',
        'fileurl' => 'setFileurl',
        'handlers' => 'setHandlers',
        'lang' => 'setLang',
        'version' => 'setVersion'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'addon' => 'getAddon',
        'component' => 'getComponent',
        'dependencies' => 'getDependencies',
        'filehash' => 'getFilehash',
        'filesize' => 'getFilesize',
        'fileurl' => 'getFileurl',
        'handlers' => 'getHandlers',
        'lang' => 'getLang',
        'version' => 'getVersion'
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
        $this->setIfExists('addon', $data ?? [], 'null');
        $this->setIfExists('component', $data ?? [], 'null');
        $this->setIfExists('dependencies', $data ?? [], null);
        $this->setIfExists('filehash', $data ?? [], 'null');
        $this->setIfExists('filesize', $data ?? [], null);
        $this->setIfExists('fileurl', $data ?? [], 'null');
        $this->setIfExists('handlers', $data ?? [], 'null');
        $this->setIfExists('lang', $data ?? [], 'null');
        $this->setIfExists('version', $data ?? [], 'null');
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
     * Gets addon
     *
     * @return string|null
     */
    public function getAddon()
    {
        return $this->container['addon'];
    }

    /**
     * Sets addon
     *
     * @param string|null $addon The Mobile addon (package) name.
     *
     * @return self
     */
    public function setAddon($addon)
    {
        if (is_null($addon)) {
            throw new \InvalidArgumentException('non-nullable addon cannot be null');
        }
        $this->container['addon'] = $addon;

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
     * @param string|null $component The plugin component name.
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
     * Gets dependencies
     *
     * @return object[]|null
     */
    public function getDependencies()
    {
        return $this->container['dependencies'];
    }

    /**
     * Sets dependencies
     *
     * @param object[]|null $dependencies dependencies
     *
     * @return self
     */
    public function setDependencies($dependencies)
    {
        if (is_null($dependencies)) {
            throw new \InvalidArgumentException('non-nullable dependencies cannot be null');
        }
        $this->container['dependencies'] = $dependencies;

        return $this;
    }

    /**
     * Gets filehash
     *
     * @return string|null
     */
    public function getFilehash()
    {
        return $this->container['filehash'];
    }

    /**
     * Sets filehash
     *
     * @param string|null $filehash The addon package hash or empty if it doesn't exist.
     *
     * @return self
     */
    public function setFilehash($filehash)
    {
        if (is_null($filehash)) {
            throw new \InvalidArgumentException('non-nullable filehash cannot be null');
        }
        $this->container['filehash'] = $filehash;

        return $this;
    }

    /**
     * Gets filesize
     *
     * @return int|null
     */
    public function getFilesize()
    {
        return $this->container['filesize'];
    }

    /**
     * Sets filesize
     *
     * @param int|null $filesize The addon package size or empty if it doesn't exist.
     *
     * @return self
     */
    public function setFilesize($filesize)
    {
        if (is_null($filesize)) {
            throw new \InvalidArgumentException('non-nullable filesize cannot be null');
        }
        $this->container['filesize'] = $filesize;

        return $this;
    }

    /**
     * Gets fileurl
     *
     * @return string|null
     */
    public function getFileurl()
    {
        return $this->container['fileurl'];
    }

    /**
     * Sets fileurl
     *
     * @param string|null $fileurl The addon package url for download                                                             or empty if it doesn't exist.
     *
     * @return self
     */
    public function setFileurl($fileurl)
    {
        if (is_null($fileurl)) {
            throw new \InvalidArgumentException('non-nullable fileurl cannot be null');
        }
        $this->container['fileurl'] = $fileurl;

        return $this;
    }

    /**
     * Gets handlers
     *
     * @return string|null
     */
    public function getHandlers()
    {
        return $this->container['handlers'];
    }

    /**
     * Sets handlers
     *
     * @param string|null $handlers Handlers definition (JSON)
     *
     * @return self
     */
    public function setHandlers($handlers)
    {
        if (is_null($handlers)) {
            throw new \InvalidArgumentException('non-nullable handlers cannot be null');
        }
        $this->container['handlers'] = $handlers;

        return $this;
    }

    /**
     * Gets lang
     *
     * @return string|null
     */
    public function getLang()
    {
        return $this->container['lang'];
    }

    /**
     * Sets lang
     *
     * @param string|null $lang Language strings used by the handlers (JSON)
     *
     * @return self
     */
    public function setLang($lang)
    {
        if (is_null($lang)) {
            throw new \InvalidArgumentException('non-nullable lang cannot be null');
        }
        $this->container['lang'] = $lang;

        return $this;
    }

    /**
     * Gets version
     *
     * @return string|null
     */
    public function getVersion()
    {
        return $this->container['version'];
    }

    /**
     * Sets version
     *
     * @param string|null $version The plugin version number.
     *
     * @return self
     */
    public function setVersion($version)
    {
        if (is_null($version)) {
            throw new \InvalidArgumentException('non-nullable version cannot be null');
        }
        $this->container['version'] = $version;

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


