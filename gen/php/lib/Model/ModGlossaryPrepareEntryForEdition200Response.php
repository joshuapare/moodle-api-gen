<?php
/**
 * ModGlossaryPrepareEntryForEdition200Response
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
 * ModGlossaryPrepareEntryForEdition200Response Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModGlossaryPrepareEntryForEdition200Response implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_glossary_prepare_entry_for_edition_200_response';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'aliases' => 'object[]',
        'areas' => '\OpenAPI\Client\Model\ModGlossaryPrepareEntryForEdition200ResponseAreasInner[]',
        'attachmentsid' => 'int',
        'categories' => 'object[]',
        'inlineattachmentsid' => 'int',
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
        'aliases' => null,
        'areas' => null,
        'attachmentsid' => null,
        'categories' => null,
        'inlineattachmentsid' => null,
        'warnings' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'aliases' => false,
        'areas' => false,
        'attachmentsid' => false,
        'categories' => false,
        'inlineattachmentsid' => false,
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
        'aliases' => 'aliases',
        'areas' => 'areas',
        'attachmentsid' => 'attachmentsid',
        'categories' => 'categories',
        'inlineattachmentsid' => 'inlineattachmentsid',
        'warnings' => 'warnings'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'aliases' => 'setAliases',
        'areas' => 'setAreas',
        'attachmentsid' => 'setAttachmentsid',
        'categories' => 'setCategories',
        'inlineattachmentsid' => 'setInlineattachmentsid',
        'warnings' => 'setWarnings'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'aliases' => 'getAliases',
        'areas' => 'getAreas',
        'attachmentsid' => 'getAttachmentsid',
        'categories' => 'getCategories',
        'inlineattachmentsid' => 'getInlineattachmentsid',
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
        $this->setIfExists('aliases', $data ?? [], null);
        $this->setIfExists('areas', $data ?? [], null);
        $this->setIfExists('attachmentsid', $data ?? [], null);
        $this->setIfExists('categories', $data ?? [], null);
        $this->setIfExists('inlineattachmentsid', $data ?? [], null);
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

        if ($this->container['aliases'] === null) {
            $invalidProperties[] = "'aliases' can't be null";
        }
        if ($this->container['areas'] === null) {
            $invalidProperties[] = "'areas' can't be null";
        }
        if ($this->container['attachmentsid'] === null) {
            $invalidProperties[] = "'attachmentsid' can't be null";
        }
        if ($this->container['categories'] === null) {
            $invalidProperties[] = "'categories' can't be null";
        }
        if ($this->container['inlineattachmentsid'] === null) {
            $invalidProperties[] = "'inlineattachmentsid' can't be null";
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
     * Gets aliases
     *
     * @return object[]
     */
    public function getAliases()
    {
        return $this->container['aliases'];
    }

    /**
     * Sets aliases
     *
     * @param object[] $aliases aliases
     *
     * @return self
     */
    public function setAliases($aliases)
    {
        if (is_null($aliases)) {
            throw new \InvalidArgumentException('non-nullable aliases cannot be null');
        }
        $this->container['aliases'] = $aliases;

        return $this;
    }

    /**
     * Gets areas
     *
     * @return \OpenAPI\Client\Model\ModGlossaryPrepareEntryForEdition200ResponseAreasInner[]
     */
    public function getAreas()
    {
        return $this->container['areas'];
    }

    /**
     * Sets areas
     *
     * @param \OpenAPI\Client\Model\ModGlossaryPrepareEntryForEdition200ResponseAreasInner[] $areas areas
     *
     * @return self
     */
    public function setAreas($areas)
    {
        if (is_null($areas)) {
            throw new \InvalidArgumentException('non-nullable areas cannot be null');
        }
        $this->container['areas'] = $areas;

        return $this;
    }

    /**
     * Gets attachmentsid
     *
     * @return int
     */
    public function getAttachmentsid()
    {
        return $this->container['attachmentsid'];
    }

    /**
     * Sets attachmentsid
     *
     * @param int $attachmentsid Draft item id for the file manager.
     *
     * @return self
     */
    public function setAttachmentsid($attachmentsid)
    {
        if (is_null($attachmentsid)) {
            throw new \InvalidArgumentException('non-nullable attachmentsid cannot be null');
        }
        $this->container['attachmentsid'] = $attachmentsid;

        return $this;
    }

    /**
     * Gets categories
     *
     * @return object[]
     */
    public function getCategories()
    {
        return $this->container['categories'];
    }

    /**
     * Sets categories
     *
     * @param object[] $categories categories
     *
     * @return self
     */
    public function setCategories($categories)
    {
        if (is_null($categories)) {
            throw new \InvalidArgumentException('non-nullable categories cannot be null');
        }
        $this->container['categories'] = $categories;

        return $this;
    }

    /**
     * Gets inlineattachmentsid
     *
     * @return int
     */
    public function getInlineattachmentsid()
    {
        return $this->container['inlineattachmentsid'];
    }

    /**
     * Sets inlineattachmentsid
     *
     * @param int $inlineattachmentsid Draft item id for the text editor.
     *
     * @return self
     */
    public function setInlineattachmentsid($inlineattachmentsid)
    {
        if (is_null($inlineattachmentsid)) {
            throw new \InvalidArgumentException('non-nullable inlineattachmentsid cannot be null');
        }
        $this->container['inlineattachmentsid'] = $inlineattachmentsid;

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


