<?php
/**
 * GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner
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
 * GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner Class Doc Comment
 *
 * @category Class
 * @description Grade items
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'gradereport_user_get_grade_items_200_response_usergrades_inner_gradeitems_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'averageformatted' => 'string',
        'categoryid' => 'int',
        'cmid' => 'int',
        'feedback' => 'string',
        'feedbackformat' => 'int',
        'gradedategraded' => 'int',
        'gradedatesubmitted' => 'int',
        'gradeformatted' => 'string',
        'gradehiddenbydate' => 'bool',
        'gradeishidden' => 'bool',
        'gradeislocked' => 'bool',
        'gradeisoverridden' => 'bool',
        'grademax' => 'float',
        'grademin' => 'float',
        'gradeneedsupdate' => 'bool',
        'graderaw' => 'float',
        'id' => 'int',
        'idnumber' => 'string',
        'iteminstance' => 'int',
        'itemmodule' => 'string',
        'itemname' => 'string',
        'itemnumber' => 'int',
        'itemtype' => 'string',
        'lettergradeformatted' => 'string',
        'locked' => 'bool',
        'numusers' => 'int',
        'outcomeid' => 'int',
        'percentageformatted' => 'string',
        'rangeformatted' => 'string',
        'rank' => 'int',
        'scaleid' => 'int',
        'status' => 'string',
        'weightformatted' => 'string',
        'weightraw' => 'float'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'averageformatted' => null,
        'categoryid' => null,
        'cmid' => null,
        'feedback' => null,
        'feedbackformat' => null,
        'gradedategraded' => null,
        'gradedatesubmitted' => null,
        'gradeformatted' => null,
        'gradehiddenbydate' => null,
        'gradeishidden' => null,
        'gradeislocked' => null,
        'gradeisoverridden' => null,
        'grademax' => null,
        'grademin' => null,
        'gradeneedsupdate' => null,
        'graderaw' => null,
        'id' => null,
        'idnumber' => null,
        'iteminstance' => null,
        'itemmodule' => null,
        'itemname' => null,
        'itemnumber' => null,
        'itemtype' => null,
        'lettergradeformatted' => null,
        'locked' => null,
        'numusers' => null,
        'outcomeid' => null,
        'percentageformatted' => null,
        'rangeformatted' => null,
        'rank' => null,
        'scaleid' => null,
        'status' => null,
        'weightformatted' => null,
        'weightraw' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'averageformatted' => false,
        'categoryid' => false,
        'cmid' => false,
        'feedback' => false,
        'feedbackformat' => false,
        'gradedategraded' => false,
        'gradedatesubmitted' => false,
        'gradeformatted' => false,
        'gradehiddenbydate' => false,
        'gradeishidden' => false,
        'gradeislocked' => false,
        'gradeisoverridden' => false,
        'grademax' => false,
        'grademin' => false,
        'gradeneedsupdate' => false,
        'graderaw' => false,
        'id' => false,
        'idnumber' => false,
        'iteminstance' => false,
        'itemmodule' => false,
        'itemname' => false,
        'itemnumber' => false,
        'itemtype' => false,
        'lettergradeformatted' => false,
        'locked' => false,
        'numusers' => false,
        'outcomeid' => false,
        'percentageformatted' => false,
        'rangeformatted' => false,
        'rank' => false,
        'scaleid' => false,
        'status' => false,
        'weightformatted' => false,
        'weightraw' => false
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
        'averageformatted' => 'averageformatted',
        'categoryid' => 'categoryid',
        'cmid' => 'cmid',
        'feedback' => 'feedback',
        'feedbackformat' => 'feedbackformat',
        'gradedategraded' => 'gradedategraded',
        'gradedatesubmitted' => 'gradedatesubmitted',
        'gradeformatted' => 'gradeformatted',
        'gradehiddenbydate' => 'gradehiddenbydate',
        'gradeishidden' => 'gradeishidden',
        'gradeislocked' => 'gradeislocked',
        'gradeisoverridden' => 'gradeisoverridden',
        'grademax' => 'grademax',
        'grademin' => 'grademin',
        'gradeneedsupdate' => 'gradeneedsupdate',
        'graderaw' => 'graderaw',
        'id' => 'id',
        'idnumber' => 'idnumber',
        'iteminstance' => 'iteminstance',
        'itemmodule' => 'itemmodule',
        'itemname' => 'itemname',
        'itemnumber' => 'itemnumber',
        'itemtype' => 'itemtype',
        'lettergradeformatted' => 'lettergradeformatted',
        'locked' => 'locked',
        'numusers' => 'numusers',
        'outcomeid' => 'outcomeid',
        'percentageformatted' => 'percentageformatted',
        'rangeformatted' => 'rangeformatted',
        'rank' => 'rank',
        'scaleid' => 'scaleid',
        'status' => 'status',
        'weightformatted' => 'weightformatted',
        'weightraw' => 'weightraw'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'averageformatted' => 'setAverageformatted',
        'categoryid' => 'setCategoryid',
        'cmid' => 'setCmid',
        'feedback' => 'setFeedback',
        'feedbackformat' => 'setFeedbackformat',
        'gradedategraded' => 'setGradedategraded',
        'gradedatesubmitted' => 'setGradedatesubmitted',
        'gradeformatted' => 'setGradeformatted',
        'gradehiddenbydate' => 'setGradehiddenbydate',
        'gradeishidden' => 'setGradeishidden',
        'gradeislocked' => 'setGradeislocked',
        'gradeisoverridden' => 'setGradeisoverridden',
        'grademax' => 'setGrademax',
        'grademin' => 'setGrademin',
        'gradeneedsupdate' => 'setGradeneedsupdate',
        'graderaw' => 'setGraderaw',
        'id' => 'setId',
        'idnumber' => 'setIdnumber',
        'iteminstance' => 'setIteminstance',
        'itemmodule' => 'setItemmodule',
        'itemname' => 'setItemname',
        'itemnumber' => 'setItemnumber',
        'itemtype' => 'setItemtype',
        'lettergradeformatted' => 'setLettergradeformatted',
        'locked' => 'setLocked',
        'numusers' => 'setNumusers',
        'outcomeid' => 'setOutcomeid',
        'percentageformatted' => 'setPercentageformatted',
        'rangeformatted' => 'setRangeformatted',
        'rank' => 'setRank',
        'scaleid' => 'setScaleid',
        'status' => 'setStatus',
        'weightformatted' => 'setWeightformatted',
        'weightraw' => 'setWeightraw'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'averageformatted' => 'getAverageformatted',
        'categoryid' => 'getCategoryid',
        'cmid' => 'getCmid',
        'feedback' => 'getFeedback',
        'feedbackformat' => 'getFeedbackformat',
        'gradedategraded' => 'getGradedategraded',
        'gradedatesubmitted' => 'getGradedatesubmitted',
        'gradeformatted' => 'getGradeformatted',
        'gradehiddenbydate' => 'getGradehiddenbydate',
        'gradeishidden' => 'getGradeishidden',
        'gradeislocked' => 'getGradeislocked',
        'gradeisoverridden' => 'getGradeisoverridden',
        'grademax' => 'getGrademax',
        'grademin' => 'getGrademin',
        'gradeneedsupdate' => 'getGradeneedsupdate',
        'graderaw' => 'getGraderaw',
        'id' => 'getId',
        'idnumber' => 'getIdnumber',
        'iteminstance' => 'getIteminstance',
        'itemmodule' => 'getItemmodule',
        'itemname' => 'getItemname',
        'itemnumber' => 'getItemnumber',
        'itemtype' => 'getItemtype',
        'lettergradeformatted' => 'getLettergradeformatted',
        'locked' => 'getLocked',
        'numusers' => 'getNumusers',
        'outcomeid' => 'getOutcomeid',
        'percentageformatted' => 'getPercentageformatted',
        'rangeformatted' => 'getRangeformatted',
        'rank' => 'getRank',
        'scaleid' => 'getScaleid',
        'status' => 'getStatus',
        'weightformatted' => 'getWeightformatted',
        'weightraw' => 'getWeightraw'
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
        $this->setIfExists('averageformatted', $data ?? [], 'null');
        $this->setIfExists('categoryid', $data ?? [], null);
        $this->setIfExists('cmid', $data ?? [], null);
        $this->setIfExists('feedback', $data ?? [], 'null');
        $this->setIfExists('feedbackformat', $data ?? [], null);
        $this->setIfExists('gradedategraded', $data ?? [], null);
        $this->setIfExists('gradedatesubmitted', $data ?? [], null);
        $this->setIfExists('gradeformatted', $data ?? [], 'null');
        $this->setIfExists('gradehiddenbydate', $data ?? [], null);
        $this->setIfExists('gradeishidden', $data ?? [], null);
        $this->setIfExists('gradeislocked', $data ?? [], null);
        $this->setIfExists('gradeisoverridden', $data ?? [], null);
        $this->setIfExists('grademax', $data ?? [], null);
        $this->setIfExists('grademin', $data ?? [], null);
        $this->setIfExists('gradeneedsupdate', $data ?? [], null);
        $this->setIfExists('graderaw', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('idnumber', $data ?? [], 'null');
        $this->setIfExists('iteminstance', $data ?? [], null);
        $this->setIfExists('itemmodule', $data ?? [], 'null');
        $this->setIfExists('itemname', $data ?? [], 'null');
        $this->setIfExists('itemnumber', $data ?? [], null);
        $this->setIfExists('itemtype', $data ?? [], 'null');
        $this->setIfExists('lettergradeformatted', $data ?? [], 'null');
        $this->setIfExists('locked', $data ?? [], null);
        $this->setIfExists('numusers', $data ?? [], null);
        $this->setIfExists('outcomeid', $data ?? [], null);
        $this->setIfExists('percentageformatted', $data ?? [], 'null');
        $this->setIfExists('rangeformatted', $data ?? [], 'null');
        $this->setIfExists('rank', $data ?? [], null);
        $this->setIfExists('scaleid', $data ?? [], null);
        $this->setIfExists('status', $data ?? [], 'null');
        $this->setIfExists('weightformatted', $data ?? [], 'null');
        $this->setIfExists('weightraw', $data ?? [], null);
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
     * Gets averageformatted
     *
     * @return string|null
     */
    public function getAverageformatted()
    {
        return $this->container['averageformatted'];
    }

    /**
     * Sets averageformatted
     *
     * @param string|null $averageformatted Grade average
     *
     * @return self
     */
    public function setAverageformatted($averageformatted)
    {
        if (is_null($averageformatted)) {
            throw new \InvalidArgumentException('non-nullable averageformatted cannot be null');
        }
        $this->container['averageformatted'] = $averageformatted;

        return $this;
    }

    /**
     * Gets categoryid
     *
     * @return int|null
     */
    public function getCategoryid()
    {
        return $this->container['categoryid'];
    }

    /**
     * Sets categoryid
     *
     * @param int|null $categoryid Grade item category id
     *
     * @return self
     */
    public function setCategoryid($categoryid)
    {
        if (is_null($categoryid)) {
            throw new \InvalidArgumentException('non-nullable categoryid cannot be null');
        }
        $this->container['categoryid'] = $categoryid;

        return $this;
    }

    /**
     * Gets cmid
     *
     * @return int|null
     */
    public function getCmid()
    {
        return $this->container['cmid'];
    }

    /**
     * Sets cmid
     *
     * @param int|null $cmid Course module id (if type mod)
     *
     * @return self
     */
    public function setCmid($cmid)
    {
        if (is_null($cmid)) {
            throw new \InvalidArgumentException('non-nullable cmid cannot be null');
        }
        $this->container['cmid'] = $cmid;

        return $this;
    }

    /**
     * Gets feedback
     *
     * @return string|null
     */
    public function getFeedback()
    {
        return $this->container['feedback'];
    }

    /**
     * Sets feedback
     *
     * @param string|null $feedback Grade feedback
     *
     * @return self
     */
    public function setFeedback($feedback)
    {
        if (is_null($feedback)) {
            throw new \InvalidArgumentException('non-nullable feedback cannot be null');
        }
        $this->container['feedback'] = $feedback;

        return $this;
    }

    /**
     * Gets feedbackformat
     *
     * @return int|null
     */
    public function getFeedbackformat()
    {
        return $this->container['feedbackformat'];
    }

    /**
     * Sets feedbackformat
     *
     * @param int|null $feedbackformat feedback format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     *
     * @return self
     */
    public function setFeedbackformat($feedbackformat)
    {
        if (is_null($feedbackformat)) {
            throw new \InvalidArgumentException('non-nullable feedbackformat cannot be null');
        }
        $this->container['feedbackformat'] = $feedbackformat;

        return $this;
    }

    /**
     * Gets gradedategraded
     *
     * @return int|null
     */
    public function getGradedategraded()
    {
        return $this->container['gradedategraded'];
    }

    /**
     * Sets gradedategraded
     *
     * @param int|null $gradedategraded Grade graded date
     *
     * @return self
     */
    public function setGradedategraded($gradedategraded)
    {
        if (is_null($gradedategraded)) {
            throw new \InvalidArgumentException('non-nullable gradedategraded cannot be null');
        }
        $this->container['gradedategraded'] = $gradedategraded;

        return $this;
    }

    /**
     * Gets gradedatesubmitted
     *
     * @return int|null
     */
    public function getGradedatesubmitted()
    {
        return $this->container['gradedatesubmitted'];
    }

    /**
     * Sets gradedatesubmitted
     *
     * @param int|null $gradedatesubmitted Grade submit date
     *
     * @return self
     */
    public function setGradedatesubmitted($gradedatesubmitted)
    {
        if (is_null($gradedatesubmitted)) {
            throw new \InvalidArgumentException('non-nullable gradedatesubmitted cannot be null');
        }
        $this->container['gradedatesubmitted'] = $gradedatesubmitted;

        return $this;
    }

    /**
     * Gets gradeformatted
     *
     * @return string|null
     */
    public function getGradeformatted()
    {
        return $this->container['gradeformatted'];
    }

    /**
     * Sets gradeformatted
     *
     * @param string|null $gradeformatted The grade formatted
     *
     * @return self
     */
    public function setGradeformatted($gradeformatted)
    {
        if (is_null($gradeformatted)) {
            throw new \InvalidArgumentException('non-nullable gradeformatted cannot be null');
        }
        $this->container['gradeformatted'] = $gradeformatted;

        return $this;
    }

    /**
     * Gets gradehiddenbydate
     *
     * @return bool|null
     */
    public function getGradehiddenbydate()
    {
        return $this->container['gradehiddenbydate'];
    }

    /**
     * Sets gradehiddenbydate
     *
     * @param bool|null $gradehiddenbydate Grade hidden by date?
     *
     * @return self
     */
    public function setGradehiddenbydate($gradehiddenbydate)
    {
        if (is_null($gradehiddenbydate)) {
            throw new \InvalidArgumentException('non-nullable gradehiddenbydate cannot be null');
        }
        $this->container['gradehiddenbydate'] = $gradehiddenbydate;

        return $this;
    }

    /**
     * Gets gradeishidden
     *
     * @return bool|null
     */
    public function getGradeishidden()
    {
        return $this->container['gradeishidden'];
    }

    /**
     * Sets gradeishidden
     *
     * @param bool|null $gradeishidden Grade is hidden?
     *
     * @return self
     */
    public function setGradeishidden($gradeishidden)
    {
        if (is_null($gradeishidden)) {
            throw new \InvalidArgumentException('non-nullable gradeishidden cannot be null');
        }
        $this->container['gradeishidden'] = $gradeishidden;

        return $this;
    }

    /**
     * Gets gradeislocked
     *
     * @return bool|null
     */
    public function getGradeislocked()
    {
        return $this->container['gradeislocked'];
    }

    /**
     * Sets gradeislocked
     *
     * @param bool|null $gradeislocked Grade is locked?
     *
     * @return self
     */
    public function setGradeislocked($gradeislocked)
    {
        if (is_null($gradeislocked)) {
            throw new \InvalidArgumentException('non-nullable gradeislocked cannot be null');
        }
        $this->container['gradeislocked'] = $gradeislocked;

        return $this;
    }

    /**
     * Gets gradeisoverridden
     *
     * @return bool|null
     */
    public function getGradeisoverridden()
    {
        return $this->container['gradeisoverridden'];
    }

    /**
     * Sets gradeisoverridden
     *
     * @param bool|null $gradeisoverridden Grade overridden?
     *
     * @return self
     */
    public function setGradeisoverridden($gradeisoverridden)
    {
        if (is_null($gradeisoverridden)) {
            throw new \InvalidArgumentException('non-nullable gradeisoverridden cannot be null');
        }
        $this->container['gradeisoverridden'] = $gradeisoverridden;

        return $this;
    }

    /**
     * Gets grademax
     *
     * @return float|null
     */
    public function getGrademax()
    {
        return $this->container['grademax'];
    }

    /**
     * Sets grademax
     *
     * @param float|null $grademax Grade max
     *
     * @return self
     */
    public function setGrademax($grademax)
    {
        if (is_null($grademax)) {
            throw new \InvalidArgumentException('non-nullable grademax cannot be null');
        }
        $this->container['grademax'] = $grademax;

        return $this;
    }

    /**
     * Gets grademin
     *
     * @return float|null
     */
    public function getGrademin()
    {
        return $this->container['grademin'];
    }

    /**
     * Sets grademin
     *
     * @param float|null $grademin Grade min
     *
     * @return self
     */
    public function setGrademin($grademin)
    {
        if (is_null($grademin)) {
            throw new \InvalidArgumentException('non-nullable grademin cannot be null');
        }
        $this->container['grademin'] = $grademin;

        return $this;
    }

    /**
     * Gets gradeneedsupdate
     *
     * @return bool|null
     */
    public function getGradeneedsupdate()
    {
        return $this->container['gradeneedsupdate'];
    }

    /**
     * Sets gradeneedsupdate
     *
     * @param bool|null $gradeneedsupdate Grade needs update?
     *
     * @return self
     */
    public function setGradeneedsupdate($gradeneedsupdate)
    {
        if (is_null($gradeneedsupdate)) {
            throw new \InvalidArgumentException('non-nullable gradeneedsupdate cannot be null');
        }
        $this->container['gradeneedsupdate'] = $gradeneedsupdate;

        return $this;
    }

    /**
     * Gets graderaw
     *
     * @return float|null
     */
    public function getGraderaw()
    {
        return $this->container['graderaw'];
    }

    /**
     * Sets graderaw
     *
     * @param float|null $graderaw Grade raw
     *
     * @return self
     */
    public function setGraderaw($graderaw)
    {
        if (is_null($graderaw)) {
            throw new \InvalidArgumentException('non-nullable graderaw cannot be null');
        }
        $this->container['graderaw'] = $graderaw;

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
     * @param int|null $id Grade item id
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
     * @param string|null $idnumber Grade item idnumber
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
     * Gets iteminstance
     *
     * @return int|null
     */
    public function getIteminstance()
    {
        return $this->container['iteminstance'];
    }

    /**
     * Sets iteminstance
     *
     * @param int|null $iteminstance Grade item instance
     *
     * @return self
     */
    public function setIteminstance($iteminstance)
    {
        if (is_null($iteminstance)) {
            throw new \InvalidArgumentException('non-nullable iteminstance cannot be null');
        }
        $this->container['iteminstance'] = $iteminstance;

        return $this;
    }

    /**
     * Gets itemmodule
     *
     * @return string|null
     */
    public function getItemmodule()
    {
        return $this->container['itemmodule'];
    }

    /**
     * Sets itemmodule
     *
     * @param string|null $itemmodule Grade item module
     *
     * @return self
     */
    public function setItemmodule($itemmodule)
    {
        if (is_null($itemmodule)) {
            throw new \InvalidArgumentException('non-nullable itemmodule cannot be null');
        }
        $this->container['itemmodule'] = $itemmodule;

        return $this;
    }

    /**
     * Gets itemname
     *
     * @return string|null
     */
    public function getItemname()
    {
        return $this->container['itemname'];
    }

    /**
     * Sets itemname
     *
     * @param string|null $itemname Grade item name
     *
     * @return self
     */
    public function setItemname($itemname)
    {
        if (is_null($itemname)) {
            throw new \InvalidArgumentException('non-nullable itemname cannot be null');
        }
        $this->container['itemname'] = $itemname;

        return $this;
    }

    /**
     * Gets itemnumber
     *
     * @return int|null
     */
    public function getItemnumber()
    {
        return $this->container['itemnumber'];
    }

    /**
     * Sets itemnumber
     *
     * @param int|null $itemnumber Grade item item number
     *
     * @return self
     */
    public function setItemnumber($itemnumber)
    {
        if (is_null($itemnumber)) {
            throw new \InvalidArgumentException('non-nullable itemnumber cannot be null');
        }
        $this->container['itemnumber'] = $itemnumber;

        return $this;
    }

    /**
     * Gets itemtype
     *
     * @return string|null
     */
    public function getItemtype()
    {
        return $this->container['itemtype'];
    }

    /**
     * Sets itemtype
     *
     * @param string|null $itemtype Grade item type
     *
     * @return self
     */
    public function setItemtype($itemtype)
    {
        if (is_null($itemtype)) {
            throw new \InvalidArgumentException('non-nullable itemtype cannot be null');
        }
        $this->container['itemtype'] = $itemtype;

        return $this;
    }

    /**
     * Gets lettergradeformatted
     *
     * @return string|null
     */
    public function getLettergradeformatted()
    {
        return $this->container['lettergradeformatted'];
    }

    /**
     * Sets lettergradeformatted
     *
     * @param string|null $lettergradeformatted Letter grade
     *
     * @return self
     */
    public function setLettergradeformatted($lettergradeformatted)
    {
        if (is_null($lettergradeformatted)) {
            throw new \InvalidArgumentException('non-nullable lettergradeformatted cannot be null');
        }
        $this->container['lettergradeformatted'] = $lettergradeformatted;

        return $this;
    }

    /**
     * Gets locked
     *
     * @return bool|null
     */
    public function getLocked()
    {
        return $this->container['locked'];
    }

    /**
     * Sets locked
     *
     * @param bool|null $locked Grade item for user locked?
     *
     * @return self
     */
    public function setLocked($locked)
    {
        if (is_null($locked)) {
            throw new \InvalidArgumentException('non-nullable locked cannot be null');
        }
        $this->container['locked'] = $locked;

        return $this;
    }

    /**
     * Gets numusers
     *
     * @return int|null
     */
    public function getNumusers()
    {
        return $this->container['numusers'];
    }

    /**
     * Sets numusers
     *
     * @param int|null $numusers Num users in course
     *
     * @return self
     */
    public function setNumusers($numusers)
    {
        if (is_null($numusers)) {
            throw new \InvalidArgumentException('non-nullable numusers cannot be null');
        }
        $this->container['numusers'] = $numusers;

        return $this;
    }

    /**
     * Gets outcomeid
     *
     * @return int|null
     */
    public function getOutcomeid()
    {
        return $this->container['outcomeid'];
    }

    /**
     * Sets outcomeid
     *
     * @param int|null $outcomeid Outcome id
     *
     * @return self
     */
    public function setOutcomeid($outcomeid)
    {
        if (is_null($outcomeid)) {
            throw new \InvalidArgumentException('non-nullable outcomeid cannot be null');
        }
        $this->container['outcomeid'] = $outcomeid;

        return $this;
    }

    /**
     * Gets percentageformatted
     *
     * @return string|null
     */
    public function getPercentageformatted()
    {
        return $this->container['percentageformatted'];
    }

    /**
     * Sets percentageformatted
     *
     * @param string|null $percentageformatted Percentage
     *
     * @return self
     */
    public function setPercentageformatted($percentageformatted)
    {
        if (is_null($percentageformatted)) {
            throw new \InvalidArgumentException('non-nullable percentageformatted cannot be null');
        }
        $this->container['percentageformatted'] = $percentageformatted;

        return $this;
    }

    /**
     * Gets rangeformatted
     *
     * @return string|null
     */
    public function getRangeformatted()
    {
        return $this->container['rangeformatted'];
    }

    /**
     * Sets rangeformatted
     *
     * @param string|null $rangeformatted Range formatted
     *
     * @return self
     */
    public function setRangeformatted($rangeformatted)
    {
        if (is_null($rangeformatted)) {
            throw new \InvalidArgumentException('non-nullable rangeformatted cannot be null');
        }
        $this->container['rangeformatted'] = $rangeformatted;

        return $this;
    }

    /**
     * Gets rank
     *
     * @return int|null
     */
    public function getRank()
    {
        return $this->container['rank'];
    }

    /**
     * Sets rank
     *
     * @param int|null $rank Rank in the course
     *
     * @return self
     */
    public function setRank($rank)
    {
        if (is_null($rank)) {
            throw new \InvalidArgumentException('non-nullable rank cannot be null');
        }
        $this->container['rank'] = $rank;

        return $this;
    }

    /**
     * Gets scaleid
     *
     * @return int|null
     */
    public function getScaleid()
    {
        return $this->container['scaleid'];
    }

    /**
     * Sets scaleid
     *
     * @param int|null $scaleid Scale id
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
     * @param string|null $status Status
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
     * Gets weightformatted
     *
     * @return string|null
     */
    public function getWeightformatted()
    {
        return $this->container['weightformatted'];
    }

    /**
     * Sets weightformatted
     *
     * @param string|null $weightformatted Weight
     *
     * @return self
     */
    public function setWeightformatted($weightformatted)
    {
        if (is_null($weightformatted)) {
            throw new \InvalidArgumentException('non-nullable weightformatted cannot be null');
        }
        $this->container['weightformatted'] = $weightformatted;

        return $this;
    }

    /**
     * Gets weightraw
     *
     * @return float|null
     */
    public function getWeightraw()
    {
        return $this->container['weightraw'];
    }

    /**
     * Sets weightraw
     *
     * @param float|null $weightraw Weight raw
     *
     * @return self
     */
    public function setWeightraw($weightraw)
    {
        if (is_null($weightraw)) {
            throw new \InvalidArgumentException('non-nullable weightraw cannot be null');
        }
        $this->container['weightraw'] = $weightraw;

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


