<?php
/**
 * CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner
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
 * CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'core_grading_save_definitions_request_areas_inner_definitions_inner_guide_guide_criteria_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'description' => 'string',
        'descriptionformat' => 'int',
        'descriptionmarkers' => 'string',
        'descriptionmarkersformat' => 'int',
        'id' => 'int',
        'maxscore' => 'float',
        'shortname' => 'string',
        'sortorder' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'description' => null,
        'descriptionformat' => null,
        'descriptionmarkers' => null,
        'descriptionmarkersformat' => null,
        'id' => null,
        'maxscore' => null,
        'shortname' => null,
        'sortorder' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'description' => false,
        'descriptionformat' => false,
        'descriptionmarkers' => false,
        'descriptionmarkersformat' => false,
        'id' => false,
        'maxscore' => false,
        'shortname' => false,
        'sortorder' => false
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
        'description' => 'description',
        'descriptionformat' => 'descriptionformat',
        'descriptionmarkers' => 'descriptionmarkers',
        'descriptionmarkersformat' => 'descriptionmarkersformat',
        'id' => 'id',
        'maxscore' => 'maxscore',
        'shortname' => 'shortname',
        'sortorder' => 'sortorder'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'description' => 'setDescription',
        'descriptionformat' => 'setDescriptionformat',
        'descriptionmarkers' => 'setDescriptionmarkers',
        'descriptionmarkersformat' => 'setDescriptionmarkersformat',
        'id' => 'setId',
        'maxscore' => 'setMaxscore',
        'shortname' => 'setShortname',
        'sortorder' => 'setSortorder'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'description' => 'getDescription',
        'descriptionformat' => 'getDescriptionformat',
        'descriptionmarkers' => 'getDescriptionmarkers',
        'descriptionmarkersformat' => 'getDescriptionmarkersformat',
        'id' => 'getId',
        'maxscore' => 'getMaxscore',
        'shortname' => 'getShortname',
        'sortorder' => 'getSortorder'
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
        $this->setIfExists('description', $data ?? [], null);
        $this->setIfExists('descriptionformat', $data ?? [], null);
        $this->setIfExists('descriptionmarkers', $data ?? [], null);
        $this->setIfExists('descriptionmarkersformat', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('maxscore', $data ?? [], null);
        $this->setIfExists('shortname', $data ?? [], null);
        $this->setIfExists('sortorder', $data ?? [], null);
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
     * @param string|null $description description
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
     * Gets descriptionmarkers
     *
     * @return string|null
     */
    public function getDescriptionmarkers()
    {
        return $this->container['descriptionmarkers'];
    }

    /**
     * Sets descriptionmarkers
     *
     * @param string|null $descriptionmarkers markers description
     *
     * @return self
     */
    public function setDescriptionmarkers($descriptionmarkers)
    {
        if (is_null($descriptionmarkers)) {
            throw new \InvalidArgumentException('non-nullable descriptionmarkers cannot be null');
        }
        $this->container['descriptionmarkers'] = $descriptionmarkers;

        return $this;
    }

    /**
     * Gets descriptionmarkersformat
     *
     * @return int|null
     */
    public function getDescriptionmarkersformat()
    {
        return $this->container['descriptionmarkersformat'];
    }

    /**
     * Sets descriptionmarkersformat
     *
     * @param int|null $descriptionmarkersformat descriptionmarkers format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     *
     * @return self
     */
    public function setDescriptionmarkersformat($descriptionmarkersformat)
    {
        if (is_null($descriptionmarkersformat)) {
            throw new \InvalidArgumentException('non-nullable descriptionmarkersformat cannot be null');
        }
        $this->container['descriptionmarkersformat'] = $descriptionmarkersformat;

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
     * @param int|null $id criterion id
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
     * @return float|null
     */
    public function getMaxscore()
    {
        return $this->container['maxscore'];
    }

    /**
     * Sets maxscore
     *
     * @param float|null $maxscore maximum score
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
     * Gets shortname
     *
     * @return string|null
     */
    public function getShortname()
    {
        return $this->container['shortname'];
    }

    /**
     * Sets shortname
     *
     * @param string|null $shortname description
     *
     * @return self
     */
    public function setShortname($shortname)
    {
        if (is_null($shortname)) {
            throw new \InvalidArgumentException('non-nullable shortname cannot be null');
        }
        $this->container['shortname'] = $shortname;

        return $this;
    }

    /**
     * Gets sortorder
     *
     * @return int|null
     */
    public function getSortorder()
    {
        return $this->container['sortorder'];
    }

    /**
     * Sets sortorder
     *
     * @param int|null $sortorder sortorder
     *
     * @return self
     */
    public function setSortorder($sortorder)
    {
        if (is_null($sortorder)) {
            throw new \InvalidArgumentException('non-nullable sortorder cannot be null');
        }
        $this->container['sortorder'] = $sortorder;

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


