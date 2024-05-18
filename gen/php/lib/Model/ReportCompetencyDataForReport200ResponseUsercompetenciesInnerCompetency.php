<?php
/**
 * ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
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
 * ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'report_competency_data_for_report_200_response_usercompetencies_inner_competency';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'competency' => '\OpenAPI\Client\Model\CoreCompetencyCreateCompetency200Response',
        'comppath' => '\OpenAPI\Client\Model\ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath',
        'framework' => '\OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFramework200Response',
        'hascourses' => 'bool',
        'hasrelatedcompetencies' => 'bool',
        'linkedcourses' => '\OpenAPI\Client\Model\CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner[]',
        'pluginbaseurl' => 'string',
        'relatedcompetencies' => '\OpenAPI\Client\Model\CoreCompetencyReadUserEvidence200ResponseCompetenciesInner[]',
        'scaleconfiguration' => 'string',
        'scaleid' => 'int',
        'taxonomyterm' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'competency' => null,
        'comppath' => null,
        'framework' => null,
        'hascourses' => null,
        'hasrelatedcompetencies' => null,
        'linkedcourses' => null,
        'pluginbaseurl' => null,
        'relatedcompetencies' => null,
        'scaleconfiguration' => null,
        'scaleid' => null,
        'taxonomyterm' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'competency' => false,
        'comppath' => false,
        'framework' => false,
        'hascourses' => false,
        'hasrelatedcompetencies' => false,
        'linkedcourses' => false,
        'pluginbaseurl' => false,
        'relatedcompetencies' => false,
        'scaleconfiguration' => false,
        'scaleid' => false,
        'taxonomyterm' => false
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
        'competency' => 'competency',
        'comppath' => 'comppath',
        'framework' => 'framework',
        'hascourses' => 'hascourses',
        'hasrelatedcompetencies' => 'hasrelatedcompetencies',
        'linkedcourses' => 'linkedcourses',
        'pluginbaseurl' => 'pluginbaseurl',
        'relatedcompetencies' => 'relatedcompetencies',
        'scaleconfiguration' => 'scaleconfiguration',
        'scaleid' => 'scaleid',
        'taxonomyterm' => 'taxonomyterm'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'competency' => 'setCompetency',
        'comppath' => 'setComppath',
        'framework' => 'setFramework',
        'hascourses' => 'setHascourses',
        'hasrelatedcompetencies' => 'setHasrelatedcompetencies',
        'linkedcourses' => 'setLinkedcourses',
        'pluginbaseurl' => 'setPluginbaseurl',
        'relatedcompetencies' => 'setRelatedcompetencies',
        'scaleconfiguration' => 'setScaleconfiguration',
        'scaleid' => 'setScaleid',
        'taxonomyterm' => 'setTaxonomyterm'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'competency' => 'getCompetency',
        'comppath' => 'getComppath',
        'framework' => 'getFramework',
        'hascourses' => 'getHascourses',
        'hasrelatedcompetencies' => 'getHasrelatedcompetencies',
        'linkedcourses' => 'getLinkedcourses',
        'pluginbaseurl' => 'getPluginbaseurl',
        'relatedcompetencies' => 'getRelatedcompetencies',
        'scaleconfiguration' => 'getScaleconfiguration',
        'scaleid' => 'getScaleid',
        'taxonomyterm' => 'getTaxonomyterm'
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
        $this->setIfExists('competency', $data ?? [], null);
        $this->setIfExists('comppath', $data ?? [], null);
        $this->setIfExists('framework', $data ?? [], null);
        $this->setIfExists('hascourses', $data ?? [], null);
        $this->setIfExists('hasrelatedcompetencies', $data ?? [], null);
        $this->setIfExists('linkedcourses', $data ?? [], null);
        $this->setIfExists('pluginbaseurl', $data ?? [], null);
        $this->setIfExists('relatedcompetencies', $data ?? [], null);
        $this->setIfExists('scaleconfiguration', $data ?? [], null);
        $this->setIfExists('scaleid', $data ?? [], null);
        $this->setIfExists('taxonomyterm', $data ?? [], 'null');
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

        if ($this->container['competency'] === null) {
            $invalidProperties[] = "'competency' can't be null";
        }
        if ($this->container['comppath'] === null) {
            $invalidProperties[] = "'comppath' can't be null";
        }
        if ($this->container['framework'] === null) {
            $invalidProperties[] = "'framework' can't be null";
        }
        if ($this->container['hascourses'] === null) {
            $invalidProperties[] = "'hascourses' can't be null";
        }
        if ($this->container['hasrelatedcompetencies'] === null) {
            $invalidProperties[] = "'hasrelatedcompetencies' can't be null";
        }
        if ($this->container['linkedcourses'] === null) {
            $invalidProperties[] = "'linkedcourses' can't be null";
        }
        if ($this->container['pluginbaseurl'] === null) {
            $invalidProperties[] = "'pluginbaseurl' can't be null";
        }
        if ($this->container['relatedcompetencies'] === null) {
            $invalidProperties[] = "'relatedcompetencies' can't be null";
        }
        if ($this->container['scaleconfiguration'] === null) {
            $invalidProperties[] = "'scaleconfiguration' can't be null";
        }
        if ($this->container['scaleid'] === null) {
            $invalidProperties[] = "'scaleid' can't be null";
        }
        if ($this->container['taxonomyterm'] === null) {
            $invalidProperties[] = "'taxonomyterm' can't be null";
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
     * Gets competency
     *
     * @return \OpenAPI\Client\Model\CoreCompetencyCreateCompetency200Response
     */
    public function getCompetency()
    {
        return $this->container['competency'];
    }

    /**
     * Sets competency
     *
     * @param \OpenAPI\Client\Model\CoreCompetencyCreateCompetency200Response $competency competency
     *
     * @return self
     */
    public function setCompetency($competency)
    {
        if (is_null($competency)) {
            throw new \InvalidArgumentException('non-nullable competency cannot be null');
        }
        $this->container['competency'] = $competency;

        return $this;
    }

    /**
     * Gets comppath
     *
     * @return \OpenAPI\Client\Model\ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath
     */
    public function getComppath()
    {
        return $this->container['comppath'];
    }

    /**
     * Sets comppath
     *
     * @param \OpenAPI\Client\Model\ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath $comppath comppath
     *
     * @return self
     */
    public function setComppath($comppath)
    {
        if (is_null($comppath)) {
            throw new \InvalidArgumentException('non-nullable comppath cannot be null');
        }
        $this->container['comppath'] = $comppath;

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
     * Gets hascourses
     *
     * @return bool
     */
    public function getHascourses()
    {
        return $this->container['hascourses'];
    }

    /**
     * Sets hascourses
     *
     * @param bool $hascourses hascourses
     *
     * @return self
     */
    public function setHascourses($hascourses)
    {
        if (is_null($hascourses)) {
            throw new \InvalidArgumentException('non-nullable hascourses cannot be null');
        }
        $this->container['hascourses'] = $hascourses;

        return $this;
    }

    /**
     * Gets hasrelatedcompetencies
     *
     * @return bool
     */
    public function getHasrelatedcompetencies()
    {
        return $this->container['hasrelatedcompetencies'];
    }

    /**
     * Sets hasrelatedcompetencies
     *
     * @param bool $hasrelatedcompetencies hasrelatedcompetencies
     *
     * @return self
     */
    public function setHasrelatedcompetencies($hasrelatedcompetencies)
    {
        if (is_null($hasrelatedcompetencies)) {
            throw new \InvalidArgumentException('non-nullable hasrelatedcompetencies cannot be null');
        }
        $this->container['hasrelatedcompetencies'] = $hasrelatedcompetencies;

        return $this;
    }

    /**
     * Gets linkedcourses
     *
     * @return \OpenAPI\Client\Model\CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner[]
     */
    public function getLinkedcourses()
    {
        return $this->container['linkedcourses'];
    }

    /**
     * Sets linkedcourses
     *
     * @param \OpenAPI\Client\Model\CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner[] $linkedcourses linkedcourses
     *
     * @return self
     */
    public function setLinkedcourses($linkedcourses)
    {
        if (is_null($linkedcourses)) {
            throw new \InvalidArgumentException('non-nullable linkedcourses cannot be null');
        }
        $this->container['linkedcourses'] = $linkedcourses;

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
     * @param string $pluginbaseurl pluginbaseurl
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
     * Gets relatedcompetencies
     *
     * @return \OpenAPI\Client\Model\CoreCompetencyReadUserEvidence200ResponseCompetenciesInner[]
     */
    public function getRelatedcompetencies()
    {
        return $this->container['relatedcompetencies'];
    }

    /**
     * Sets relatedcompetencies
     *
     * @param \OpenAPI\Client\Model\CoreCompetencyReadUserEvidence200ResponseCompetenciesInner[] $relatedcompetencies relatedcompetencies
     *
     * @return self
     */
    public function setRelatedcompetencies($relatedcompetencies)
    {
        if (is_null($relatedcompetencies)) {
            throw new \InvalidArgumentException('non-nullable relatedcompetencies cannot be null');
        }
        $this->container['relatedcompetencies'] = $relatedcompetencies;

        return $this;
    }

    /**
     * Gets scaleconfiguration
     *
     * @return string
     */
    public function getScaleconfiguration()
    {
        return $this->container['scaleconfiguration'];
    }

    /**
     * Sets scaleconfiguration
     *
     * @param string $scaleconfiguration scaleconfiguration
     *
     * @return self
     */
    public function setScaleconfiguration($scaleconfiguration)
    {
        if (is_null($scaleconfiguration)) {
            throw new \InvalidArgumentException('non-nullable scaleconfiguration cannot be null');
        }
        $this->container['scaleconfiguration'] = $scaleconfiguration;

        return $this;
    }

    /**
     * Gets scaleid
     *
     * @return int
     */
    public function getScaleid()
    {
        return $this->container['scaleid'];
    }

    /**
     * Sets scaleid
     *
     * @param int $scaleid scaleid
     *
     * @return self
     */
    public function setScaleid($scaleid)
    {
        if (is_null($scaleid)) {
            throw new \InvalidArgumentException('non-nullable scaleid cannot be null');
        }
        $this->container['scaleid'] = $scaleid;

        return $this;
    }

    /**
     * Gets taxonomyterm
     *
     * @return string
     */
    public function getTaxonomyterm()
    {
        return $this->container['taxonomyterm'];
    }

    /**
     * Sets taxonomyterm
     *
     * @param string $taxonomyterm taxonomyterm
     *
     * @return self
     */
    public function setTaxonomyterm($taxonomyterm)
    {
        if (is_null($taxonomyterm)) {
            throw new \InvalidArgumentException('non-nullable taxonomyterm cannot be null');
        }
        $this->container['taxonomyterm'] = $taxonomyterm;

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


