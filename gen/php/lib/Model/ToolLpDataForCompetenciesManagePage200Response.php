<?php
/**
 * ToolLpDataForCompetenciesManagePage200Response
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
 * ToolLpDataForCompetenciesManagePage200Response Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ToolLpDataForCompetenciesManagePage200Response implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'tool_lp_data_for_competencies_manage_page_200_response';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'canmanage' => 'bool',
        'framework' => '\OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFramework200Response',
        'pagecontextid' => 'int',
        'pluginbaseurl' => 'string',
        'rulesmodules' => 'string',
        'search' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'canmanage' => null,
        'framework' => null,
        'pagecontextid' => null,
        'pluginbaseurl' => null,
        'rulesmodules' => null,
        'search' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'canmanage' => false,
        'framework' => false,
        'pagecontextid' => false,
        'pluginbaseurl' => false,
        'rulesmodules' => false,
        'search' => false
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
        'canmanage' => 'canmanage',
        'framework' => 'framework',
        'pagecontextid' => 'pagecontextid',
        'pluginbaseurl' => 'pluginbaseurl',
        'rulesmodules' => 'rulesmodules',
        'search' => 'search'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'canmanage' => 'setCanmanage',
        'framework' => 'setFramework',
        'pagecontextid' => 'setPagecontextid',
        'pluginbaseurl' => 'setPluginbaseurl',
        'rulesmodules' => 'setRulesmodules',
        'search' => 'setSearch'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'canmanage' => 'getCanmanage',
        'framework' => 'getFramework',
        'pagecontextid' => 'getPagecontextid',
        'pluginbaseurl' => 'getPluginbaseurl',
        'rulesmodules' => 'getRulesmodules',
        'search' => 'getSearch'
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
        $this->setIfExists('canmanage', $data ?? [], null);
        $this->setIfExists('framework', $data ?? [], null);
        $this->setIfExists('pagecontextid', $data ?? [], null);
        $this->setIfExists('pluginbaseurl', $data ?? [], 'null');
        $this->setIfExists('rulesmodules', $data ?? [], 'null');
        $this->setIfExists('search', $data ?? [], 'null');
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

        if ($this->container['canmanage'] === null) {
            $invalidProperties[] = "'canmanage' can't be null";
        }
        if ($this->container['framework'] === null) {
            $invalidProperties[] = "'framework' can't be null";
        }
        if ($this->container['pagecontextid'] === null) {
            $invalidProperties[] = "'pagecontextid' can't be null";
        }
        if ($this->container['pluginbaseurl'] === null) {
            $invalidProperties[] = "'pluginbaseurl' can't be null";
        }
        if ($this->container['rulesmodules'] === null) {
            $invalidProperties[] = "'rulesmodules' can't be null";
        }
        if ($this->container['search'] === null) {
            $invalidProperties[] = "'search' can't be null";
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
     * Gets canmanage
     *
     * @return bool
     */
    public function getCanmanage()
    {
        return $this->container['canmanage'];
    }

    /**
     * Sets canmanage
     *
     * @param bool $canmanage True if this user has permission to manage competency frameworks
     *
     * @return self
     */
    public function setCanmanage($canmanage)
    {
        if (is_null($canmanage)) {
            throw new \InvalidArgumentException('non-nullable canmanage cannot be null');
        }
        $this->container['canmanage'] = $canmanage;

        return $this;
    }

    /**
     * Gets framework
     *
     * @return \OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFramework200Response
     */
    public function getFramework()
    {
        return $this->container['framework'];
    }

    /**
     * Sets framework
     *
     * @param \OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFramework200Response $framework framework
     *
     * @return self
     */
    public function setFramework($framework)
    {
        if (is_null($framework)) {
            throw new \InvalidArgumentException('non-nullable framework cannot be null');
        }
        $this->container['framework'] = $framework;

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
     * @param int $pagecontextid Context id for the framework
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
     * @param string $pluginbaseurl Plugin base url
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
     * Gets rulesmodules
     *
     * @return string
     */
    public function getRulesmodules()
    {
        return $this->container['rulesmodules'];
    }

    /**
     * Sets rulesmodules
     *
     * @param string $rulesmodules JSON encoded data for rules
     *
     * @return self
     */
    public function setRulesmodules($rulesmodules)
    {
        if (is_null($rulesmodules)) {
            throw new \InvalidArgumentException('non-nullable rulesmodules cannot be null');
        }
        $this->container['rulesmodules'] = $rulesmodules;

        return $this;
    }

    /**
     * Gets search
     *
     * @return string
     */
    public function getSearch()
    {
        return $this->container['search'];
    }

    /**
     * Sets search
     *
     * @param string $search Current search string
     *
     * @return self
     */
    public function setSearch($search)
    {
        if (is_null($search)) {
            throw new \InvalidArgumentException('non-nullable search cannot be null');
        }
        $this->container['search'] = $search;

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

