<?php
/**
 * GradingformGuideGraderGradingpanelStore200ResponseGrade
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
 * GradingformGuideGraderGradingpanelStore200ResponseGrade Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class GradingformGuideGraderGradingpanelStore200ResponseGrade implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'gradingform_guide_grader_gradingpanel_store_200_response_grade';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'comments' => '\OpenAPI\Client\Model\GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner[]',
        'criterion' => '\OpenAPI\Client\Model\GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner[]',
        'gradedby' => 'string',
        'hascomments' => 'bool',
        'instanceid' => 'int',
        'maxgrade' => 'string',
        'timecreated' => 'int',
        'timemodified' => 'int',
        'usergrade' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'comments' => null,
        'criterion' => null,
        'gradedby' => null,
        'hascomments' => null,
        'instanceid' => null,
        'maxgrade' => null,
        'timecreated' => null,
        'timemodified' => null,
        'usergrade' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'comments' => false,
        'criterion' => false,
        'gradedby' => false,
        'hascomments' => false,
        'instanceid' => false,
        'maxgrade' => false,
        'timecreated' => false,
        'timemodified' => false,
        'usergrade' => false
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
        'comments' => 'comments',
        'criterion' => 'criterion',
        'gradedby' => 'gradedby',
        'hascomments' => 'hascomments',
        'instanceid' => 'instanceid',
        'maxgrade' => 'maxgrade',
        'timecreated' => 'timecreated',
        'timemodified' => 'timemodified',
        'usergrade' => 'usergrade'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'comments' => 'setComments',
        'criterion' => 'setCriterion',
        'gradedby' => 'setGradedby',
        'hascomments' => 'setHascomments',
        'instanceid' => 'setInstanceid',
        'maxgrade' => 'setMaxgrade',
        'timecreated' => 'setTimecreated',
        'timemodified' => 'setTimemodified',
        'usergrade' => 'setUsergrade'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'comments' => 'getComments',
        'criterion' => 'getCriterion',
        'gradedby' => 'getGradedby',
        'hascomments' => 'getHascomments',
        'instanceid' => 'getInstanceid',
        'maxgrade' => 'getMaxgrade',
        'timecreated' => 'getTimecreated',
        'timemodified' => 'getTimemodified',
        'usergrade' => 'getUsergrade'
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
        $this->setIfExists('comments', $data ?? [], null);
        $this->setIfExists('criterion', $data ?? [], null);
        $this->setIfExists('gradedby', $data ?? [], null);
        $this->setIfExists('hascomments', $data ?? [], null);
        $this->setIfExists('instanceid', $data ?? [], null);
        $this->setIfExists('maxgrade', $data ?? [], null);
        $this->setIfExists('timecreated', $data ?? [], null);
        $this->setIfExists('timemodified', $data ?? [], null);
        $this->setIfExists('usergrade', $data ?? [], null);
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

        if ($this->container['comments'] === null) {
            $invalidProperties[] = "'comments' can't be null";
        }
        if ($this->container['criterion'] === null) {
            $invalidProperties[] = "'criterion' can't be null";
        }
        if ($this->container['gradedby'] === null) {
            $invalidProperties[] = "'gradedby' can't be null";
        }
        if ($this->container['hascomments'] === null) {
            $invalidProperties[] = "'hascomments' can't be null";
        }
        if ($this->container['instanceid'] === null) {
            $invalidProperties[] = "'instanceid' can't be null";
        }
        if ($this->container['maxgrade'] === null) {
            $invalidProperties[] = "'maxgrade' can't be null";
        }
        if ($this->container['timecreated'] === null) {
            $invalidProperties[] = "'timecreated' can't be null";
        }
        if ($this->container['timemodified'] === null) {
            $invalidProperties[] = "'timemodified' can't be null";
        }
        if ($this->container['usergrade'] === null) {
            $invalidProperties[] = "'usergrade' can't be null";
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
     * Gets comments
     *
     * @return \OpenAPI\Client\Model\GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner[]
     */
    public function getComments()
    {
        return $this->container['comments'];
    }

    /**
     * Sets comments
     *
     * @param \OpenAPI\Client\Model\GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner[] $comments comments
     *
     * @return self
     */
    public function setComments($comments)
    {
        if (is_null($comments)) {
            throw new \InvalidArgumentException('non-nullable comments cannot be null');
        }
        $this->container['comments'] = $comments;

        return $this;
    }

    /**
     * Gets criterion
     *
     * @return \OpenAPI\Client\Model\GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner[]
     */
    public function getCriterion()
    {
        return $this->container['criterion'];
    }

    /**
     * Sets criterion
     *
     * @param \OpenAPI\Client\Model\GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner[] $criterion criterion
     *
     * @return self
     */
    public function setCriterion($criterion)
    {
        if (is_null($criterion)) {
            throw new \InvalidArgumentException('non-nullable criterion cannot be null');
        }
        $this->container['criterion'] = $criterion;

        return $this;
    }

    /**
     * Gets gradedby
     *
     * @return string
     */
    public function getGradedby()
    {
        return $this->container['gradedby'];
    }

    /**
     * Sets gradedby
     *
     * @param string $gradedby The assumed grader of this grading instance
     *
     * @return self
     */
    public function setGradedby($gradedby)
    {
        if (is_null($gradedby)) {
            throw new \InvalidArgumentException('non-nullable gradedby cannot be null');
        }
        $this->container['gradedby'] = $gradedby;

        return $this;
    }

    /**
     * Gets hascomments
     *
     * @return bool
     */
    public function getHascomments()
    {
        return $this->container['hascomments'];
    }

    /**
     * Sets hascomments
     *
     * @param bool $hascomments Whether there are any frequently-used comments
     *
     * @return self
     */
    public function setHascomments($hascomments)
    {
        if (is_null($hascomments)) {
            throw new \InvalidArgumentException('non-nullable hascomments cannot be null');
        }
        $this->container['hascomments'] = $hascomments;

        return $this;
    }

    /**
     * Gets instanceid
     *
     * @return int
     */
    public function getInstanceid()
    {
        return $this->container['instanceid'];
    }

    /**
     * Sets instanceid
     *
     * @param int $instanceid The id of the current grading instance
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
     * Gets maxgrade
     *
     * @return string
     */
    public function getMaxgrade()
    {
        return $this->container['maxgrade'];
    }

    /**
     * Sets maxgrade
     *
     * @param string $maxgrade Max possible grade
     *
     * @return self
     */
    public function setMaxgrade($maxgrade)
    {
        if (is_null($maxgrade)) {
            throw new \InvalidArgumentException('non-nullable maxgrade cannot be null');
        }
        $this->container['maxgrade'] = $maxgrade;

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
     * @param int $timecreated The time that the grade was created
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
     * @param int $timemodified The time that the grade was last updated
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
     * Gets usergrade
     *
     * @return string
     */
    public function getUsergrade()
    {
        return $this->container['usergrade'];
    }

    /**
     * Sets usergrade
     *
     * @param string $usergrade Current user grade
     *
     * @return self
     */
    public function setUsergrade($usergrade)
    {
        if (is_null($usergrade)) {
            throw new \InvalidArgumentException('non-nullable usergrade cannot be null');
        }
        $this->container['usergrade'] = $usergrade;

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

