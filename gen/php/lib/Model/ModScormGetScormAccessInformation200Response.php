<?php
/**
 * ModScormGetScormAccessInformation200Response
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
 * ModScormGetScormAccessInformation200Response Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ModScormGetScormAccessInformation200Response implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'mod_scorm_get_scorm_access_information_200_response';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'canaddinstance' => 'bool',
        'candeleteownresponses' => 'bool',
        'candeleteresponses' => 'bool',
        'cansavetrack' => 'bool',
        'canskipview' => 'bool',
        'canviewreport' => 'bool',
        'canviewscores' => 'bool',
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
        'canaddinstance' => null,
        'candeleteownresponses' => null,
        'candeleteresponses' => null,
        'cansavetrack' => null,
        'canskipview' => null,
        'canviewreport' => null,
        'canviewscores' => null,
        'warnings' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'canaddinstance' => false,
        'candeleteownresponses' => false,
        'candeleteresponses' => false,
        'cansavetrack' => false,
        'canskipview' => false,
        'canviewreport' => false,
        'canviewscores' => false,
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
        'canaddinstance' => 'canaddinstance',
        'candeleteownresponses' => 'candeleteownresponses',
        'candeleteresponses' => 'candeleteresponses',
        'cansavetrack' => 'cansavetrack',
        'canskipview' => 'canskipview',
        'canviewreport' => 'canviewreport',
        'canviewscores' => 'canviewscores',
        'warnings' => 'warnings'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'canaddinstance' => 'setCanaddinstance',
        'candeleteownresponses' => 'setCandeleteownresponses',
        'candeleteresponses' => 'setCandeleteresponses',
        'cansavetrack' => 'setCansavetrack',
        'canskipview' => 'setCanskipview',
        'canviewreport' => 'setCanviewreport',
        'canviewscores' => 'setCanviewscores',
        'warnings' => 'setWarnings'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'canaddinstance' => 'getCanaddinstance',
        'candeleteownresponses' => 'getCandeleteownresponses',
        'candeleteresponses' => 'getCandeleteresponses',
        'cansavetrack' => 'getCansavetrack',
        'canskipview' => 'getCanskipview',
        'canviewreport' => 'getCanviewreport',
        'canviewscores' => 'getCanviewscores',
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
        $this->setIfExists('canaddinstance', $data ?? [], null);
        $this->setIfExists('candeleteownresponses', $data ?? [], null);
        $this->setIfExists('candeleteresponses', $data ?? [], null);
        $this->setIfExists('cansavetrack', $data ?? [], null);
        $this->setIfExists('canskipview', $data ?? [], null);
        $this->setIfExists('canviewreport', $data ?? [], null);
        $this->setIfExists('canviewscores', $data ?? [], null);
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
     * Gets canaddinstance
     *
     * @return bool|null
     */
    public function getCanaddinstance()
    {
        return $this->container['canaddinstance'];
    }

    /**
     * Sets canaddinstance
     *
     * @param bool|null $canaddinstance Whether the user has the capability mod/scorm:addinstance allowed.
     *
     * @return self
     */
    public function setCanaddinstance($canaddinstance)
    {
        if (is_null($canaddinstance)) {
            throw new \InvalidArgumentException('non-nullable canaddinstance cannot be null');
        }
        $this->container['canaddinstance'] = $canaddinstance;

        return $this;
    }

    /**
     * Gets candeleteownresponses
     *
     * @return bool|null
     */
    public function getCandeleteownresponses()
    {
        return $this->container['candeleteownresponses'];
    }

    /**
     * Sets candeleteownresponses
     *
     * @param bool|null $candeleteownresponses Whether the user has the capability mod/scorm:deleteownresponses allowed.
     *
     * @return self
     */
    public function setCandeleteownresponses($candeleteownresponses)
    {
        if (is_null($candeleteownresponses)) {
            throw new \InvalidArgumentException('non-nullable candeleteownresponses cannot be null');
        }
        $this->container['candeleteownresponses'] = $candeleteownresponses;

        return $this;
    }

    /**
     * Gets candeleteresponses
     *
     * @return bool|null
     */
    public function getCandeleteresponses()
    {
        return $this->container['candeleteresponses'];
    }

    /**
     * Sets candeleteresponses
     *
     * @param bool|null $candeleteresponses Whether the user has the capability mod/scorm:deleteresponses allowed.
     *
     * @return self
     */
    public function setCandeleteresponses($candeleteresponses)
    {
        if (is_null($candeleteresponses)) {
            throw new \InvalidArgumentException('non-nullable candeleteresponses cannot be null');
        }
        $this->container['candeleteresponses'] = $candeleteresponses;

        return $this;
    }

    /**
     * Gets cansavetrack
     *
     * @return bool|null
     */
    public function getCansavetrack()
    {
        return $this->container['cansavetrack'];
    }

    /**
     * Sets cansavetrack
     *
     * @param bool|null $cansavetrack Whether the user has the capability mod/scorm:savetrack allowed.
     *
     * @return self
     */
    public function setCansavetrack($cansavetrack)
    {
        if (is_null($cansavetrack)) {
            throw new \InvalidArgumentException('non-nullable cansavetrack cannot be null');
        }
        $this->container['cansavetrack'] = $cansavetrack;

        return $this;
    }

    /**
     * Gets canskipview
     *
     * @return bool|null
     */
    public function getCanskipview()
    {
        return $this->container['canskipview'];
    }

    /**
     * Sets canskipview
     *
     * @param bool|null $canskipview Whether the user has the capability mod/scorm:skipview allowed.
     *
     * @return self
     */
    public function setCanskipview($canskipview)
    {
        if (is_null($canskipview)) {
            throw new \InvalidArgumentException('non-nullable canskipview cannot be null');
        }
        $this->container['canskipview'] = $canskipview;

        return $this;
    }

    /**
     * Gets canviewreport
     *
     * @return bool|null
     */
    public function getCanviewreport()
    {
        return $this->container['canviewreport'];
    }

    /**
     * Sets canviewreport
     *
     * @param bool|null $canviewreport Whether the user has the capability mod/scorm:viewreport allowed.
     *
     * @return self
     */
    public function setCanviewreport($canviewreport)
    {
        if (is_null($canviewreport)) {
            throw new \InvalidArgumentException('non-nullable canviewreport cannot be null');
        }
        $this->container['canviewreport'] = $canviewreport;

        return $this;
    }

    /**
     * Gets canviewscores
     *
     * @return bool|null
     */
    public function getCanviewscores()
    {
        return $this->container['canviewscores'];
    }

    /**
     * Sets canviewscores
     *
     * @param bool|null $canviewscores Whether the user has the capability mod/scorm:viewscores allowed.
     *
     * @return self
     */
    public function setCanviewscores($canviewscores)
    {
        if (is_null($canviewscores)) {
            throw new \InvalidArgumentException('non-nullable canviewscores cannot be null');
        }
        $this->container['canviewscores'] = $canviewscores;

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

