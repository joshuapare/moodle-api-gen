<?php
/**
 * ModAssignGetSubmissionStatus200ResponseGradingsummary
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
 * ModAssignGetSubmissionStatus200ResponseGradingsummary Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModAssignGetSubmissionStatus200ResponseGradingsummary implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_assign_get_submission_status_200_response_gradingsummary';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'participantcount' => 'int',
        'submissiondraftscount' => 'int',
        'submissionsenabled' => 'bool',
        'submissionsneedgradingcount' => 'int',
        'submissionssubmittedcount' => 'int',
        'warnofungroupedusers' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'participantcount' => null,
        'submissiondraftscount' => null,
        'submissionsenabled' => null,
        'submissionsneedgradingcount' => null,
        'submissionssubmittedcount' => null,
        'warnofungroupedusers' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'participantcount' => false,
        'submissiondraftscount' => false,
        'submissionsenabled' => false,
        'submissionsneedgradingcount' => false,
        'submissionssubmittedcount' => false,
        'warnofungroupedusers' => false
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
        'participantcount' => 'participantcount',
        'submissiondraftscount' => 'submissiondraftscount',
        'submissionsenabled' => 'submissionsenabled',
        'submissionsneedgradingcount' => 'submissionsneedgradingcount',
        'submissionssubmittedcount' => 'submissionssubmittedcount',
        'warnofungroupedusers' => 'warnofungroupedusers'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'participantcount' => 'setParticipantcount',
        'submissiondraftscount' => 'setSubmissiondraftscount',
        'submissionsenabled' => 'setSubmissionsenabled',
        'submissionsneedgradingcount' => 'setSubmissionsneedgradingcount',
        'submissionssubmittedcount' => 'setSubmissionssubmittedcount',
        'warnofungroupedusers' => 'setWarnofungroupedusers'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'participantcount' => 'getParticipantcount',
        'submissiondraftscount' => 'getSubmissiondraftscount',
        'submissionsenabled' => 'getSubmissionsenabled',
        'submissionsneedgradingcount' => 'getSubmissionsneedgradingcount',
        'submissionssubmittedcount' => 'getSubmissionssubmittedcount',
        'warnofungroupedusers' => 'getWarnofungroupedusers'
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
        $this->setIfExists('participantcount', $data ?? [], null);
        $this->setIfExists('submissiondraftscount', $data ?? [], null);
        $this->setIfExists('submissionsenabled', $data ?? [], null);
        $this->setIfExists('submissionsneedgradingcount', $data ?? [], null);
        $this->setIfExists('submissionssubmittedcount', $data ?? [], null);
        $this->setIfExists('warnofungroupedusers', $data ?? [], 'null');
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

        if ($this->container['participantcount'] === null) {
            $invalidProperties[] = "'participantcount' can't be null";
        }
        if ($this->container['submissiondraftscount'] === null) {
            $invalidProperties[] = "'submissiondraftscount' can't be null";
        }
        if ($this->container['submissionsenabled'] === null) {
            $invalidProperties[] = "'submissionsenabled' can't be null";
        }
        if ($this->container['submissionsneedgradingcount'] === null) {
            $invalidProperties[] = "'submissionsneedgradingcount' can't be null";
        }
        if ($this->container['submissionssubmittedcount'] === null) {
            $invalidProperties[] = "'submissionssubmittedcount' can't be null";
        }
        if ($this->container['warnofungroupedusers'] === null) {
            $invalidProperties[] = "'warnofungroupedusers' can't be null";
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
     * Gets participantcount
     *
     * @return int
     */
    public function getParticipantcount()
    {
        return $this->container['participantcount'];
    }

    /**
     * Sets participantcount
     *
     * @param int $participantcount Number of users who can submit.
     *
     * @return self
     */
    public function setParticipantcount($participantcount)
    {
        if (is_null($participantcount)) {
            throw new \InvalidArgumentException('non-nullable participantcount cannot be null');
        }
        $this->container['participantcount'] = $participantcount;

        return $this;
    }

    /**
     * Gets submissiondraftscount
     *
     * @return int
     */
    public function getSubmissiondraftscount()
    {
        return $this->container['submissiondraftscount'];
    }

    /**
     * Sets submissiondraftscount
     *
     * @param int $submissiondraftscount Number of submissions in draft status.
     *
     * @return self
     */
    public function setSubmissiondraftscount($submissiondraftscount)
    {
        if (is_null($submissiondraftscount)) {
            throw new \InvalidArgumentException('non-nullable submissiondraftscount cannot be null');
        }
        $this->container['submissiondraftscount'] = $submissiondraftscount;

        return $this;
    }

    /**
     * Gets submissionsenabled
     *
     * @return bool
     */
    public function getSubmissionsenabled()
    {
        return $this->container['submissionsenabled'];
    }

    /**
     * Sets submissionsenabled
     *
     * @param bool $submissionsenabled Whether submissions are enabled or not.
     *
     * @return self
     */
    public function setSubmissionsenabled($submissionsenabled)
    {
        if (is_null($submissionsenabled)) {
            throw new \InvalidArgumentException('non-nullable submissionsenabled cannot be null');
        }
        $this->container['submissionsenabled'] = $submissionsenabled;

        return $this;
    }

    /**
     * Gets submissionsneedgradingcount
     *
     * @return int
     */
    public function getSubmissionsneedgradingcount()
    {
        return $this->container['submissionsneedgradingcount'];
    }

    /**
     * Sets submissionsneedgradingcount
     *
     * @param int $submissionsneedgradingcount Number of submissions that need grading.
     *
     * @return self
     */
    public function setSubmissionsneedgradingcount($submissionsneedgradingcount)
    {
        if (is_null($submissionsneedgradingcount)) {
            throw new \InvalidArgumentException('non-nullable submissionsneedgradingcount cannot be null');
        }
        $this->container['submissionsneedgradingcount'] = $submissionsneedgradingcount;

        return $this;
    }

    /**
     * Gets submissionssubmittedcount
     *
     * @return int
     */
    public function getSubmissionssubmittedcount()
    {
        return $this->container['submissionssubmittedcount'];
    }

    /**
     * Sets submissionssubmittedcount
     *
     * @param int $submissionssubmittedcount Number of submissions in submitted status.
     *
     * @return self
     */
    public function setSubmissionssubmittedcount($submissionssubmittedcount)
    {
        if (is_null($submissionssubmittedcount)) {
            throw new \InvalidArgumentException('non-nullable submissionssubmittedcount cannot be null');
        }
        $this->container['submissionssubmittedcount'] = $submissionssubmittedcount;

        return $this;
    }

    /**
     * Gets warnofungroupedusers
     *
     * @return string
     */
    public function getWarnofungroupedusers()
    {
        return $this->container['warnofungroupedusers'];
    }

    /**
     * Sets warnofungroupedusers
     *
     * @param string $warnofungroupedusers Whether we need to warn people that there                                                                         are users without groups ('warningrequired'), warn                                                                         people there are users who will submit in the default                                                                         group ('warningoptional') or no warning ('').
     *
     * @return self
     */
    public function setWarnofungroupedusers($warnofungroupedusers)
    {
        if (is_null($warnofungroupedusers)) {
            throw new \InvalidArgumentException('non-nullable warnofungroupedusers cannot be null');
        }
        $this->container['warnofungroupedusers'] = $warnofungroupedusers;

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

