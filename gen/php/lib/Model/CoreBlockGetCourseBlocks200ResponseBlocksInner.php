<?php
/**
 * CoreBlockGetCourseBlocks200ResponseBlocksInner
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
 * CoreBlockGetCourseBlocks200ResponseBlocksInner Class Doc Comment
 *
 * @category Class
 * @description Block information.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreBlockGetCourseBlocks200ResponseBlocksInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_block_get_course_blocks_200_response_blocks_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'collapsible' => 'bool',
        'configs' => '\OpenAPI\Client\Model\CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner[]',
        'contents' => '\OpenAPI\Client\Model\CoreBlockGetCourseBlocks200ResponseBlocksInnerContents',
        'dockable' => 'bool',
        'instanceid' => 'int',
        'name' => 'string',
        'positionid' => 'int',
        'region' => 'string',
        'visible' => 'bool',
        'weight' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'collapsible' => null,
        'configs' => null,
        'contents' => null,
        'dockable' => null,
        'instanceid' => null,
        'name' => null,
        'positionid' => null,
        'region' => null,
        'visible' => null,
        'weight' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'collapsible' => false,
        'configs' => false,
        'contents' => false,
        'dockable' => false,
        'instanceid' => false,
        'name' => false,
        'positionid' => false,
        'region' => false,
        'visible' => false,
        'weight' => false
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
        'collapsible' => 'collapsible',
        'configs' => 'configs',
        'contents' => 'contents',
        'dockable' => 'dockable',
        'instanceid' => 'instanceid',
        'name' => 'name',
        'positionid' => 'positionid',
        'region' => 'region',
        'visible' => 'visible',
        'weight' => 'weight'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'collapsible' => 'setCollapsible',
        'configs' => 'setConfigs',
        'contents' => 'setContents',
        'dockable' => 'setDockable',
        'instanceid' => 'setInstanceid',
        'name' => 'setName',
        'positionid' => 'setPositionid',
        'region' => 'setRegion',
        'visible' => 'setVisible',
        'weight' => 'setWeight'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'collapsible' => 'getCollapsible',
        'configs' => 'getConfigs',
        'contents' => 'getContents',
        'dockable' => 'getDockable',
        'instanceid' => 'getInstanceid',
        'name' => 'getName',
        'positionid' => 'getPositionid',
        'region' => 'getRegion',
        'visible' => 'getVisible',
        'weight' => 'getWeight'
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
        $this->setIfExists('collapsible', $data ?? [], null);
        $this->setIfExists('configs', $data ?? [], null);
        $this->setIfExists('contents', $data ?? [], null);
        $this->setIfExists('dockable', $data ?? [], null);
        $this->setIfExists('instanceid', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], 'null');
        $this->setIfExists('positionid', $data ?? [], null);
        $this->setIfExists('region', $data ?? [], 'null');
        $this->setIfExists('visible', $data ?? [], null);
        $this->setIfExists('weight', $data ?? [], null);
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
     * Gets collapsible
     *
     * @return bool|null
     */
    public function getCollapsible()
    {
        return $this->container['collapsible'];
    }

    /**
     * Sets collapsible
     *
     * @param bool|null $collapsible Whether the block is collapsible.
     *
     * @return self
     */
    public function setCollapsible($collapsible)
    {
        if (is_null($collapsible)) {
            throw new \InvalidArgumentException('non-nullable collapsible cannot be null');
        }
        $this->container['collapsible'] = $collapsible;

        return $this;
    }

    /**
     * Gets configs
     *
     * @return \OpenAPI\Client\Model\CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner[]|null
     */
    public function getConfigs()
    {
        return $this->container['configs'];
    }

    /**
     * Sets configs
     *
     * @param \OpenAPI\Client\Model\CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner[]|null $configs configs
     *
     * @return self
     */
    public function setConfigs($configs)
    {
        if (is_null($configs)) {
            throw new \InvalidArgumentException('non-nullable configs cannot be null');
        }
        $this->container['configs'] = $configs;

        return $this;
    }

    /**
     * Gets contents
     *
     * @return \OpenAPI\Client\Model\CoreBlockGetCourseBlocks200ResponseBlocksInnerContents|null
     */
    public function getContents()
    {
        return $this->container['contents'];
    }

    /**
     * Sets contents
     *
     * @param \OpenAPI\Client\Model\CoreBlockGetCourseBlocks200ResponseBlocksInnerContents|null $contents contents
     *
     * @return self
     */
    public function setContents($contents)
    {
        if (is_null($contents)) {
            throw new \InvalidArgumentException('non-nullable contents cannot be null');
        }
        $this->container['contents'] = $contents;

        return $this;
    }

    /**
     * Gets dockable
     *
     * @return bool|null
     */
    public function getDockable()
    {
        return $this->container['dockable'];
    }

    /**
     * Sets dockable
     *
     * @param bool|null $dockable Whether the block is dockable.
     *
     * @return self
     */
    public function setDockable($dockable)
    {
        if (is_null($dockable)) {
            throw new \InvalidArgumentException('non-nullable dockable cannot be null');
        }
        $this->container['dockable'] = $dockable;

        return $this;
    }

    /**
     * Gets instanceid
     *
     * @return int|null
     */
    public function getInstanceid()
    {
        return $this->container['instanceid'];
    }

    /**
     * Sets instanceid
     *
     * @param int|null $instanceid Block instance id.
     *
     * @return self
     */
    public function setInstanceid($instanceid)
    {
        if (is_null($instanceid)) {
            throw new \InvalidArgumentException('non-nullable instanceid cannot be null');
        }
        $this->container['instanceid'] = $instanceid;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string|null $name Block name.
     *
     * @return self
     */
    public function setName($name)
    {
        if (is_null($name)) {
            throw new \InvalidArgumentException('non-nullable name cannot be null');
        }
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets positionid
     *
     * @return int|null
     */
    public function getPositionid()
    {
        return $this->container['positionid'];
    }

    /**
     * Sets positionid
     *
     * @param int|null $positionid Position id.
     *
     * @return self
     */
    public function setPositionid($positionid)
    {
        if (is_null($positionid)) {
            throw new \InvalidArgumentException('non-nullable positionid cannot be null');
        }
        $this->container['positionid'] = $positionid;

        return $this;
    }

    /**
     * Gets region
     *
     * @return string|null
     */
    public function getRegion()
    {
        return $this->container['region'];
    }

    /**
     * Sets region
     *
     * @param string|null $region Block region.
     *
     * @return self
     */
    public function setRegion($region)
    {
        if (is_null($region)) {
            throw new \InvalidArgumentException('non-nullable region cannot be null');
        }
        $this->container['region'] = $region;

        return $this;
    }

    /**
     * Gets visible
     *
     * @return bool|null
     */
    public function getVisible()
    {
        return $this->container['visible'];
    }

    /**
     * Sets visible
     *
     * @param bool|null $visible Whether the block is visible.
     *
     * @return self
     */
    public function setVisible($visible)
    {
        if (is_null($visible)) {
            throw new \InvalidArgumentException('non-nullable visible cannot be null');
        }
        $this->container['visible'] = $visible;

        return $this;
    }

    /**
     * Gets weight
     *
     * @return int|null
     */
    public function getWeight()
    {
        return $this->container['weight'];
    }

    /**
     * Sets weight
     *
     * @param int|null $weight Used to order blocks within a region.
     *
     * @return self
     */
    public function setWeight($weight)
    {
        if (is_null($weight)) {
            throw new \InvalidArgumentException('non-nullable weight cannot be null');
        }
        $this->container['weight'] = $weight;

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


