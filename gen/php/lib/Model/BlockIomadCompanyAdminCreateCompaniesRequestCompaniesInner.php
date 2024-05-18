<?php
/**
 * BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner
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
 * BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'block_iomad_company_admin_create_companies_request_companies_inner';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'address' => 'string',
        'autosubscribe' => 'int',
        'city' => 'string',
        'code' => 'string',
        'companyterminated' => 'int',
        'country' => 'string',
        'custom1' => 'string',
        'custom2' => 'string',
        'custom3' => 'string',
        'customcss' => 'string',
        'ecommerce' => 'int',
        'headingcolor' => 'string',
        'hostname' => 'string',
        'htmleditor' => 'int',
        'lang' => 'string',
        'linkcolor' => 'string',
        'maildigest' => 'int',
        'maildisplay' => 'int',
        'mailformat' => 'int',
        'maincolor' => 'string',
        'maxusers' => 'int',
        'name' => 'string',
        'parentid' => 'int',
        'postcode' => 'string',
        'region' => 'string',
        'screenreader' => 'int',
        'shortname' => 'string',
        'suspendafter' => 'int',
        'suspended' => 'int',
        'theme' => 'string',
        'timezone' => 'string',
        'trackforums' => 'int',
        'validto' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'address' => null,
        'autosubscribe' => null,
        'city' => null,
        'code' => null,
        'companyterminated' => null,
        'country' => null,
        'custom1' => null,
        'custom2' => null,
        'custom3' => null,
        'customcss' => null,
        'ecommerce' => null,
        'headingcolor' => null,
        'hostname' => null,
        'htmleditor' => null,
        'lang' => null,
        'linkcolor' => null,
        'maildigest' => null,
        'maildisplay' => null,
        'mailformat' => null,
        'maincolor' => null,
        'maxusers' => null,
        'name' => null,
        'parentid' => null,
        'postcode' => null,
        'region' => null,
        'screenreader' => null,
        'shortname' => null,
        'suspendafter' => null,
        'suspended' => null,
        'theme' => null,
        'timezone' => null,
        'trackforums' => null,
        'validto' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'address' => false,
        'autosubscribe' => false,
        'city' => false,
        'code' => false,
        'companyterminated' => false,
        'country' => false,
        'custom1' => false,
        'custom2' => false,
        'custom3' => false,
        'customcss' => false,
        'ecommerce' => false,
        'headingcolor' => false,
        'hostname' => false,
        'htmleditor' => false,
        'lang' => false,
        'linkcolor' => false,
        'maildigest' => false,
        'maildisplay' => false,
        'mailformat' => false,
        'maincolor' => false,
        'maxusers' => false,
        'name' => false,
        'parentid' => false,
        'postcode' => false,
        'region' => false,
        'screenreader' => false,
        'shortname' => false,
        'suspendafter' => false,
        'suspended' => false,
        'theme' => false,
        'timezone' => false,
        'trackforums' => false,
        'validto' => false
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
        'address' => 'address',
        'autosubscribe' => 'autosubscribe',
        'city' => 'city',
        'code' => 'code',
        'companyterminated' => 'companyterminated',
        'country' => 'country',
        'custom1' => 'custom1',
        'custom2' => 'custom2',
        'custom3' => 'custom3',
        'customcss' => 'customcss',
        'ecommerce' => 'ecommerce',
        'headingcolor' => 'headingcolor',
        'hostname' => 'hostname',
        'htmleditor' => 'htmleditor',
        'lang' => 'lang',
        'linkcolor' => 'linkcolor',
        'maildigest' => 'maildigest',
        'maildisplay' => 'maildisplay',
        'mailformat' => 'mailformat',
        'maincolor' => 'maincolor',
        'maxusers' => 'maxusers',
        'name' => 'name',
        'parentid' => 'parentid',
        'postcode' => 'postcode',
        'region' => 'region',
        'screenreader' => 'screenreader',
        'shortname' => 'shortname',
        'suspendafter' => 'suspendafter',
        'suspended' => 'suspended',
        'theme' => 'theme',
        'timezone' => 'timezone',
        'trackforums' => 'trackforums',
        'validto' => 'validto'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'address' => 'setAddress',
        'autosubscribe' => 'setAutosubscribe',
        'city' => 'setCity',
        'code' => 'setCode',
        'companyterminated' => 'setCompanyterminated',
        'country' => 'setCountry',
        'custom1' => 'setCustom1',
        'custom2' => 'setCustom2',
        'custom3' => 'setCustom3',
        'customcss' => 'setCustomcss',
        'ecommerce' => 'setEcommerce',
        'headingcolor' => 'setHeadingcolor',
        'hostname' => 'setHostname',
        'htmleditor' => 'setHtmleditor',
        'lang' => 'setLang',
        'linkcolor' => 'setLinkcolor',
        'maildigest' => 'setMaildigest',
        'maildisplay' => 'setMaildisplay',
        'mailformat' => 'setMailformat',
        'maincolor' => 'setMaincolor',
        'maxusers' => 'setMaxusers',
        'name' => 'setName',
        'parentid' => 'setParentid',
        'postcode' => 'setPostcode',
        'region' => 'setRegion',
        'screenreader' => 'setScreenreader',
        'shortname' => 'setShortname',
        'suspendafter' => 'setSuspendafter',
        'suspended' => 'setSuspended',
        'theme' => 'setTheme',
        'timezone' => 'setTimezone',
        'trackforums' => 'setTrackforums',
        'validto' => 'setValidto'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'address' => 'getAddress',
        'autosubscribe' => 'getAutosubscribe',
        'city' => 'getCity',
        'code' => 'getCode',
        'companyterminated' => 'getCompanyterminated',
        'country' => 'getCountry',
        'custom1' => 'getCustom1',
        'custom2' => 'getCustom2',
        'custom3' => 'getCustom3',
        'customcss' => 'getCustomcss',
        'ecommerce' => 'getEcommerce',
        'headingcolor' => 'getHeadingcolor',
        'hostname' => 'getHostname',
        'htmleditor' => 'getHtmleditor',
        'lang' => 'getLang',
        'linkcolor' => 'getLinkcolor',
        'maildigest' => 'getMaildigest',
        'maildisplay' => 'getMaildisplay',
        'mailformat' => 'getMailformat',
        'maincolor' => 'getMaincolor',
        'maxusers' => 'getMaxusers',
        'name' => 'getName',
        'parentid' => 'getParentid',
        'postcode' => 'getPostcode',
        'region' => 'getRegion',
        'screenreader' => 'getScreenreader',
        'shortname' => 'getShortname',
        'suspendafter' => 'getSuspendafter',
        'suspended' => 'getSuspended',
        'theme' => 'getTheme',
        'timezone' => 'getTimezone',
        'trackforums' => 'getTrackforums',
        'validto' => 'getValidto'
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
        $this->setIfExists('address', $data ?? [], 'null');
        $this->setIfExists('autosubscribe', $data ?? [], 1);
        $this->setIfExists('city', $data ?? [], 'null');
        $this->setIfExists('code', $data ?? [], '');
        $this->setIfExists('companyterminated', $data ?? [], 0);
        $this->setIfExists('country', $data ?? [], 'null');
        $this->setIfExists('custom1', $data ?? [], 'null');
        $this->setIfExists('custom2', $data ?? [], 'null');
        $this->setIfExists('custom3', $data ?? [], 'null');
        $this->setIfExists('customcss', $data ?? [], '');
        $this->setIfExists('ecommerce', $data ?? [], 0);
        $this->setIfExists('headingcolor', $data ?? [], '');
        $this->setIfExists('hostname', $data ?? [], '');
        $this->setIfExists('htmleditor', $data ?? [], 1);
        $this->setIfExists('lang', $data ?? [], 'en');
        $this->setIfExists('linkcolor', $data ?? [], '');
        $this->setIfExists('maildigest', $data ?? [], 0);
        $this->setIfExists('maildisplay', $data ?? [], 2);
        $this->setIfExists('mailformat', $data ?? [], 1);
        $this->setIfExists('maincolor', $data ?? [], '');
        $this->setIfExists('maxusers', $data ?? [], 0);
        $this->setIfExists('name', $data ?? [], 'null');
        $this->setIfExists('parentid', $data ?? [], 0);
        $this->setIfExists('postcode', $data ?? [], 'null');
        $this->setIfExists('region', $data ?? [], 'null');
        $this->setIfExists('screenreader', $data ?? [], 0);
        $this->setIfExists('shortname', $data ?? [], 'null');
        $this->setIfExists('suspendafter', $data ?? [], 0);
        $this->setIfExists('suspended', $data ?? [], 0);
        $this->setIfExists('theme', $data ?? [], '');
        $this->setIfExists('timezone', $data ?? [], '99');
        $this->setIfExists('trackforums', $data ?? [], 0);
        $this->setIfExists('validto', $data ?? [], null);
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
     * Gets address
     *
     * @return string|null
     */
    public function getAddress()
    {
        return $this->container['address'];
    }

    /**
     * Sets address
     *
     * @param string|null $address Company location address
     *
     * @return self
     */
    public function setAddress($address)
    {
        if (is_null($address)) {
            throw new \InvalidArgumentException('non-nullable address cannot be null');
        }
        $this->container['address'] = $address;

        return $this;
    }

    /**
     * Gets autosubscribe
     *
     * @return int|null
     */
    public function getAutosubscribe()
    {
        return $this->container['autosubscribe'];
    }

    /**
     * Sets autosubscribe
     *
     * @param int|null $autosubscribe User default forum auto-subscribe
     *
     * @return self
     */
    public function setAutosubscribe($autosubscribe)
    {
        if (is_null($autosubscribe)) {
            throw new \InvalidArgumentException('non-nullable autosubscribe cannot be null');
        }
        $this->container['autosubscribe'] = $autosubscribe;

        return $this;
    }

    /**
     * Gets city
     *
     * @return string|null
     */
    public function getCity()
    {
        return $this->container['city'];
    }

    /**
     * Sets city
     *
     * @param string|null $city Company location city
     *
     * @return self
     */
    public function setCity($city)
    {
        if (is_null($city)) {
            throw new \InvalidArgumentException('non-nullable city cannot be null');
        }
        $this->container['city'] = $city;

        return $this;
    }

    /**
     * Gets code
     *
     * @return string|null
     */
    public function getCode()
    {
        return $this->container['code'];
    }

    /**
     * Sets code
     *
     * @param string|null $code Company code
     *
     * @return self
     */
    public function setCode($code)
    {
        if (is_null($code)) {
            throw new \InvalidArgumentException('non-nullable code cannot be null');
        }
        $this->container['code'] = $code;

        return $this;
    }

    /**
     * Gets companyterminated
     *
     * @return int|null
     */
    public function getCompanyterminated()
    {
        return $this->container['companyterminated'];
    }

    /**
     * Sets companyterminated
     *
     * @param int|null $companyterminated Company contract is terminated when <> 0
     *
     * @return self
     */
    public function setCompanyterminated($companyterminated)
    {
        if (is_null($companyterminated)) {
            throw new \InvalidArgumentException('non-nullable companyterminated cannot be null');
        }
        $this->container['companyterminated'] = $companyterminated;

        return $this;
    }

    /**
     * Gets country
     *
     * @return string|null
     */
    public function getCountry()
    {
        return $this->container['country'];
    }

    /**
     * Sets country
     *
     * @param string|null $country Company location country
     *
     * @return self
     */
    public function setCountry($country)
    {
        if (is_null($country)) {
            throw new \InvalidArgumentException('non-nullable country cannot be null');
        }
        $this->container['country'] = $country;

        return $this;
    }

    /**
     * Gets custom1
     *
     * @return string|null
     */
    public function getCustom1()
    {
        return $this->container['custom1'];
    }

    /**
     * Sets custom1
     *
     * @param string|null $custom1 Company custom 1
     *
     * @return self
     */
    public function setCustom1($custom1)
    {
        if (is_null($custom1)) {
            throw new \InvalidArgumentException('non-nullable custom1 cannot be null');
        }
        $this->container['custom1'] = $custom1;

        return $this;
    }

    /**
     * Gets custom2
     *
     * @return string|null
     */
    public function getCustom2()
    {
        return $this->container['custom2'];
    }

    /**
     * Sets custom2
     *
     * @param string|null $custom2 Company custom 2
     *
     * @return self
     */
    public function setCustom2($custom2)
    {
        if (is_null($custom2)) {
            throw new \InvalidArgumentException('non-nullable custom2 cannot be null');
        }
        $this->container['custom2'] = $custom2;

        return $this;
    }

    /**
     * Gets custom3
     *
     * @return string|null
     */
    public function getCustom3()
    {
        return $this->container['custom3'];
    }

    /**
     * Sets custom3
     *
     * @param string|null $custom3 Company custom 3
     *
     * @return self
     */
    public function setCustom3($custom3)
    {
        if (is_null($custom3)) {
            throw new \InvalidArgumentException('non-nullable custom3 cannot be null');
        }
        $this->container['custom3'] = $custom3;

        return $this;
    }

    /**
     * Gets customcss
     *
     * @return string|null
     */
    public function getCustomcss()
    {
        return $this->container['customcss'];
    }

    /**
     * Sets customcss
     *
     * @param string|null $customcss Company custom css
     *
     * @return self
     */
    public function setCustomcss($customcss)
    {
        if (is_null($customcss)) {
            throw new \InvalidArgumentException('non-nullable customcss cannot be null');
        }
        $this->container['customcss'] = $customcss;

        return $this;
    }

    /**
     * Gets ecommerce
     *
     * @return int|null
     */
    public function getEcommerce()
    {
        return $this->container['ecommerce'];
    }

    /**
     * Sets ecommerce
     *
     * @param int|null $ecommerce Ecommerce is disabled when = 0
     *
     * @return self
     */
    public function setEcommerce($ecommerce)
    {
        if (is_null($ecommerce)) {
            throw new \InvalidArgumentException('non-nullable ecommerce cannot be null');
        }
        $this->container['ecommerce'] = $ecommerce;

        return $this;
    }

    /**
     * Gets headingcolor
     *
     * @return string|null
     */
    public function getHeadingcolor()
    {
        return $this->container['headingcolor'];
    }

    /**
     * Sets headingcolor
     *
     * @param string|null $headingcolor Company heading color
     *
     * @return self
     */
    public function setHeadingcolor($headingcolor)
    {
        if (is_null($headingcolor)) {
            throw new \InvalidArgumentException('non-nullable headingcolor cannot be null');
        }
        $this->container['headingcolor'] = $headingcolor;

        return $this;
    }

    /**
     * Gets hostname
     *
     * @return string|null
     */
    public function getHostname()
    {
        return $this->container['hostname'];
    }

    /**
     * Sets hostname
     *
     * @param string|null $hostname Company hostname
     *
     * @return self
     */
    public function setHostname($hostname)
    {
        if (is_null($hostname)) {
            throw new \InvalidArgumentException('non-nullable hostname cannot be null');
        }
        $this->container['hostname'] = $hostname;

        return $this;
    }

    /**
     * Gets htmleditor
     *
     * @return int|null
     */
    public function getHtmleditor()
    {
        return $this->container['htmleditor'];
    }

    /**
     * Sets htmleditor
     *
     * @param int|null $htmleditor User default text editor
     *
     * @return self
     */
    public function setHtmleditor($htmleditor)
    {
        if (is_null($htmleditor)) {
            throw new \InvalidArgumentException('non-nullable htmleditor cannot be null');
        }
        $this->container['htmleditor'] = $htmleditor;

        return $this;
    }

    /**
     * Gets lang
     *
     * @return string|null
     */
    public function getLang()
    {
        return $this->container['lang'];
    }

    /**
     * Sets lang
     *
     * @param string|null $lang User default language
     *
     * @return self
     */
    public function setLang($lang)
    {
        if (is_null($lang)) {
            throw new \InvalidArgumentException('non-nullable lang cannot be null');
        }
        $this->container['lang'] = $lang;

        return $this;
    }

    /**
     * Gets linkcolor
     *
     * @return string|null
     */
    public function getLinkcolor()
    {
        return $this->container['linkcolor'];
    }

    /**
     * Sets linkcolor
     *
     * @param string|null $linkcolor Company ink color
     *
     * @return self
     */
    public function setLinkcolor($linkcolor)
    {
        if (is_null($linkcolor)) {
            throw new \InvalidArgumentException('non-nullable linkcolor cannot be null');
        }
        $this->container['linkcolor'] = $linkcolor;

        return $this;
    }

    /**
     * Gets maildigest
     *
     * @return int|null
     */
    public function getMaildigest()
    {
        return $this->container['maildigest'];
    }

    /**
     * Sets maildigest
     *
     * @param int|null $maildigest User default digest type
     *
     * @return self
     */
    public function setMaildigest($maildigest)
    {
        if (is_null($maildigest)) {
            throw new \InvalidArgumentException('non-nullable maildigest cannot be null');
        }
        $this->container['maildigest'] = $maildigest;

        return $this;
    }

    /**
     * Gets maildisplay
     *
     * @return int|null
     */
    public function getMaildisplay()
    {
        return $this->container['maildisplay'];
    }

    /**
     * Sets maildisplay
     *
     * @param int|null $maildisplay User default email display
     *
     * @return self
     */
    public function setMaildisplay($maildisplay)
    {
        if (is_null($maildisplay)) {
            throw new \InvalidArgumentException('non-nullable maildisplay cannot be null');
        }
        $this->container['maildisplay'] = $maildisplay;

        return $this;
    }

    /**
     * Gets mailformat
     *
     * @return int|null
     */
    public function getMailformat()
    {
        return $this->container['mailformat'];
    }

    /**
     * Sets mailformat
     *
     * @param int|null $mailformat User default email format
     *
     * @return self
     */
    public function setMailformat($mailformat)
    {
        if (is_null($mailformat)) {
            throw new \InvalidArgumentException('non-nullable mailformat cannot be null');
        }
        $this->container['mailformat'] = $mailformat;

        return $this;
    }

    /**
     * Gets maincolor
     *
     * @return string|null
     */
    public function getMaincolor()
    {
        return $this->container['maincolor'];
    }

    /**
     * Sets maincolor
     *
     * @param string|null $maincolor Company main color
     *
     * @return self
     */
    public function setMaincolor($maincolor)
    {
        if (is_null($maincolor)) {
            throw new \InvalidArgumentException('non-nullable maincolor cannot be null');
        }
        $this->container['maincolor'] = $maincolor;

        return $this;
    }

    /**
     * Gets maxusers
     *
     * @return int|null
     */
    public function getMaxusers()
    {
        return $this->container['maxusers'];
    }

    /**
     * Sets maxusers
     *
     * @param int|null $maxusers Company maximum number of users
     *
     * @return self
     */
    public function setMaxusers($maxusers)
    {
        if (is_null($maxusers)) {
            throw new \InvalidArgumentException('non-nullable maxusers cannot be null');
        }
        $this->container['maxusers'] = $maxusers;

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
     * @param string|null $name Company long name
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
     * @return int|null
     */
    public function getParentid()
    {
        return $this->container['parentid'];
    }

    /**
     * Sets parentid
     *
     * @param int|null $parentid ID of parent company
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
     * Gets postcode
     *
     * @return string|null
     */
    public function getPostcode()
    {
        return $this->container['postcode'];
    }

    /**
     * Sets postcode
     *
     * @param string|null $postcode Company location postcode
     *
     * @return self
     */
    public function setPostcode($postcode)
    {
        if (is_null($postcode)) {
            throw new \InvalidArgumentException('non-nullable postcode cannot be null');
        }
        $this->container['postcode'] = $postcode;

        return $this;
    }

    /**
     * Gets region
     *
     * @return string|null
     */
    public function getRegion()
    {
        return $this->container['region'];
    }

    /**
     * Sets region
     *
     * @param string|null $region Company location region
     *
     * @return self
     */
    public function setRegion($region)
    {
        if (is_null($region)) {
            throw new \InvalidArgumentException('non-nullable region cannot be null');
        }
        $this->container['region'] = $region;

        return $this;
    }

    /**
     * Gets screenreader
     *
     * @return int|null
     */
    public function getScreenreader()
    {
        return $this->container['screenreader'];
    }

    /**
     * Sets screenreader
     *
     * @param int|null $screenreader User default screen reader
     *
     * @return self
     */
    public function setScreenreader($screenreader)
    {
        if (is_null($screenreader)) {
            throw new \InvalidArgumentException('non-nullable screenreader cannot be null');
        }
        $this->container['screenreader'] = $screenreader;

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
     * @param string|null $shortname Compay short name
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
     * Gets suspendafter
     *
     * @return int|null
     */
    public function getSuspendafter()
    {
        return $this->container['suspendafter'];
    }

    /**
     * Sets suspendafter
     *
     * @param int|null $suspendafter Number of seconds after termination date to suspend the company
     *
     * @return self
     */
    public function setSuspendafter($suspendafter)
    {
        if (is_null($suspendafter)) {
            throw new \InvalidArgumentException('non-nullable suspendafter cannot be null');
        }
        $this->container['suspendafter'] = $suspendafter;

        return $this;
    }

    /**
     * Gets suspended
     *
     * @return int|null
     */
    public function getSuspended()
    {
        return $this->container['suspended'];
    }

    /**
     * Sets suspended
     *
     * @param int|null $suspended Company is suspended when <> 0
     *
     * @return self
     */
    public function setSuspended($suspended)
    {
        if (is_null($suspended)) {
            throw new \InvalidArgumentException('non-nullable suspended cannot be null');
        }
        $this->container['suspended'] = $suspended;

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
     * @param string|null $theme Company theme
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
     * Gets timezone
     *
     * @return string|null
     */
    public function getTimezone()
    {
        return $this->container['timezone'];
    }

    /**
     * Sets timezone
     *
     * @param string|null $timezone User default timezone
     *
     * @return self
     */
    public function setTimezone($timezone)
    {
        if (is_null($timezone)) {
            throw new \InvalidArgumentException('non-nullable timezone cannot be null');
        }
        $this->container['timezone'] = $timezone;

        return $this;
    }

    /**
     * Gets trackforums
     *
     * @return int|null
     */
    public function getTrackforums()
    {
        return $this->container['trackforums'];
    }

    /**
     * Sets trackforums
     *
     * @param int|null $trackforums User default forum tracking
     *
     * @return self
     */
    public function setTrackforums($trackforums)
    {
        if (is_null($trackforums)) {
            throw new \InvalidArgumentException('non-nullable trackforums cannot be null');
        }
        $this->container['trackforums'] = $trackforums;

        return $this;
    }

    /**
     * Gets validto
     *
     * @return int|null
     */
    public function getValidto()
    {
        return $this->container['validto'];
    }

    /**
     * Sets validto
     *
     * @param int|null $validto Contract termination date in unix timestamp
     *
     * @return self
     */
    public function setValidto($validto)
    {
        if (is_null($validto)) {
            throw new \InvalidArgumentException('non-nullable validto cannot be null');
        }
        $this->container['validto'] = $validto;

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


