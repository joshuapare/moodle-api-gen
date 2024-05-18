<?php
/**
 * ModWorkshopGetAssessmentFormDefinition200Response
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
 * ModWorkshopGetAssessmentFormDefinition200Response Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModWorkshopGetAssessmentFormDefinition200Response implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_workshop_get_assessment_form_definition_200_response';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'current' => '\OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner[]',
        'descriptionfiles' => '\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]',
        'dimensionsinfo' => '\OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner[]',
        'dimenssionscount' => 'int',
        'fields' => '\OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner[]',
        'options' => '\OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner[]',
        'warnings' => '\OpenAPI\Client\Model\AuthEmailSignupUser200ResponseWarningsInner[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'current' => null,
        'descriptionfiles' => null,
        'dimensionsinfo' => null,
        'dimenssionscount' => null,
        'fields' => null,
        'options' => null,
        'warnings' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'current' => false,
        'descriptionfiles' => false,
        'dimensionsinfo' => false,
        'dimenssionscount' => false,
        'fields' => false,
        'options' => false,
        'warnings' => false
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
        'current' => 'current',
        'descriptionfiles' => 'descriptionfiles',
        'dimensionsinfo' => 'dimensionsinfo',
        'dimenssionscount' => 'dimenssionscount',
        'fields' => 'fields',
        'options' => 'options',
        'warnings' => 'warnings'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'current' => 'setCurrent',
        'descriptionfiles' => 'setDescriptionfiles',
        'dimensionsinfo' => 'setDimensionsinfo',
        'dimenssionscount' => 'setDimenssionscount',
        'fields' => 'setFields',
        'options' => 'setOptions',
        'warnings' => 'setWarnings'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'current' => 'getCurrent',
        'descriptionfiles' => 'getDescriptionfiles',
        'dimensionsinfo' => 'getDimensionsinfo',
        'dimenssionscount' => 'getDimenssionscount',
        'fields' => 'getFields',
        'options' => 'getOptions',
        'warnings' => 'getWarnings'
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
        $this->setIfExists('current', $data ?? [], null);
        $this->setIfExists('descriptionfiles', $data ?? [], null);
        $this->setIfExists('dimensionsinfo', $data ?? [], null);
        $this->setIfExists('dimenssionscount', $data ?? [], null);
        $this->setIfExists('fields', $data ?? [], null);
        $this->setIfExists('options', $data ?? [], null);
        $this->setIfExists('warnings', $data ?? [], null);
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

        if ($this->container['current'] === null) {
            $invalidProperties[] = "'current' can't be null";
        }
        if ($this->container['descriptionfiles'] === null) {
            $invalidProperties[] = "'descriptionfiles' can't be null";
        }
        if ($this->container['dimensionsinfo'] === null) {
            $invalidProperties[] = "'dimensionsinfo' can't be null";
        }
        if ($this->container['dimenssionscount'] === null) {
            $invalidProperties[] = "'dimenssionscount' can't be null";
        }
        if ($this->container['fields'] === null) {
            $invalidProperties[] = "'fields' can't be null";
        }
        if ($this->container['options'] === null) {
            $invalidProperties[] = "'options' can't be null";
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
     * Gets current
     *
     * @return \OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner[]
     */
    public function getCurrent()
    {
        return $this->container['current'];
    }

    /**
     * Sets current
     *
     * @param \OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner[] $current current
     *
     * @return self
     */
    public function setCurrent($current)
    {
        if (is_null($current)) {
            throw new \InvalidArgumentException('non-nullable current cannot be null');
        }
        $this->container['current'] = $current;

        return $this;
    }

    /**
     * Gets descriptionfiles
     *
     * @return \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]
     */
    public function getDescriptionfiles()
    {
        return $this->container['descriptionfiles'];
    }

    /**
     * Sets descriptionfiles
     *
     * @param \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[] $descriptionfiles descriptionfiles
     *
     * @return self
     */
    public function setDescriptionfiles($descriptionfiles)
    {
        if (is_null($descriptionfiles)) {
            throw new \InvalidArgumentException('non-nullable descriptionfiles cannot be null');
        }
        $this->container['descriptionfiles'] = $descriptionfiles;

        return $this;
    }

    /**
     * Gets dimensionsinfo
     *
     * @return \OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner[]
     */
    public function getDimensionsinfo()
    {
        return $this->container['dimensionsinfo'];
    }

    /**
     * Sets dimensionsinfo
     *
     * @param \OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner[] $dimensionsinfo dimensionsinfo
     *
     * @return self
     */
    public function setDimensionsinfo($dimensionsinfo)
    {
        if (is_null($dimensionsinfo)) {
            throw new \InvalidArgumentException('non-nullable dimensionsinfo cannot be null');
        }
        $this->container['dimensionsinfo'] = $dimensionsinfo;

        return $this;
    }

    /**
     * Gets dimenssionscount
     *
     * @return int
     */
    public function getDimenssionscount()
    {
        return $this->container['dimenssionscount'];
    }

    /**
     * Sets dimenssionscount
     *
     * @param int $dimenssionscount The number of dimenssions used by the form.
     *
     * @return self
     */
    public function setDimenssionscount($dimenssionscount)
    {
        if (is_null($dimenssionscount)) {
            throw new \InvalidArgumentException('non-nullable dimenssionscount cannot be null');
        }
        $this->container['dimenssionscount'] = $dimenssionscount;

        return $this;
    }

    /**
     * Gets fields
     *
     * @return \OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner[]
     */
    public function getFields()
    {
        return $this->container['fields'];
    }

    /**
     * Sets fields
     *
     * @param \OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner[] $fields fields
     *
     * @return self
     */
    public function setFields($fields)
    {
        if (is_null($fields)) {
            throw new \InvalidArgumentException('non-nullable fields cannot be null');
        }
        $this->container['fields'] = $fields;

        return $this;
    }

    /**
     * Gets options
     *
     * @return \OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner[]
     */
    public function getOptions()
    {
        return $this->container['options'];
    }

    /**
     * Sets options
     *
     * @param \OpenAPI\Client\Model\ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner[] $options options
     *
     * @return self
     */
    public function setOptions($options)
    {
        if (is_null($options)) {
            throw new \InvalidArgumentException('non-nullable options cannot be null');
        }
        $this->container['options'] = $options;

        return $this;
    }

    /**
     * Gets warnings
     *
     * @return \OpenAPI\Client\Model\AuthEmailSignupUser200ResponseWarningsInner[]|null
     */
    public function getWarnings()
    {
        return $this->container['warnings'];
    }

    /**
     * Sets warnings
     *
     * @param \OpenAPI\Client\Model\AuthEmailSignupUser200ResponseWarningsInner[]|null $warnings warnings
     *
     * @return self
     */
    public function setWarnings($warnings)
    {
        if (is_null($warnings)) {
            throw new \InvalidArgumentException('non-nullable warnings cannot be null');
        }
        $this->container['warnings'] = $warnings;

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

