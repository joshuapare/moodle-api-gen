<?php
/**
 * BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense
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
 * BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'block_iomad_company_admin_get_license_from_id_200_response_license';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'allallocated' => 'bool',
        'allocation' => 'int',
        'companyid' => 'int',
        'expirydate' => 'int',
        'id' => 'int',
        'instant' => 'bool',
        'name' => 'string',
        'parentid' => 'int',
        'program' => 'bool',
        'reference' => 'string',
        'startdate' => 'int',
        'type' => 'int',
        'used' => 'int',
        'validlength' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'allallocated' => null,
        'allocation' => null,
        'companyid' => null,
        'expirydate' => null,
        'id' => null,
        'instant' => null,
        'name' => null,
        'parentid' => null,
        'program' => null,
        'reference' => null,
        'startdate' => null,
        'type' => null,
        'used' => null,
        'validlength' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'allallocated' => false,
        'allocation' => false,
        'companyid' => false,
        'expirydate' => false,
        'id' => false,
        'instant' => false,
        'name' => false,
        'parentid' => false,
        'program' => false,
        'reference' => false,
        'startdate' => false,
        'type' => false,
        'used' => false,
        'validlength' => false
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
        'allallocated' => 'allallocated',
        'allocation' => 'allocation',
        'companyid' => 'companyid',
        'expirydate' => 'expirydate',
        'id' => 'id',
        'instant' => 'instant',
        'name' => 'name',
        'parentid' => 'parentid',
        'program' => 'program',
        'reference' => 'reference',
        'startdate' => 'startdate',
        'type' => 'type',
        'used' => 'used',
        'validlength' => 'validlength'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'allallocated' => 'setAllallocated',
        'allocation' => 'setAllocation',
        'companyid' => 'setCompanyid',
        'expirydate' => 'setExpirydate',
        'id' => 'setId',
        'instant' => 'setInstant',
        'name' => 'setName',
        'parentid' => 'setParentid',
        'program' => 'setProgram',
        'reference' => 'setReference',
        'startdate' => 'setStartdate',
        'type' => 'setType',
        'used' => 'setUsed',
        'validlength' => 'setValidlength'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'allallocated' => 'getAllallocated',
        'allocation' => 'getAllocation',
        'companyid' => 'getCompanyid',
        'expirydate' => 'getExpirydate',
        'id' => 'getId',
        'instant' => 'getInstant',
        'name' => 'getName',
        'parentid' => 'getParentid',
        'program' => 'getProgram',
        'reference' => 'getReference',
        'startdate' => 'getStartdate',
        'type' => 'getType',
        'used' => 'getUsed',
        'validlength' => 'getValidlength'
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
        $this->setIfExists('allallocated', $data ?? [], null);
        $this->setIfExists('allocation', $data ?? [], null);
        $this->setIfExists('companyid', $data ?? [], null);
        $this->setIfExists('expirydate', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('instant', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('parentid', $data ?? [], null);
        $this->setIfExists('program', $data ?? [], null);
        $this->setIfExists('reference', $data ?? [], 'null');
        $this->setIfExists('startdate', $data ?? [], null);
        $this->setIfExists('type', $data ?? [], null);
        $this->setIfExists('used', $data ?? [], null);
        $this->setIfExists('validlength', $data ?? [], null);
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

        if ($this->container['allallocated'] === null) {
            $invalidProperties[] = "'allallocated' can't be null";
        }
        if ($this->container['allocation'] === null) {
            $invalidProperties[] = "'allocation' can't be null";
        }
        if ($this->container['companyid'] === null) {
            $invalidProperties[] = "'companyid' can't be null";
        }
        if ($this->container['expirydate'] === null) {
            $invalidProperties[] = "'expirydate' can't be null";
        }
        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['instant'] === null) {
            $invalidProperties[] = "'instant' can't be null";
        }
        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        if ($this->container['parentid'] === null) {
            $invalidProperties[] = "'parentid' can't be null";
        }
        if ($this->container['program'] === null) {
            $invalidProperties[] = "'program' can't be null";
        }
        if ($this->container['reference'] === null) {
            $invalidProperties[] = "'reference' can't be null";
        }
        if ($this->container['startdate'] === null) {
            $invalidProperties[] = "'startdate' can't be null";
        }
        if ($this->container['type'] === null) {
            $invalidProperties[] = "'type' can't be null";
        }
        if ($this->container['used'] === null) {
            $invalidProperties[] = "'used' can't be null";
        }
        if ($this->container['validlength'] === null) {
            $invalidProperties[] = "'validlength' can't be null";
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
     * Gets allallocated
     *
     * @return bool
     */
    public function getAllallocated()
    {
        return $this->container['allallocated'];
    }

    /**
     * Sets allallocated
     *
     * @param bool $allallocated All licenses allocated
     *
     * @return self
     */
    public function setAllallocated($allallocated)
    {
        if (is_null($allallocated)) {
            throw new \InvalidArgumentException('non-nullable allallocated cannot be null');
        }
        $this->container['allallocated'] = $allallocated;

        return $this;
    }

    /**
     * Gets allocation
     *
     * @return int
     */
    public function getAllocation()
    {
        return $this->container['allocation'];
    }

    /**
     * Sets allocation
     *
     * @param int $allocation Allocation
     *
     * @return self
     */
    public function setAllocation($allocation)
    {
        if (is_null($allocation)) {
            throw new \InvalidArgumentException('non-nullable allocation cannot be null');
        }
        $this->container['allocation'] = $allocation;

        return $this;
    }

    /**
     * Gets companyid
     *
     * @return int
     */
    public function getCompanyid()
    {
        return $this->container['companyid'];
    }

    /**
     * Sets companyid
     *
     * @param int $companyid Company ID
     *
     * @return self
     */
    public function setCompanyid($companyid)
    {
        if (is_null($companyid)) {
            throw new \InvalidArgumentException('non-nullable companyid cannot be null');
        }
        $this->container['companyid'] = $companyid;

        return $this;
    }

    /**
     * Gets expirydate
     *
     * @return int
     */
    public function getExpirydate()
    {
        return $this->container['expirydate'];
    }

    /**
     * Sets expirydate
     *
     * @param int $expirydate Expiry date
     *
     * @return self
     */
    public function setExpirydate($expirydate)
    {
        if (is_null($expirydate)) {
            throw new \InvalidArgumentException('non-nullable expirydate cannot be null');
        }
        $this->container['expirydate'] = $expirydate;

        return $this;
    }

    /**
     * Gets id
     *
     * @return int
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int $id License ID
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
     * Gets instant
     *
     * @return bool
     */
    public function getInstant()
    {
        return $this->container['instant'];
    }

    /**
     * Sets instant
     *
     * @param bool $instant Instant
     *
     * @return self
     */
    public function setInstant($instant)
    {
        if (is_null($instant)) {
            throw new \InvalidArgumentException('non-nullable instant cannot be null');
        }
        $this->container['instant'] = $instant;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string $name License name
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
     * Gets parentid
     *
     * @return int
     */
    public function getParentid()
    {
        return $this->container['parentid'];
    }

    /**
     * Sets parentid
     *
     * @param int $parentid Parent ID
     *
     * @return self
     */
    public function setParentid($parentid)
    {
        if (is_null($parentid)) {
            throw new \InvalidArgumentException('non-nullable parentid cannot be null');
        }
        $this->container['parentid'] = $parentid;

        return $this;
    }

    /**
     * Gets program
     *
     * @return bool
     */
    public function getProgram()
    {
        return $this->container['program'];
    }

    /**
     * Sets program
     *
     * @param bool $program Program
     *
     * @return self
     */
    public function setProgram($program)
    {
        if (is_null($program)) {
            throw new \InvalidArgumentException('non-nullable program cannot be null');
        }
        $this->container['program'] = $program;

        return $this;
    }

    /**
     * Gets reference
     *
     * @return string
     */
    public function getReference()
    {
        return $this->container['reference'];
    }

    /**
     * Sets reference
     *
     * @param string $reference Reference
     *
     * @return self
     */
    public function setReference($reference)
    {
        if (is_null($reference)) {
            throw new \InvalidArgumentException('non-nullable reference cannot be null');
        }
        $this->container['reference'] = $reference;

        return $this;
    }

    /**
     * Gets startdate
     *
     * @return int
     */
    public function getStartdate()
    {
        return $this->container['startdate'];
    }

    /**
     * Sets startdate
     *
     * @param int $startdate Start date
     *
     * @return self
     */
    public function setStartdate($startdate)
    {
        if (is_null($startdate)) {
            throw new \InvalidArgumentException('non-nullable startdate cannot be null');
        }
        $this->container['startdate'] = $startdate;

        return $this;
    }

    /**
     * Gets type
     *
     * @return int
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     *
     * @param int $type License type - 0 = standard, 1 = reusable, 2 = standard educator, 3 = reusable educator
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
     * Gets used
     *
     * @return int
     */
    public function getUsed()
    {
        return $this->container['used'];
    }

    /**
     * Sets used
     *
     * @param int $used Used
     *
     * @return self
     */
    public function setUsed($used)
    {
        if (is_null($used)) {
            throw new \InvalidArgumentException('non-nullable used cannot be null');
        }
        $this->container['used'] = $used;

        return $this;
    }

    /**
     * Gets validlength
     *
     * @return int
     */
    public function getValidlength()
    {
        return $this->container['validlength'];
    }

    /**
     * Sets validlength
     *
     * @param int $validlength Valid length
     *
     * @return self
     */
    public function setValidlength($validlength)
    {
        if (is_null($validlength)) {
            throw new \InvalidArgumentException('non-nullable validlength cannot be null');
        }
        $this->container['validlength'] = $validlength;

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

