<?php
/**
 * ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner
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
 * ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_workshop_get_grades_report_200_response_report_grades_inner_reviewerof_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'assessmentid' => 'int',
        'grade' => 'float',
        'gradinggrade' => 'float',
        'gradinggradeover' => 'float',
        'submissionid' => 'int',
        'userid' => 'int',
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
        'assessmentid' => null,
        'grade' => null,
        'gradinggrade' => null,
        'gradinggradeover' => null,
        'submissionid' => null,
        'userid' => null,
        'weight' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'assessmentid' => false,
        'grade' => false,
        'gradinggrade' => false,
        'gradinggradeover' => false,
        'submissionid' => false,
        'userid' => false,
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
        'assessmentid' => 'assessmentid',
        'grade' => 'grade',
        'gradinggrade' => 'gradinggrade',
        'gradinggradeover' => 'gradinggradeover',
        'submissionid' => 'submissionid',
        'userid' => 'userid',
        'weight' => 'weight'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'assessmentid' => 'setAssessmentid',
        'grade' => 'setGrade',
        'gradinggrade' => 'setGradinggrade',
        'gradinggradeover' => 'setGradinggradeover',
        'submissionid' => 'setSubmissionid',
        'userid' => 'setUserid',
        'weight' => 'setWeight'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'assessmentid' => 'getAssessmentid',
        'grade' => 'getGrade',
        'gradinggrade' => 'getGradinggrade',
        'gradinggradeover' => 'getGradinggradeover',
        'submissionid' => 'getSubmissionid',
        'userid' => 'getUserid',
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
        $this->setIfExists('assessmentid', $data ?? [], null);
        $this->setIfExists('grade', $data ?? [], null);
        $this->setIfExists('gradinggrade', $data ?? [], null);
        $this->setIfExists('gradinggradeover', $data ?? [], null);
        $this->setIfExists('submissionid', $data ?? [], null);
        $this->setIfExists('userid', $data ?? [], null);
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
     * Gets assessmentid
     *
     * @return int|null
     */
    public function getAssessmentid()
    {
        return $this->container['assessmentid'];
    }

    /**
     * Sets assessmentid
     *
     * @param int|null $assessmentid The id of the assessment.
     *
     * @return self
     */
    public function setAssessmentid($assessmentid)
    {
        if (is_null($assessmentid)) {
            throw new \InvalidArgumentException('non-nullable assessmentid cannot be null');
        }
        $this->container['assessmentid'] = $assessmentid;

        return $this;
    }

    /**
     * Gets grade
     *
     * @return float|null
     */
    public function getGrade()
    {
        return $this->container['grade'];
    }

    /**
     * Sets grade
     *
     * @param float|null $grade The grade for submission.
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
     * Gets gradinggrade
     *
     * @return float|null
     */
    public function getGradinggrade()
    {
        return $this->container['gradinggrade'];
    }

    /**
     * Sets gradinggrade
     *
     * @param float|null $gradinggrade The grade for assessment.
     *
     * @return self
     */
    public function setGradinggrade($gradinggrade)
    {
        if (is_null($gradinggrade)) {
            throw new \InvalidArgumentException('non-nullable gradinggrade cannot be null');
        }
        $this->container['gradinggrade'] = $gradinggrade;

        return $this;
    }

    /**
     * Gets gradinggradeover
     *
     * @return float|null
     */
    public function getGradinggradeover()
    {
        return $this->container['gradinggradeover'];
    }

    /**
     * Sets gradinggradeover
     *
     * @param float|null $gradinggradeover The aggregated grade overrided.
     *
     * @return self
     */
    public function setGradinggradeover($gradinggradeover)
    {
        if (is_null($gradinggradeover)) {
            throw new \InvalidArgumentException('non-nullable gradinggradeover cannot be null');
        }
        $this->container['gradinggradeover'] = $gradinggradeover;

        return $this;
    }

    /**
     * Gets submissionid
     *
     * @return int|null
     */
    public function getSubmissionid()
    {
        return $this->container['submissionid'];
    }

    /**
     * Sets submissionid
     *
     * @param int|null $submissionid The id of the submission assessed.
     *
     * @return self
     */
    public function setSubmissionid($submissionid)
    {
        if (is_null($submissionid)) {
            throw new \InvalidArgumentException('non-nullable submissionid cannot be null');
        }
        $this->container['submissionid'] = $submissionid;

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
     * @param int|null $userid The id of the user (0 when is configured to do not display names).
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
     * @param int|null $weight The weight of the assessment for aggregation.
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


