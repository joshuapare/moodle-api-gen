<?php
/**
 * CoreFilesUploadRequest
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
 * CoreFilesUploadRequest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreFilesUploadRequest implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_files_upload_request';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'component' => 'string',
        'contextid' => 'int',
        'contextlevel' => 'string',
        'filearea' => 'string',
        'filecontent' => 'string',
        'filename' => 'string',
        'filepath' => 'string',
        'instanceid' => 'int',
        'itemid' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'component' => null,
        'contextid' => null,
        'contextlevel' => null,
        'filearea' => null,
        'filecontent' => null,
        'filename' => null,
        'filepath' => null,
        'instanceid' => null,
        'itemid' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'component' => false,
        'contextid' => false,
        'contextlevel' => false,
        'filearea' => false,
        'filecontent' => false,
        'filename' => false,
        'filepath' => false,
        'instanceid' => false,
        'itemid' => false
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
        'component' => 'component',
        'contextid' => 'contextid',
        'contextlevel' => 'contextlevel',
        'filearea' => 'filearea',
        'filecontent' => 'filecontent',
        'filename' => 'filename',
        'filepath' => 'filepath',
        'instanceid' => 'instanceid',
        'itemid' => 'itemid'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'component' => 'setComponent',
        'contextid' => 'setContextid',
        'contextlevel' => 'setContextlevel',
        'filearea' => 'setFilearea',
        'filecontent' => 'setFilecontent',
        'filename' => 'setFilename',
        'filepath' => 'setFilepath',
        'instanceid' => 'setInstanceid',
        'itemid' => 'setItemid'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'component' => 'getComponent',
        'contextid' => 'getContextid',
        'contextlevel' => 'getContextlevel',
        'filearea' => 'getFilearea',
        'filecontent' => 'getFilecontent',
        'filename' => 'getFilename',
        'filepath' => 'getFilepath',
        'instanceid' => 'getInstanceid',
        'itemid' => 'getItemid'
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
        $this->setIfExists('component', $data ?? [], null);
        $this->setIfExists('contextid', $data ?? [], null);
        $this->setIfExists('contextlevel', $data ?? [], 'null');
        $this->setIfExists('filearea', $data ?? [], null);
        $this->setIfExists('filecontent', $data ?? [], 'null');
        $this->setIfExists('filename', $data ?? [], null);
        $this->setIfExists('filepath', $data ?? [], null);
        $this->setIfExists('instanceid', $data ?? [], null);
        $this->setIfExists('itemid', $data ?? [], null);
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

        if ($this->container['component'] === null) {
            $invalidProperties[] = "'component' can't be null";
        }
        if ($this->container['filearea'] === null) {
            $invalidProperties[] = "'filearea' can't be null";
        }
        if ($this->container['filecontent'] === null) {
            $invalidProperties[] = "'filecontent' can't be null";
        }
        if ($this->container['filename'] === null) {
            $invalidProperties[] = "'filename' can't be null";
        }
        if ($this->container['filepath'] === null) {
            $invalidProperties[] = "'filepath' can't be null";
        }
        if ($this->container['itemid'] === null) {
            $invalidProperties[] = "'itemid' can't be null";
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
     * Gets component
     *
     * @return string
     */
    public function getComponent()
    {
        return $this->container['component'];
    }

    /**
     * Sets component
     *
     * @param string $component component
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
     * Gets contextlevel
     *
     * @return string|null
     */
    public function getContextlevel()
    {
        return $this->container['contextlevel'];
    }

    /**
     * Sets contextlevel
     *
     * @param string|null $contextlevel The context level to put the file in,                         (block, course, coursecat, system, user, module)
     *
     * @return self
     */
    public function setContextlevel($contextlevel)
    {
        if (is_null($contextlevel)) {
            throw new \InvalidArgumentException('non-nullable contextlevel cannot be null');
        }
        $this->container['contextlevel'] = $contextlevel;

        return $this;
    }

    /**
     * Gets filearea
     *
     * @return string
     */
    public function getFilearea()
    {
        return $this->container['filearea'];
    }

    /**
     * Sets filearea
     *
     * @param string $filearea file area
     *
     * @return self
     */
    public function setFilearea($filearea)
    {
        if (is_null($filearea)) {
            throw new \InvalidArgumentException('non-nullable filearea cannot be null');
        }
        $this->container['filearea'] = $filearea;

        return $this;
    }

    /**
     * Gets filecontent
     *
     * @return string
     */
    public function getFilecontent()
    {
        return $this->container['filecontent'];
    }

    /**
     * Sets filecontent
     *
     * @param string $filecontent file content
     *
     * @return self
     */
    public function setFilecontent($filecontent)
    {
        if (is_null($filecontent)) {
            throw new \InvalidArgumentException('non-nullable filecontent cannot be null');
        }
        $this->container['filecontent'] = $filecontent;

        return $this;
    }

    /**
     * Gets filename
     *
     * @return string
     */
    public function getFilename()
    {
        return $this->container['filename'];
    }

    /**
     * Sets filename
     *
     * @param string $filename file name
     *
     * @return self
     */
    public function setFilename($filename)
    {
        if (is_null($filename)) {
            throw new \InvalidArgumentException('non-nullable filename cannot be null');
        }
        $this->container['filename'] = $filename;

        return $this;
    }

    /**
     * Gets filepath
     *
     * @return string
     */
    public function getFilepath()
    {
        return $this->container['filepath'];
    }

    /**
     * Sets filepath
     *
     * @param string $filepath file path
     *
     * @return self
     */
    public function setFilepath($filepath)
    {
        if (is_null($filepath)) {
            throw new \InvalidArgumentException('non-nullable filepath cannot be null');
        }
        $this->container['filepath'] = $filepath;

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
     * @param int|null $instanceid The Instance id of item associated                          with the context level
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
     * Gets itemid
     *
     * @return int
     */
    public function getItemid()
    {
        return $this->container['itemid'];
    }

    /**
     * Sets itemid
     *
     * @param int $itemid associated id
     *
     * @return self
     */
    public function setItemid($itemid)
    {
        if (is_null($itemid)) {
            throw new \InvalidArgumentException('non-nullable itemid cannot be null');
        }
        $this->container['itemid'] = $itemid;

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


