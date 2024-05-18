<?php
/**
 * CoreGradesGraderGradingpanelPointStoreRequest
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
 * CoreGradesGraderGradingpanelPointStoreRequest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreGradesGraderGradingpanelPointStoreRequest implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_grades_grader_gradingpanel_point_store_request';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'component' => 'string',
        'contextid' => 'int',
        'formdata' => 'string',
        'gradeduserid' => 'int',
        'itemname' => 'string',
        'notifyuser' => 'bool'
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
        'formdata' => null,
        'gradeduserid' => null,
        'itemname' => null,
        'notifyuser' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'component' => false,
        'contextid' => false,
        'formdata' => false,
        'gradeduserid' => false,
        'itemname' => false,
        'notifyuser' => false
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
        'formdata' => 'formdata',
        'gradeduserid' => 'gradeduserid',
        'itemname' => 'itemname',
        'notifyuser' => 'notifyuser'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'component' => 'setComponent',
        'contextid' => 'setContextid',
        'formdata' => 'setFormdata',
        'gradeduserid' => 'setGradeduserid',
        'itemname' => 'setItemname',
        'notifyuser' => 'setNotifyuser'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'component' => 'getComponent',
        'contextid' => 'getContextid',
        'formdata' => 'getFormdata',
        'gradeduserid' => 'getGradeduserid',
        'itemname' => 'getItemname',
        'notifyuser' => 'getNotifyuser'
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
        $this->setIfExists('formdata', $data ?? [], 'null');
        $this->setIfExists('gradeduserid', $data ?? [], null);
        $this->setIfExists('itemname', $data ?? [], null);
        $this->setIfExists('notifyuser', $data ?? [], false);
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
        if ($this->container['contextid'] === null) {
            $invalidProperties[] = "'contextid' can't be null";
        }
        if ($this->container['formdata'] === null) {
            $invalidProperties[] = "'formdata' can't be null";
        }
        if ($this->container['gradeduserid'] === null) {
            $invalidProperties[] = "'gradeduserid' can't be null";
        }
        if ($this->container['itemname'] === null) {
            $invalidProperties[] = "'itemname' can't be null";
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
     * @param string $component The name of the component
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
     * @return int
     */
    public function getContextid()
    {
        return $this->container['contextid'];
    }

    /**
     * Sets contextid
     *
     * @param int $contextid The ID of the context being graded
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
     * Gets formdata
     *
     * @return string
     */
    public function getFormdata()
    {
        return $this->container['formdata'];
    }

    /**
     * Sets formdata
     *
     * @param string $formdata The serialised form data representing the grade
     *
     * @return self
     */
    public function setFormdata($formdata)
    {
        if (is_null($formdata)) {
            throw new \InvalidArgumentException('non-nullable formdata cannot be null');
        }
        $this->container['formdata'] = $formdata;

        return $this;
    }

    /**
     * Gets gradeduserid
     *
     * @return int
     */
    public function getGradeduserid()
    {
        return $this->container['gradeduserid'];
    }

    /**
     * Sets gradeduserid
     *
     * @param int $gradeduserid The ID of the user show
     *
     * @return self
     */
    public function setGradeduserid($gradeduserid)
    {
        if (is_null($gradeduserid)) {
            throw new \InvalidArgumentException('non-nullable gradeduserid cannot be null');
        }
        $this->container['gradeduserid'] = $gradeduserid;

        return $this;
    }

    /**
     * Gets itemname
     *
     * @return string
     */
    public function getItemname()
    {
        return $this->container['itemname'];
    }

    /**
     * Sets itemname
     *
     * @param string $itemname The grade item itemname being graded
     *
     * @return self
     */
    public function setItemname($itemname)
    {
        if (is_null($itemname)) {
            throw new \InvalidArgumentException('non-nullable itemname cannot be null');
        }
        $this->container['itemname'] = $itemname;

        return $this;
    }

    /**
     * Gets notifyuser
     *
     * @return bool|null
     */
    public function getNotifyuser()
    {
        return $this->container['notifyuser'];
    }

    /**
     * Sets notifyuser
     *
     * @param bool|null $notifyuser Wheteher to notify the user or not
     *
     * @return self
     */
    public function setNotifyuser($notifyuser)
    {
        if (is_null($notifyuser)) {
            throw new \InvalidArgumentException('non-nullable notifyuser cannot be null');
        }
        $this->container['notifyuser'] = $notifyuser;

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


