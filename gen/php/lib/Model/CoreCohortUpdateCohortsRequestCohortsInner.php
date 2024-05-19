<?php
/**
 * CoreCohortUpdateCohortsRequestCohortsInner
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
 * CoreCohortUpdateCohortsRequestCohortsInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreCohortUpdateCohortsRequestCohortsInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_cohort_update_cohorts_request_cohorts_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'categorytype' => '\OpenAPI\Client\Model\CoreCohortUpdateCohortsRequestCohortsInnerCategorytype',
        'customfields' => '\OpenAPI\Client\Model\CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner[]',
        'description' => 'string',
        'descriptionformat' => 'int',
        'id' => 'int',
        'idnumber' => 'string',
        'name' => 'string',
        'theme' => 'string',
        'visible' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'categorytype' => null,
        'customfields' => null,
        'description' => null,
        'descriptionformat' => null,
        'id' => null,
        'idnumber' => null,
        'name' => null,
        'theme' => null,
        'visible' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'categorytype' => false,
        'customfields' => false,
        'description' => false,
        'descriptionformat' => false,
        'id' => false,
        'idnumber' => false,
        'name' => false,
        'theme' => false,
        'visible' => false
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
        'categorytype' => 'categorytype',
        'customfields' => 'customfields',
        'description' => 'description',
        'descriptionformat' => 'descriptionformat',
        'id' => 'id',
        'idnumber' => 'idnumber',
        'name' => 'name',
        'theme' => 'theme',
        'visible' => 'visible'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'categorytype' => 'setCategorytype',
        'customfields' => 'setCustomfields',
        'description' => 'setDescription',
        'descriptionformat' => 'setDescriptionformat',
        'id' => 'setId',
        'idnumber' => 'setIdnumber',
        'name' => 'setName',
        'theme' => 'setTheme',
        'visible' => 'setVisible'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'categorytype' => 'getCategorytype',
        'customfields' => 'getCustomfields',
        'description' => 'getDescription',
        'descriptionformat' => 'getDescriptionformat',
        'id' => 'getId',
        'idnumber' => 'getIdnumber',
        'name' => 'getName',
        'theme' => 'getTheme',
        'visible' => 'getVisible'
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
        $this->setIfExists('categorytype', $data ?? [], null);
        $this->setIfExists('customfields', $data ?? [], null);
        $this->setIfExists('description', $data ?? [], null);
        $this->setIfExists('descriptionformat', $data ?? [], 1);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('idnumber', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('theme', $data ?? [], null);
        $this->setIfExists('visible', $data ?? [], null);
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
     * Gets categorytype
     *
     * @return \OpenAPI\Client\Model\CoreCohortUpdateCohortsRequestCohortsInnerCategorytype|null
     */
    public function getCategorytype()
    {
        return $this->container['categorytype'];
    }

    /**
     * Sets categorytype
     *
     * @param \OpenAPI\Client\Model\CoreCohortUpdateCohortsRequestCohortsInnerCategorytype|null $categorytype categorytype
     *
     * @return self
     */
    public function setCategorytype($categorytype)
    {
        if (is_null($categorytype)) {
            throw new \InvalidArgumentException('non-nullable categorytype cannot be null');
        }
        $this->container['categorytype'] = $categorytype;

        return $this;
    }

    /**
     * Gets customfields
     *
     * @return \OpenAPI\Client\Model\CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner[]|null
     */
    public function getCustomfields()
    {
        return $this->container['customfields'];
    }

    /**
     * Sets customfields
     *
     * @param \OpenAPI\Client\Model\CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner[]|null $customfields customfields
     *
     * @return self
     */
    public function setCustomfields($customfields)
    {
        if (is_null($customfields)) {
            throw new \InvalidArgumentException('non-nullable customfields cannot be null');
        }
        $this->container['customfields'] = $customfields;

        return $this;
    }

    /**
     * Gets description
     *
     * @return string|null
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     *
     * @param string|null $description cohort description
     *
     * @return self
     */
    public function setDescription($description)
    {
        if (is_null($description)) {
            throw new \InvalidArgumentException('non-nullable description cannot be null');
        }
        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets descriptionformat
     *
     * @return int|null
     */
    public function getDescriptionformat()
    {
        return $this->container['descriptionformat'];
    }

    /**
     * Sets descriptionformat
     *
     * @param int|null $descriptionformat description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     *
     * @return self
     */
    public function setDescriptionformat($descriptionformat)
    {
        if (is_null($descriptionformat)) {
            throw new \InvalidArgumentException('non-nullable descriptionformat cannot be null');
        }
        $this->container['descriptionformat'] = $descriptionformat;

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
     * @param int|null $id ID of the cohort
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
     * Gets idnumber
     *
     * @return string|null
     */
    public function getIdnumber()
    {
        return $this->container['idnumber'];
    }

    /**
     * Sets idnumber
     *
     * @param string|null $idnumber cohort idnumber
     *
     * @return self
     */
    public function setIdnumber($idnumber)
    {
        if (is_null($idnumber)) {
            throw new \InvalidArgumentException('non-nullable idnumber cannot be null');
        }
        $this->container['idnumber'] = $idnumber;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string|null $name cohort name
     *
     * @return self
     */
    public function setName($name)
    {
        if (is_null($name)) {
            throw new \InvalidArgumentException('non-nullable name cannot be null');
        }
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets theme
     *
     * @return string|null
     */
    public function getTheme()
    {
        return $this->container['theme'];
    }

    /**
     * Sets theme
     *
     * @param string|null $theme the cohort theme. The allowcohortthemes setting must be enabled on Moodle
     *
     * @return self
     */
    public function setTheme($theme)
    {
        if (is_null($theme)) {
            throw new \InvalidArgumentException('non-nullable theme cannot be null');
        }
        $this->container['theme'] = $theme;

        return $this;
    }

    /**
     * Gets visible
     *
     * @return bool|null
     */
    public function getVisible()
    {
        return $this->container['visible'];
    }

    /**
     * Sets visible
     *
     * @param bool|null $visible cohort visible
     *
     * @return self
     */
    public function setVisible($visible)
    {
        if (is_null($visible)) {
            throw new \InvalidArgumentException('non-nullable visible cannot be null');
        }
        $this->container['visible'] = $visible;

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


