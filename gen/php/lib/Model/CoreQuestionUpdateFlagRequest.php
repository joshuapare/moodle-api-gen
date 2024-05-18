<?php
/**
 * CoreQuestionUpdateFlagRequest
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
 * CoreQuestionUpdateFlagRequest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreQuestionUpdateFlagRequest implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_question_update_flag_request';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'checksum' => 'string',
        'newstate' => 'bool',
        'qaid' => 'int',
        'qubaid' => 'int',
        'questionid' => 'int',
        'slot' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'checksum' => null,
        'newstate' => null,
        'qaid' => null,
        'qubaid' => null,
        'questionid' => null,
        'slot' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'checksum' => false,
        'newstate' => false,
        'qaid' => false,
        'qubaid' => false,
        'questionid' => false,
        'slot' => false
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
        'checksum' => 'checksum',
        'newstate' => 'newstate',
        'qaid' => 'qaid',
        'qubaid' => 'qubaid',
        'questionid' => 'questionid',
        'slot' => 'slot'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'checksum' => 'setChecksum',
        'newstate' => 'setNewstate',
        'qaid' => 'setQaid',
        'qubaid' => 'setQubaid',
        'questionid' => 'setQuestionid',
        'slot' => 'setSlot'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'checksum' => 'getChecksum',
        'newstate' => 'getNewstate',
        'qaid' => 'getQaid',
        'qubaid' => 'getQubaid',
        'questionid' => 'getQuestionid',
        'slot' => 'getSlot'
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
        $this->setIfExists('checksum', $data ?? [], 'null');
        $this->setIfExists('newstate', $data ?? [], null);
        $this->setIfExists('qaid', $data ?? [], null);
        $this->setIfExists('qubaid', $data ?? [], null);
        $this->setIfExists('questionid', $data ?? [], null);
        $this->setIfExists('slot', $data ?? [], null);
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

        if ($this->container['checksum'] === null) {
            $invalidProperties[] = "'checksum' can't be null";
        }
        if ($this->container['newstate'] === null) {
            $invalidProperties[] = "'newstate' can't be null";
        }
        if ($this->container['qaid'] === null) {
            $invalidProperties[] = "'qaid' can't be null";
        }
        if ($this->container['qubaid'] === null) {
            $invalidProperties[] = "'qubaid' can't be null";
        }
        if ($this->container['questionid'] === null) {
            $invalidProperties[] = "'questionid' can't be null";
        }
        if ($this->container['slot'] === null) {
            $invalidProperties[] = "'slot' can't be null";
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
     * Gets checksum
     *
     * @return string
     */
    public function getChecksum()
    {
        return $this->container['checksum'];
    }

    /**
     * Sets checksum
     *
     * @param string $checksum computed checksum with the last three arguments and                              the users username
     *
     * @return self
     */
    public function setChecksum($checksum)
    {
        if (is_null($checksum)) {
            throw new \InvalidArgumentException('non-nullable checksum cannot be null');
        }
        $this->container['checksum'] = $checksum;

        return $this;
    }

    /**
     * Gets newstate
     *
     * @return bool
     */
    public function getNewstate()
    {
        return $this->container['newstate'];
    }

    /**
     * Sets newstate
     *
     * @param bool $newstate the new state of the flag. true = flagged
     *
     * @return self
     */
    public function setNewstate($newstate)
    {
        if (is_null($newstate)) {
            throw new \InvalidArgumentException('non-nullable newstate cannot be null');
        }
        $this->container['newstate'] = $newstate;

        return $this;
    }

    /**
     * Gets qaid
     *
     * @return int
     */
    public function getQaid()
    {
        return $this->container['qaid'];
    }

    /**
     * Sets qaid
     *
     * @param int $qaid the question_attempt id
     *
     * @return self
     */
    public function setQaid($qaid)
    {
        if (is_null($qaid)) {
            throw new \InvalidArgumentException('non-nullable qaid cannot be null');
        }
        $this->container['qaid'] = $qaid;

        return $this;
    }

    /**
     * Gets qubaid
     *
     * @return int
     */
    public function getQubaid()
    {
        return $this->container['qubaid'];
    }

    /**
     * Sets qubaid
     *
     * @param int $qubaid the question usage id.
     *
     * @return self
     */
    public function setQubaid($qubaid)
    {
        if (is_null($qubaid)) {
            throw new \InvalidArgumentException('non-nullable qubaid cannot be null');
        }
        $this->container['qubaid'] = $qubaid;

        return $this;
    }

    /**
     * Gets questionid
     *
     * @return int
     */
    public function getQuestionid()
    {
        return $this->container['questionid'];
    }

    /**
     * Sets questionid
     *
     * @param int $questionid the question id
     *
     * @return self
     */
    public function setQuestionid($questionid)
    {
        if (is_null($questionid)) {
            throw new \InvalidArgumentException('non-nullable questionid cannot be null');
        }
        $this->container['questionid'] = $questionid;

        return $this;
    }

    /**
     * Gets slot
     *
     * @return int
     */
    public function getSlot()
    {
        return $this->container['slot'];
    }

    /**
     * Sets slot
     *
     * @param int $slot the slot number within the usage
     *
     * @return self
     */
    public function setSlot($slot)
    {
        if (is_null($slot)) {
            throw new \InvalidArgumentException('non-nullable slot cannot be null');
        }
        $this->container['slot'] = $slot;

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

