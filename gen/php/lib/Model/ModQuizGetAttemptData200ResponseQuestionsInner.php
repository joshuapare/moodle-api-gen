<?php
/**
 * ModQuizGetAttemptData200ResponseQuestionsInner
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
 * ModQuizGetAttemptData200ResponseQuestionsInner Class Doc Comment
 *
 * @category Class
 * @description The question data. Some fields may not be returned depending on the quiz display settings.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModQuizGetAttemptData200ResponseQuestionsInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_quiz_get_attempt_data_200_response_questions_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'blockedbyprevious' => 'bool',
        'flagged' => 'bool',
        'hasautosavedstep' => 'bool',
        'html' => 'string',
        'lastactiontime' => 'int',
        'mark' => 'string',
        'maxmark' => 'float',
        'number' => 'int',
        'page' => 'int',
        'questionnumber' => 'string',
        'responsefileareas' => '\OpenAPI\Client\Model\ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner[]',
        'sequencecheck' => 'int',
        'settings' => 'string',
        'slot' => 'int',
        'state' => 'string',
        'status' => 'string',
        'type' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'blockedbyprevious' => null,
        'flagged' => null,
        'hasautosavedstep' => null,
        'html' => null,
        'lastactiontime' => null,
        'mark' => null,
        'maxmark' => null,
        'number' => null,
        'page' => null,
        'questionnumber' => null,
        'responsefileareas' => null,
        'sequencecheck' => null,
        'settings' => null,
        'slot' => null,
        'state' => null,
        'status' => null,
        'type' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'blockedbyprevious' => false,
        'flagged' => false,
        'hasautosavedstep' => false,
        'html' => false,
        'lastactiontime' => false,
        'mark' => false,
        'maxmark' => false,
        'number' => false,
        'page' => false,
        'questionnumber' => false,
        'responsefileareas' => false,
        'sequencecheck' => false,
        'settings' => false,
        'slot' => false,
        'state' => false,
        'status' => false,
        'type' => false
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
        'blockedbyprevious' => 'blockedbyprevious',
        'flagged' => 'flagged',
        'hasautosavedstep' => 'hasautosavedstep',
        'html' => 'html',
        'lastactiontime' => 'lastactiontime',
        'mark' => 'mark',
        'maxmark' => 'maxmark',
        'number' => 'number',
        'page' => 'page',
        'questionnumber' => 'questionnumber',
        'responsefileareas' => 'responsefileareas',
        'sequencecheck' => 'sequencecheck',
        'settings' => 'settings',
        'slot' => 'slot',
        'state' => 'state',
        'status' => 'status',
        'type' => 'type'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'blockedbyprevious' => 'setBlockedbyprevious',
        'flagged' => 'setFlagged',
        'hasautosavedstep' => 'setHasautosavedstep',
        'html' => 'setHtml',
        'lastactiontime' => 'setLastactiontime',
        'mark' => 'setMark',
        'maxmark' => 'setMaxmark',
        'number' => 'setNumber',
        'page' => 'setPage',
        'questionnumber' => 'setQuestionnumber',
        'responsefileareas' => 'setResponsefileareas',
        'sequencecheck' => 'setSequencecheck',
        'settings' => 'setSettings',
        'slot' => 'setSlot',
        'state' => 'setState',
        'status' => 'setStatus',
        'type' => 'setType'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'blockedbyprevious' => 'getBlockedbyprevious',
        'flagged' => 'getFlagged',
        'hasautosavedstep' => 'getHasautosavedstep',
        'html' => 'getHtml',
        'lastactiontime' => 'getLastactiontime',
        'mark' => 'getMark',
        'maxmark' => 'getMaxmark',
        'number' => 'getNumber',
        'page' => 'getPage',
        'questionnumber' => 'getQuestionnumber',
        'responsefileareas' => 'getResponsefileareas',
        'sequencecheck' => 'getSequencecheck',
        'settings' => 'getSettings',
        'slot' => 'getSlot',
        'state' => 'getState',
        'status' => 'getStatus',
        'type' => 'getType'
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
        $this->setIfExists('blockedbyprevious', $data ?? [], null);
        $this->setIfExists('flagged', $data ?? [], null);
        $this->setIfExists('hasautosavedstep', $data ?? [], null);
        $this->setIfExists('html', $data ?? [], 'null');
        $this->setIfExists('lastactiontime', $data ?? [], null);
        $this->setIfExists('mark', $data ?? [], 'null');
        $this->setIfExists('maxmark', $data ?? [], null);
        $this->setIfExists('number', $data ?? [], null);
        $this->setIfExists('page', $data ?? [], null);
        $this->setIfExists('questionnumber', $data ?? [], 'null');
        $this->setIfExists('responsefileareas', $data ?? [], null);
        $this->setIfExists('sequencecheck', $data ?? [], null);
        $this->setIfExists('settings', $data ?? [], 'null');
        $this->setIfExists('slot', $data ?? [], null);
        $this->setIfExists('state', $data ?? [], 'null');
        $this->setIfExists('status', $data ?? [], 'null');
        $this->setIfExists('type', $data ?? [], 'null');
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
     * Gets blockedbyprevious
     *
     * @return bool|null
     */
    public function getBlockedbyprevious()
    {
        return $this->container['blockedbyprevious'];
    }

    /**
     * Sets blockedbyprevious
     *
     * @param bool|null $blockedbyprevious whether the question is blocked by the previous question
     *
     * @return self
     */
    public function setBlockedbyprevious($blockedbyprevious)
    {
        if (is_null($blockedbyprevious)) {
            throw new \InvalidArgumentException('non-nullable blockedbyprevious cannot be null');
        }
        $this->container['blockedbyprevious'] = $blockedbyprevious;

        return $this;
    }

    /**
     * Gets flagged
     *
     * @return bool|null
     */
    public function getFlagged()
    {
        return $this->container['flagged'];
    }

    /**
     * Sets flagged
     *
     * @param bool|null $flagged whether the question is flagged or not
     *
     * @return self
     */
    public function setFlagged($flagged)
    {
        if (is_null($flagged)) {
            throw new \InvalidArgumentException('non-nullable flagged cannot be null');
        }
        $this->container['flagged'] = $flagged;

        return $this;
    }

    /**
     * Gets hasautosavedstep
     *
     * @return bool|null
     */
    public function getHasautosavedstep()
    {
        return $this->container['hasautosavedstep'];
    }

    /**
     * Sets hasautosavedstep
     *
     * @param bool|null $hasautosavedstep whether this question attempt has autosaved data
     *
     * @return self
     */
    public function setHasautosavedstep($hasautosavedstep)
    {
        if (is_null($hasautosavedstep)) {
            throw new \InvalidArgumentException('non-nullable hasautosavedstep cannot be null');
        }
        $this->container['hasautosavedstep'] = $hasautosavedstep;

        return $this;
    }

    /**
     * Gets html
     *
     * @return string|null
     */
    public function getHtml()
    {
        return $this->container['html'];
    }

    /**
     * Sets html
     *
     * @param string|null $html the question rendered
     *
     * @return self
     */
    public function setHtml($html)
    {
        if (is_null($html)) {
            throw new \InvalidArgumentException('non-nullable html cannot be null');
        }
        $this->container['html'] = $html;

        return $this;
    }

    /**
     * Gets lastactiontime
     *
     * @return int|null
     */
    public function getLastactiontime()
    {
        return $this->container['lastactiontime'];
    }

    /**
     * Sets lastactiontime
     *
     * @param int|null $lastactiontime the timestamp of the most recent step in this question attempt
     *
     * @return self
     */
    public function setLastactiontime($lastactiontime)
    {
        if (is_null($lastactiontime)) {
            throw new \InvalidArgumentException('non-nullable lastactiontime cannot be null');
        }
        $this->container['lastactiontime'] = $lastactiontime;

        return $this;
    }

    /**
     * Gets mark
     *
     * @return string|null
     */
    public function getMark()
    {
        return $this->container['mark'];
    }

    /**
     * Sets mark
     *
     * @param string|null $mark the mark awarded.                     It will be returned only if the user is allowed to see it.
     *
     * @return self
     */
    public function setMark($mark)
    {
        if (is_null($mark)) {
            throw new \InvalidArgumentException('non-nullable mark cannot be null');
        }
        $this->container['mark'] = $mark;

        return $this;
    }

    /**
     * Gets maxmark
     *
     * @return float|null
     */
    public function getMaxmark()
    {
        return $this->container['maxmark'];
    }

    /**
     * Sets maxmark
     *
     * @param float|null $maxmark the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it.
     *
     * @return self
     */
    public function setMaxmark($maxmark)
    {
        if (is_null($maxmark)) {
            throw new \InvalidArgumentException('non-nullable maxmark cannot be null');
        }
        $this->container['maxmark'] = $maxmark;

        return $this;
    }

    /**
     * Gets number
     *
     * @return int|null
     */
    public function getNumber()
    {
        return $this->container['number'];
    }

    /**
     * Sets number
     *
     * @param int|null $number DO NOT USE. Use questionnumber. Only retained for backwards compatibility.
     *
     * @return self
     */
    public function setNumber($number)
    {
        if (is_null($number)) {
            throw new \InvalidArgumentException('non-nullable number cannot be null');
        }
        $this->container['number'] = $number;

        return $this;
    }

    /**
     * Gets page
     *
     * @return int|null
     */
    public function getPage()
    {
        return $this->container['page'];
    }

    /**
     * Sets page
     *
     * @param int|null $page page of the quiz this question appears on
     *
     * @return self
     */
    public function setPage($page)
    {
        if (is_null($page)) {
            throw new \InvalidArgumentException('non-nullable page cannot be null');
        }
        $this->container['page'] = $page;

        return $this;
    }

    /**
     * Gets questionnumber
     *
     * @return string|null
     */
    public function getQuestionnumber()
    {
        return $this->container['questionnumber'];
    }

    /**
     * Sets questionnumber
     *
     * @param string|null $questionnumber The question number to display for this question, e.g. \"7\", \"i\" or \"Custom-B)\".
     *
     * @return self
     */
    public function setQuestionnumber($questionnumber)
    {
        if (is_null($questionnumber)) {
            throw new \InvalidArgumentException('non-nullable questionnumber cannot be null');
        }
        $this->container['questionnumber'] = $questionnumber;

        return $this;
    }

    /**
     * Gets responsefileareas
     *
     * @return \OpenAPI\Client\Model\ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner[]|null
     */
    public function getResponsefileareas()
    {
        return $this->container['responsefileareas'];
    }

    /**
     * Sets responsefileareas
     *
     * @param \OpenAPI\Client\Model\ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner[]|null $responsefileareas responsefileareas
     *
     * @return self
     */
    public function setResponsefileareas($responsefileareas)
    {
        if (is_null($responsefileareas)) {
            throw new \InvalidArgumentException('non-nullable responsefileareas cannot be null');
        }
        $this->container['responsefileareas'] = $responsefileareas;

        return $this;
    }

    /**
     * Gets sequencecheck
     *
     * @return int|null
     */
    public function getSequencecheck()
    {
        return $this->container['sequencecheck'];
    }

    /**
     * Sets sequencecheck
     *
     * @param int|null $sequencecheck the number of real steps in this attempt
     *
     * @return self
     */
    public function setSequencecheck($sequencecheck)
    {
        if (is_null($sequencecheck)) {
            throw new \InvalidArgumentException('non-nullable sequencecheck cannot be null');
        }
        $this->container['sequencecheck'] = $sequencecheck;

        return $this;
    }

    /**
     * Gets settings
     *
     * @return string|null
     */
    public function getSettings()
    {
        return $this->container['settings'];
    }

    /**
     * Sets settings
     *
     * @param string|null $settings Question settings (JSON encoded).
     *
     * @return self
     */
    public function setSettings($settings)
    {
        if (is_null($settings)) {
            throw new \InvalidArgumentException('non-nullable settings cannot be null');
        }
        $this->container['settings'] = $settings;

        return $this;
    }

    /**
     * Gets slot
     *
     * @return int|null
     */
    public function getSlot()
    {
        return $this->container['slot'];
    }

    /**
     * Sets slot
     *
     * @param int|null $slot slot number
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
     * Gets state
     *
     * @return string|null
     */
    public function getState()
    {
        return $this->container['state'];
    }

    /**
     * Sets state
     *
     * @param string|null $state the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings.
     *
     * @return self
     */
    public function setState($state)
    {
        if (is_null($state)) {
            throw new \InvalidArgumentException('non-nullable state cannot be null');
        }
        $this->container['state'] = $state;

        return $this;
    }

    /**
     * Gets status
     *
     * @return string|null
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     *
     * @param string|null $status current formatted state of the question
     *
     * @return self
     */
    public function setStatus($status)
    {
        if (is_null($status)) {
            throw new \InvalidArgumentException('non-nullable status cannot be null');
        }
        $this->container['status'] = $status;

        return $this;
    }

    /**
     * Gets type
     *
     * @return string|null
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     *
     * @param string|null $type question type, i.e: multichoice
     *
     * @return self
     */
    public function setType($type)
    {
        if (is_null($type)) {
            throw new \InvalidArgumentException('non-nullable type cannot be null');
        }
        $this->container['type'] = $type;

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

