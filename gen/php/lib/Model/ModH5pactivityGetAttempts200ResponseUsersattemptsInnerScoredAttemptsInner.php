<?php
/**
 * ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
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
 * ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_h5pactivity_get_attempts_200_response_usersattempts_inner_scored_attempts_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'attempt' => 'int',
        'completion' => 'int',
        'duration' => 'int',
        'h5pactivityid' => 'int',
        'id' => 'int',
        'maxscore' => 'int',
        'rawscore' => 'int',
        'scaled' => 'float',
        'success' => 'int',
        'timecreated' => 'int',
        'timemodified' => 'int',
        'userid' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'attempt' => null,
        'completion' => null,
        'duration' => null,
        'h5pactivityid' => null,
        'id' => null,
        'maxscore' => null,
        'rawscore' => null,
        'scaled' => null,
        'success' => null,
        'timecreated' => null,
        'timemodified' => null,
        'userid' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'attempt' => false,
        'completion' => false,
        'duration' => false,
        'h5pactivityid' => false,
        'id' => false,
        'maxscore' => false,
        'rawscore' => false,
        'scaled' => false,
        'success' => false,
        'timecreated' => false,
        'timemodified' => false,
        'userid' => false
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
        'attempt' => 'attempt',
        'completion' => 'completion',
        'duration' => 'duration',
        'h5pactivityid' => 'h5pactivityid',
        'id' => 'id',
        'maxscore' => 'maxscore',
        'rawscore' => 'rawscore',
        'scaled' => 'scaled',
        'success' => 'success',
        'timecreated' => 'timecreated',
        'timemodified' => 'timemodified',
        'userid' => 'userid'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'attempt' => 'setAttempt',
        'completion' => 'setCompletion',
        'duration' => 'setDuration',
        'h5pactivityid' => 'setH5pactivityid',
        'id' => 'setId',
        'maxscore' => 'setMaxscore',
        'rawscore' => 'setRawscore',
        'scaled' => 'setScaled',
        'success' => 'setSuccess',
        'timecreated' => 'setTimecreated',
        'timemodified' => 'setTimemodified',
        'userid' => 'setUserid'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'attempt' => 'getAttempt',
        'completion' => 'getCompletion',
        'duration' => 'getDuration',
        'h5pactivityid' => 'getH5pactivityid',
        'id' => 'getId',
        'maxscore' => 'getMaxscore',
        'rawscore' => 'getRawscore',
        'scaled' => 'getScaled',
        'success' => 'getSuccess',
        'timecreated' => 'getTimecreated',
        'timemodified' => 'getTimemodified',
        'userid' => 'getUserid'
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
        $this->setIfExists('attempt', $data ?? [], null);
        $this->setIfExists('completion', $data ?? [], null);
        $this->setIfExists('duration', $data ?? [], null);
        $this->setIfExists('h5pactivityid', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('maxscore', $data ?? [], null);
        $this->setIfExists('rawscore', $data ?? [], null);
        $this->setIfExists('scaled', $data ?? [], null);
        $this->setIfExists('success', $data ?? [], null);
        $this->setIfExists('timecreated', $data ?? [], null);
        $this->setIfExists('timemodified', $data ?? [], null);
        $this->setIfExists('userid', $data ?? [], null);
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
     * Gets attempt
     *
     * @return int|null
     */
    public function getAttempt()
    {
        return $this->container['attempt'];
    }

    /**
     * Sets attempt
     *
     * @param int|null $attempt Attempt number
     *
     * @return self
     */
    public function setAttempt($attempt)
    {
        if (is_null($attempt)) {
            throw new \InvalidArgumentException('non-nullable attempt cannot be null');
        }
        $this->container['attempt'] = $attempt;

        return $this;
    }

    /**
     * Gets completion
     *
     * @return int|null
     */
    public function getCompletion()
    {
        return $this->container['completion'];
    }

    /**
     * Sets completion
     *
     * @param int|null $completion Attempt completion
     *
     * @return self
     */
    public function setCompletion($completion)
    {
        if (is_null($completion)) {
            throw new \InvalidArgumentException('non-nullable completion cannot be null');
        }
        $this->container['completion'] = $completion;

        return $this;
    }

    /**
     * Gets duration
     *
     * @return int|null
     */
    public function getDuration()
    {
        return $this->container['duration'];
    }

    /**
     * Sets duration
     *
     * @param int|null $duration Attempt duration in seconds
     *
     * @return self
     */
    public function setDuration($duration)
    {
        if (is_null($duration)) {
            throw new \InvalidArgumentException('non-nullable duration cannot be null');
        }
        $this->container['duration'] = $duration;

        return $this;
    }

    /**
     * Gets h5pactivityid
     *
     * @return int|null
     */
    public function getH5pactivityid()
    {
        return $this->container['h5pactivityid'];
    }

    /**
     * Sets h5pactivityid
     *
     * @param int|null $h5pactivityid ID of the H5P activity
     *
     * @return self
     */
    public function setH5pactivityid($h5pactivityid)
    {
        if (is_null($h5pactivityid)) {
            throw new \InvalidArgumentException('non-nullable h5pactivityid cannot be null');
        }
        $this->container['h5pactivityid'] = $h5pactivityid;

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
     * @param int|null $id ID of the context
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
     * Gets maxscore
     *
     * @return int|null
     */
    public function getMaxscore()
    {
        return $this->container['maxscore'];
    }

    /**
     * Sets maxscore
     *
     * @param int|null $maxscore Attempt max score
     *
     * @return self
     */
    public function setMaxscore($maxscore)
    {
        if (is_null($maxscore)) {
            throw new \InvalidArgumentException('non-nullable maxscore cannot be null');
        }
        $this->container['maxscore'] = $maxscore;

        return $this;
    }

    /**
     * Gets rawscore
     *
     * @return int|null
     */
    public function getRawscore()
    {
        return $this->container['rawscore'];
    }

    /**
     * Sets rawscore
     *
     * @param int|null $rawscore Attempt score value
     *
     * @return self
     */
    public function setRawscore($rawscore)
    {
        if (is_null($rawscore)) {
            throw new \InvalidArgumentException('non-nullable rawscore cannot be null');
        }
        $this->container['rawscore'] = $rawscore;

        return $this;
    }

    /**
     * Gets scaled
     *
     * @return float|null
     */
    public function getScaled()
    {
        return $this->container['scaled'];
    }

    /**
     * Sets scaled
     *
     * @param float|null $scaled Attempt scaled
     *
     * @return self
     */
    public function setScaled($scaled)
    {
        if (is_null($scaled)) {
            throw new \InvalidArgumentException('non-nullable scaled cannot be null');
        }
        $this->container['scaled'] = $scaled;

        return $this;
    }

    /**
     * Gets success
     *
     * @return int|null
     */
    public function getSuccess()
    {
        return $this->container['success'];
    }

    /**
     * Sets success
     *
     * @param int|null $success Attempt success
     *
     * @return self
     */
    public function setSuccess($success)
    {
        if (is_null($success)) {
            throw new \InvalidArgumentException('non-nullable success cannot be null');
        }
        $this->container['success'] = $success;

        return $this;
    }

    /**
     * Gets timecreated
     *
     * @return int|null
     */
    public function getTimecreated()
    {
        return $this->container['timecreated'];
    }

    /**
     * Sets timecreated
     *
     * @param int|null $timecreated Attempt creation
     *
     * @return self
     */
    public function setTimecreated($timecreated)
    {
        if (is_null($timecreated)) {
            throw new \InvalidArgumentException('non-nullable timecreated cannot be null');
        }
        $this->container['timecreated'] = $timecreated;

        return $this;
    }

    /**
     * Gets timemodified
     *
     * @return int|null
     */
    public function getTimemodified()
    {
        return $this->container['timemodified'];
    }

    /**
     * Sets timemodified
     *
     * @param int|null $timemodified Attempt modified
     *
     * @return self
     */
    public function setTimemodified($timemodified)
    {
        if (is_null($timemodified)) {
            throw new \InvalidArgumentException('non-nullable timemodified cannot be null');
        }
        $this->container['timemodified'] = $timemodified;

        return $this;
    }

    /**
     * Gets userid
     *
     * @return int|null
     */
    public function getUserid()
    {
        return $this->container['userid'];
    }

    /**
     * Sets userid
     *
     * @param int|null $userid ID of the user
     *
     * @return self
     */
    public function setUserid($userid)
    {
        if (is_null($userid)) {
            throw new \InvalidArgumentException('non-nullable userid cannot be null');
        }
        $this->container['userid'] = $userid;

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

