<?php
/**
 * ModAssignGetSubmissionStatus200ResponseFeedbackGrade
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
 * ModAssignGetSubmissionStatus200ResponseFeedbackGrade Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModAssignGetSubmissionStatus200ResponseFeedbackGrade implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_assign_get_submission_status_200_response_feedback_grade';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'assignment' => 'int',
        'attemptnumber' => 'int',
        'grade' => 'string',
        'gradefordisplay' => 'string',
        'grader' => 'int',
        'id' => 'int',
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
        'assignment' => null,
        'attemptnumber' => null,
        'grade' => null,
        'gradefordisplay' => null,
        'grader' => null,
        'id' => null,
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
        'assignment' => false,
        'attemptnumber' => false,
        'grade' => false,
        'gradefordisplay' => false,
        'grader' => false,
        'id' => false,
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
        'assignment' => 'assignment',
        'attemptnumber' => 'attemptnumber',
        'grade' => 'grade',
        'gradefordisplay' => 'gradefordisplay',
        'grader' => 'grader',
        'id' => 'id',
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
        'assignment' => 'setAssignment',
        'attemptnumber' => 'setAttemptnumber',
        'grade' => 'setGrade',
        'gradefordisplay' => 'setGradefordisplay',
        'grader' => 'setGrader',
        'id' => 'setId',
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
        'assignment' => 'getAssignment',
        'attemptnumber' => 'getAttemptnumber',
        'grade' => 'getGrade',
        'gradefordisplay' => 'getGradefordisplay',
        'grader' => 'getGrader',
        'id' => 'getId',
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
        $this->setIfExists('assignment', $data ?? [], null);
        $this->setIfExists('attemptnumber', $data ?? [], null);
        $this->setIfExists('grade', $data ?? [], null);
        $this->setIfExists('gradefordisplay', $data ?? [], null);
        $this->setIfExists('grader', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
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

        if ($this->container['attemptnumber'] === null) {
            $invalidProperties[] = "'attemptnumber' can't be null";
        }
        if ($this->container['grade'] === null) {
            $invalidProperties[] = "'grade' can't be null";
        }
        if ($this->container['grader'] === null) {
            $invalidProperties[] = "'grader' can't be null";
        }
        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['timecreated'] === null) {
            $invalidProperties[] = "'timecreated' can't be null";
        }
        if ($this->container['timemodified'] === null) {
            $invalidProperties[] = "'timemodified' can't be null";
        }
        if ($this->container['userid'] === null) {
            $invalidProperties[] = "'userid' can't be null";
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
     * Gets assignment
     *
     * @return int|null
     */
    public function getAssignment()
    {
        return $this->container['assignment'];
    }

    /**
     * Sets assignment
     *
     * @param int|null $assignment assignment id
     *
     * @return self
     */
    public function setAssignment($assignment)
    {
        if (is_null($assignment)) {
            throw new \InvalidArgumentException('non-nullable assignment cannot be null');
        }
        $this->container['assignment'] = $assignment;

        return $this;
    }

    /**
     * Gets attemptnumber
     *
     * @return int
     */
    public function getAttemptnumber()
    {
        return $this->container['attemptnumber'];
    }

    /**
     * Sets attemptnumber
     *
     * @param int $attemptnumber attempt number
     *
     * @return self
     */
    public function setAttemptnumber($attemptnumber)
    {
        if (is_null($attemptnumber)) {
            throw new \InvalidArgumentException('non-nullable attemptnumber cannot be null');
        }
        $this->container['attemptnumber'] = $attemptnumber;

        return $this;
    }

    /**
     * Gets grade
     *
     * @return string
     */
    public function getGrade()
    {
        return $this->container['grade'];
    }

    /**
     * Sets grade
     *
     * @param string $grade grade
     *
     * @return self
     */
    public function setGrade($grade)
    {
        if (is_null($grade)) {
            throw new \InvalidArgumentException('non-nullable grade cannot be null');
        }
        $this->container['grade'] = $grade;

        return $this;
    }

    /**
     * Gets gradefordisplay
     *
     * @return string|null
     */
    public function getGradefordisplay()
    {
        return $this->container['gradefordisplay'];
    }

    /**
     * Sets gradefordisplay
     *
     * @param string|null $gradefordisplay grade rendered into a format suitable for display
     *
     * @return self
     */
    public function setGradefordisplay($gradefordisplay)
    {
        if (is_null($gradefordisplay)) {
            throw new \InvalidArgumentException('non-nullable gradefordisplay cannot be null');
        }
        $this->container['gradefordisplay'] = $gradefordisplay;

        return $this;
    }

    /**
     * Gets grader
     *
     * @return int
     */
    public function getGrader()
    {
        return $this->container['grader'];
    }

    /**
     * Sets grader
     *
     * @param int $grader grader, -1 if grader is hidden
     *
     * @return self
     */
    public function setGrader($grader)
    {
        if (is_null($grader)) {
            throw new \InvalidArgumentException('non-nullable grader cannot be null');
        }
        $this->container['grader'] = $grader;

        return $this;
    }

    /**
     * Gets id
     *
     * @return int
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int $id grade id
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
     * Gets timecreated
     *
     * @return int
     */
    public function getTimecreated()
    {
        return $this->container['timecreated'];
    }

    /**
     * Sets timecreated
     *
     * @param int $timecreated grade creation time
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
     * @return int
     */
    public function getTimemodified()
    {
        return $this->container['timemodified'];
    }

    /**
     * Sets timemodified
     *
     * @param int $timemodified grade last modified time
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
     * @return int
     */
    public function getUserid()
    {
        return $this->container['userid'];
    }

    /**
     * Sets userid
     *
     * @param int $userid student id
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

