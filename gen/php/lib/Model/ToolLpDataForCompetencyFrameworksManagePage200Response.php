<?php
/**
 * ToolLpDataForCompetencyFrameworksManagePage200Response
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
 * ToolLpDataForCompetencyFrameworksManagePage200Response Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ToolLpDataForCompetencyFrameworksManagePage200Response implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'tool_lp_data_for_competency_frameworks_manage_page_200_response';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'competencyframeworks' => '\OpenAPI\Client\Model\ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner[]',
        'navigation' => 'object[]',
        'pagecontextid' => 'int',
        'pluginbaseurl' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'competencyframeworks' => null,
        'navigation' => null,
        'pagecontextid' => null,
        'pluginbaseurl' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'competencyframeworks' => false,
        'navigation' => false,
        'pagecontextid' => false,
        'pluginbaseurl' => false
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
        'competencyframeworks' => 'competencyframeworks',
        'navigation' => 'navigation',
        'pagecontextid' => 'pagecontextid',
        'pluginbaseurl' => 'pluginbaseurl'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'competencyframeworks' => 'setCompetencyframeworks',
        'navigation' => 'setNavigation',
        'pagecontextid' => 'setPagecontextid',
        'pluginbaseurl' => 'setPluginbaseurl'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'competencyframeworks' => 'getCompetencyframeworks',
        'navigation' => 'getNavigation',
        'pagecontextid' => 'getPagecontextid',
        'pluginbaseurl' => 'getPluginbaseurl'
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
        $this->setIfExists('competencyframeworks', $data ?? [], null);
        $this->setIfExists('navigation', $data ?? [], null);
        $this->setIfExists('pagecontextid', $data ?? [], null);
        $this->setIfExists('pluginbaseurl', $data ?? [], 'null');
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

        if ($this->container['competencyframeworks'] === null) {
            $invalidProperties[] = "'competencyframeworks' can't be null";
        }
        if ($this->container['navigation'] === null) {
            $invalidProperties[] = "'navigation' can't be null";
        }
        if ($this->container['pagecontextid'] === null) {
            $invalidProperties[] = "'pagecontextid' can't be null";
        }
        if ($this->container['pluginbaseurl'] === null) {
            $invalidProperties[] = "'pluginbaseurl' can't be null";
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
     * Gets competencyframeworks
     *
     * @return \OpenAPI\Client\Model\ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner[]
     */
    public function getCompetencyframeworks()
    {
        return $this->container['competencyframeworks'];
    }

    /**
     * Sets competencyframeworks
     *
     * @param \OpenAPI\Client\Model\ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner[] $competencyframeworks competencyframeworks
     *
     * @return self
     */
    public function setCompetencyframeworks($competencyframeworks)
    {
        if (is_null($competencyframeworks)) {
            throw new \InvalidArgumentException('non-nullable competencyframeworks cannot be null');
        }
        $this->container['competencyframeworks'] = $competencyframeworks;

        return $this;
    }

    /**
     * Gets navigation
     *
     * @return object[]
     */
    public function getNavigation()
    {
        return $this->container['navigation'];
    }

    /**
     * Sets navigation
     *
     * @param object[] $navigation navigation
     *
     * @return self
     */
    public function setNavigation($navigation)
    {
        if (is_null($navigation)) {
            throw new \InvalidArgumentException('non-nullable navigation cannot be null');
        }
        $this->container['navigation'] = $navigation;

        return $this;
    }

    /**
     * Gets pagecontextid
     *
     * @return int
     */
    public function getPagecontextid()
    {
        return $this->container['pagecontextid'];
    }

    /**
     * Sets pagecontextid
     *
     * @param int $pagecontextid The page context id
     *
     * @return self
     */
    public function setPagecontextid($pagecontextid)
    {
        if (is_null($pagecontextid)) {
            throw new \InvalidArgumentException('non-nullable pagecontextid cannot be null');
        }
        $this->container['pagecontextid'] = $pagecontextid;

        return $this;
    }

    /**
     * Gets pluginbaseurl
     *
     * @return string
     */
    public function getPluginbaseurl()
    {
        return $this->container['pluginbaseurl'];
    }

    /**
     * Sets pluginbaseurl
     *
     * @param string $pluginbaseurl Url to the tool_lp plugin folder on this Moodle site
     *
     * @return self
     */
    public function setPluginbaseurl($pluginbaseurl)
    {
        if (is_null($pluginbaseurl)) {
            throw new \InvalidArgumentException('non-nullable pluginbaseurl cannot be null');
        }
        $this->container['pluginbaseurl'] = $pluginbaseurl;

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


