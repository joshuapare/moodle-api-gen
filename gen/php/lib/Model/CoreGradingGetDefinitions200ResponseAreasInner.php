<?php
/**
 * CoreGradingGetDefinitions200ResponseAreasInner
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
 * CoreGradingGetDefinitions200ResponseAreasInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreGradingGetDefinitions200ResponseAreasInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_grading_get_definitions_200_response_areas_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'activemethod' => 'string',
        'areaname' => 'string',
        'cmid' => 'int',
        'component' => 'string',
        'contextid' => 'int',
        'definitions' => '\OpenAPI\Client\Model\CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'activemethod' => null,
        'areaname' => null,
        'cmid' => null,
        'component' => null,
        'contextid' => null,
        'definitions' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'activemethod' => false,
        'areaname' => false,
        'cmid' => false,
        'component' => false,
        'contextid' => false,
        'definitions' => false
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
        'activemethod' => 'activemethod',
        'areaname' => 'areaname',
        'cmid' => 'cmid',
        'component' => 'component',
        'contextid' => 'contextid',
        'definitions' => 'definitions'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'activemethod' => 'setActivemethod',
        'areaname' => 'setAreaname',
        'cmid' => 'setCmid',
        'component' => 'setComponent',
        'contextid' => 'setContextid',
        'definitions' => 'setDefinitions'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'activemethod' => 'getActivemethod',
        'areaname' => 'getAreaname',
        'cmid' => 'getCmid',
        'component' => 'getComponent',
        'contextid' => 'getContextid',
        'definitions' => 'getDefinitions'
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
        $this->setIfExists('activemethod', $data ?? [], 'null');
        $this->setIfExists('areaname', $data ?? [], null);
        $this->setIfExists('cmid', $data ?? [], null);
        $this->setIfExists('component', $data ?? [], 'null');
        $this->setIfExists('contextid', $data ?? [], null);
        $this->setIfExists('definitions', $data ?? [], null);
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
     * Gets activemethod
     *
     * @return string|null
     */
    public function getActivemethod()
    {
        return $this->container['activemethod'];
    }

    /**
     * Sets activemethod
     *
     * @param string|null $activemethod active method
     *
     * @return self
     */
    public function setActivemethod($activemethod)
    {
        if (is_null($activemethod)) {
            throw new \InvalidArgumentException('non-nullable activemethod cannot be null');
        }
        $this->container['activemethod'] = $activemethod;

        return $this;
    }

    /**
     * Gets areaname
     *
     * @return string|null
     */
    public function getAreaname()
    {
        return $this->container['areaname'];
    }

    /**
     * Sets areaname
     *
     * @param string|null $areaname area name
     *
     * @return self
     */
    public function setAreaname($areaname)
    {
        if (is_null($areaname)) {
            throw new \InvalidArgumentException('non-nullable areaname cannot be null');
        }
        $this->container['areaname'] = $areaname;

        return $this;
    }

    /**
     * Gets cmid
     *
     * @return int|null
     */
    public function getCmid()
    {
        return $this->container['cmid'];
    }

    /**
     * Sets cmid
     *
     * @param int|null $cmid course module id
     *
     * @return self
     */
    public function setCmid($cmid)
    {
        if (is_null($cmid)) {
            throw new \InvalidArgumentException('non-nullable cmid cannot be null');
        }
        $this->container['cmid'] = $cmid;

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
     * @param string|null $component component name
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
     * @param int|null $contextid context id
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
     * Gets definitions
     *
     * @return \OpenAPI\Client\Model\CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner[]|null
     */
    public function getDefinitions()
    {
        return $this->container['definitions'];
    }

    /**
     * Sets definitions
     *
     * @param \OpenAPI\Client\Model\CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner[]|null $definitions definitions
     *
     * @return self
     */
    public function setDefinitions($definitions)
    {
        if (is_null($definitions)) {
            throw new \InvalidArgumentException('non-nullable definitions cannot be null');
        }
        $this->container['definitions'] = $definitions;

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

