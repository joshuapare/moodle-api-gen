<?php
/**
 * ToolIomadpolicyApi
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

namespace OpenAPI\Client\Api;

use GuzzleHttp\Client;
use GuzzleHttp\ClientInterface;
use GuzzleHttp\Exception\ConnectException;
use GuzzleHttp\Exception\RequestException;
use GuzzleHttp\Psr7\MultipartStream;
use GuzzleHttp\Psr7\Request;
use GuzzleHttp\RequestOptions;
use OpenAPI\Client\ApiException;
use OpenAPI\Client\Configuration;
use OpenAPI\Client\HeaderSelector;
use OpenAPI\Client\ObjectSerializer;

/**
 * ToolIomadpolicyApi Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class ToolIomadpolicyApi
{
    /**
     * @var ClientInterface
     */
    protected $client;

    /**
     * @var Configuration
     */
    protected $config;

    /**
     * @var HeaderSelector
     */
    protected $headerSelector;

    /**
     * @var int Host index
     */
    protected $hostIndex;

    /** @var string[] $contentTypes **/
    public const contentTypes = [
        'toolIomadpolicyGetIomadpolicyVersion' => [
            'application/json',
        ],
        'toolIomadpolicySubmitAcceptOnBehalf' => [
            'application/json',
        ],
    ];

    /**
     * @param ClientInterface $client
     * @param Configuration   $config
     * @param HeaderSelector  $selector
     * @param int             $hostIndex (Optional) host index to select the list of hosts if defined in the OpenAPI spec
     */
    public function __construct(
        ClientInterface $client = null,
        Configuration $config = null,
        HeaderSelector $selector = null,
        $hostIndex = 0
    ) {
        $this->client = $client ?: new Client();
        $this->config = $config ?: new Configuration();
        $this->headerSelector = $selector ?: new HeaderSelector();
        $this->hostIndex = $hostIndex;
    }

    /**
     * Set the host index
     *
     * @param int $hostIndex Host index (required)
     */
    public function setHostIndex($hostIndex): void
    {
        $this->hostIndex = $hostIndex;
    }

    /**
     * Get the host index
     *
     * @return int Host index
     */
    public function getHostIndex()
    {
        return $this->hostIndex;
    }

    /**
     * @return Configuration
     */
    public function getConfig()
    {
        return $this->config;
    }

    /**
     * Operation toolIomadpolicyGetIomadpolicyVersion
     *
     * Fetch the details of a iomadpolicy version
     *
     * @param  \OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersionRequest $tool_iomadpolicy_get_iomadpolicy_version_request tool_iomadpolicy_get_iomadpolicy_version_request (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['toolIomadpolicyGetIomadpolicyVersion'] to see the possible values for this operation
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response or if the response body is not in the expected format
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersion200Response|\OpenAPI\Client\Model\ErrorResponse
     */
    public function toolIomadpolicyGetIomadpolicyVersion($tool_iomadpolicy_get_iomadpolicy_version_request, string $contentType = self::contentTypes['toolIomadpolicyGetIomadpolicyVersion'][0])
    {
        list($response) = $this->toolIomadpolicyGetIomadpolicyVersionWithHttpInfo($tool_iomadpolicy_get_iomadpolicy_version_request, $contentType);
        return $response;
    }

    /**
     * Operation toolIomadpolicyGetIomadpolicyVersionWithHttpInfo
     *
     * Fetch the details of a iomadpolicy version
     *
     * @param  \OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersionRequest $tool_iomadpolicy_get_iomadpolicy_version_request (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['toolIomadpolicyGetIomadpolicyVersion'] to see the possible values for this operation
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response or if the response body is not in the expected format
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersion200Response|\OpenAPI\Client\Model\ErrorResponse, HTTP status code, HTTP response headers (array of strings)
     */
    public function toolIomadpolicyGetIomadpolicyVersionWithHttpInfo($tool_iomadpolicy_get_iomadpolicy_version_request, string $contentType = self::contentTypes['toolIomadpolicyGetIomadpolicyVersion'][0])
    {
        $request = $this->toolIomadpolicyGetIomadpolicyVersionRequest($tool_iomadpolicy_get_iomadpolicy_version_request, $contentType);

        try {
            $options = $this->createHttpClientOption();
            try {
                $response = $this->client->send($request, $options);
            } catch (RequestException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    (int) $e->getCode(),
                    $e->getResponse() ? $e->getResponse()->getHeaders() : null,
                    $e->getResponse() ? (string) $e->getResponse()->getBody() : null
                );
            } catch (ConnectException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    (int) $e->getCode(),
                    null,
                    null
                );
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    sprintf(
                        '[%d] Error connecting to the API (%s)',
                        $statusCode,
                        (string) $request->getUri()
                    ),
                    $statusCode,
                    $response->getHeaders(),
                    (string) $response->getBody()
                );
            }

            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersion200Response' === '\SplFileObject') {
                        $content = $response->getBody(); //stream goes to serializer
                    } else {
                        $content = (string) $response->getBody();
                        if ('\OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersion200Response' !== 'string') {
                            try {
                                $content = json_decode($content, false, 512, JSON_THROW_ON_ERROR);
                            } catch (\JsonException $exception) {
                                throw new ApiException(
                                    sprintf(
                                        'Error JSON decoding server response (%s)',
                                        $request->getUri()
                                    ),
                                    $statusCode,
                                    $response->getHeaders(),
                                    $content
                                );
                            }
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersion200Response', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                case 400:
                    if ('\OpenAPI\Client\Model\ErrorResponse' === '\SplFileObject') {
                        $content = $response->getBody(); //stream goes to serializer
                    } else {
                        $content = (string) $response->getBody();
                        if ('\OpenAPI\Client\Model\ErrorResponse' !== 'string') {
                            try {
                                $content = json_decode($content, false, 512, JSON_THROW_ON_ERROR);
                            } catch (\JsonException $exception) {
                                throw new ApiException(
                                    sprintf(
                                        'Error JSON decoding server response (%s)',
                                        $request->getUri()
                                    ),
                                    $statusCode,
                                    $response->getHeaders(),
                                    $content
                                );
                            }
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\ErrorResponse', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersion200Response';
            if ($returnType === '\SplFileObject') {
                $content = $response->getBody(); //stream goes to serializer
            } else {
                $content = (string) $response->getBody();
                if ($returnType !== 'string') {
                    try {
                        $content = json_decode($content, false, 512, JSON_THROW_ON_ERROR);
                    } catch (\JsonException $exception) {
                        throw new ApiException(
                            sprintf(
                                'Error JSON decoding server response (%s)',
                                $request->getUri()
                            ),
                            $statusCode,
                            $response->getHeaders(),
                            $content
                        );
                    }
                }
            }

            return [
                ObjectSerializer::deserialize($content, $returnType, []),
                $response->getStatusCode(),
                $response->getHeaders()
            ];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersion200Response',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                case 400:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\OpenAPI\Client\Model\ErrorResponse',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation toolIomadpolicyGetIomadpolicyVersionAsync
     *
     * Fetch the details of a iomadpolicy version
     *
     * @param  \OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersionRequest $tool_iomadpolicy_get_iomadpolicy_version_request (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['toolIomadpolicyGetIomadpolicyVersion'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function toolIomadpolicyGetIomadpolicyVersionAsync($tool_iomadpolicy_get_iomadpolicy_version_request, string $contentType = self::contentTypes['toolIomadpolicyGetIomadpolicyVersion'][0])
    {
        return $this->toolIomadpolicyGetIomadpolicyVersionAsyncWithHttpInfo($tool_iomadpolicy_get_iomadpolicy_version_request, $contentType)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation toolIomadpolicyGetIomadpolicyVersionAsyncWithHttpInfo
     *
     * Fetch the details of a iomadpolicy version
     *
     * @param  \OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersionRequest $tool_iomadpolicy_get_iomadpolicy_version_request (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['toolIomadpolicyGetIomadpolicyVersion'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function toolIomadpolicyGetIomadpolicyVersionAsyncWithHttpInfo($tool_iomadpolicy_get_iomadpolicy_version_request, string $contentType = self::contentTypes['toolIomadpolicyGetIomadpolicyVersion'][0])
    {
        $returnType = '\OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersion200Response';
        $request = $this->toolIomadpolicyGetIomadpolicyVersionRequest($tool_iomadpolicy_get_iomadpolicy_version_request, $contentType);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    if ($returnType === '\SplFileObject') {
                        $content = $response->getBody(); //stream goes to serializer
                    } else {
                        $content = (string) $response->getBody();
                        if ($returnType !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, $returnType, []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                },
                function ($exception) {
                    $response = $exception->getResponse();
                    $statusCode = $response->getStatusCode();
                    throw new ApiException(
                        sprintf(
                            '[%d] Error connecting to the API (%s)',
                            $statusCode,
                            $exception->getRequest()->getUri()
                        ),
                        $statusCode,
                        $response->getHeaders(),
                        (string) $response->getBody()
                    );
                }
            );
    }

    /**
     * Create request for operation 'toolIomadpolicyGetIomadpolicyVersion'
     *
     * @param  \OpenAPI\Client\Model\ToolIomadpolicyGetIomadpolicyVersionRequest $tool_iomadpolicy_get_iomadpolicy_version_request (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['toolIomadpolicyGetIomadpolicyVersion'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    public function toolIomadpolicyGetIomadpolicyVersionRequest($tool_iomadpolicy_get_iomadpolicy_version_request, string $contentType = self::contentTypes['toolIomadpolicyGetIomadpolicyVersion'][0])
    {

        // verify the required parameter 'tool_iomadpolicy_get_iomadpolicy_version_request' is set
        if ($tool_iomadpolicy_get_iomadpolicy_version_request === null || (is_array($tool_iomadpolicy_get_iomadpolicy_version_request) && count($tool_iomadpolicy_get_iomadpolicy_version_request) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $tool_iomadpolicy_get_iomadpolicy_version_request when calling toolIomadpolicyGetIomadpolicyVersion'
            );
        }


        $resourcePath = '/tool_iomadpolicy_get_iomadpolicy_version';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;





        $headers = $this->headerSelector->selectHeaders(
            ['application/json', ],
            $contentType,
            $multipart
        );

        // for model (json/xml)
        if (isset($tool_iomadpolicy_get_iomadpolicy_version_request)) {
            if (stripos($headers['Content-Type'], 'application/json') !== false) {
                # if Content-Type contains "application/json", json_encode the body
                $httpBody = \GuzzleHttp\Utils::jsonEncode(ObjectSerializer::sanitizeForSerialization($tool_iomadpolicy_get_iomadpolicy_version_request));
            } else {
                $httpBody = $tool_iomadpolicy_get_iomadpolicy_version_request;
            }
        } elseif (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $formParamValueItems = is_array($formParamValue) ? $formParamValue : [$formParamValue];
                    foreach ($formParamValueItems as $formParamValueItem) {
                        $multipartContents[] = [
                            'name' => $formParamName,
                            'contents' => $formParamValueItem
                        ];
                    }
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif (stripos($headers['Content-Type'], 'application/json') !== false) {
                # if Content-Type contains "application/json", json_encode the form parameters
                $httpBody = \GuzzleHttp\Utils::jsonEncode($formParams);
            } else {
                // for HTTP post (form)
                $httpBody = ObjectSerializer::buildQuery($formParams);
            }
        }

        // this endpoint requires API key authentication
        $apiKey = $this->config->getApiKeyWithPrefix('Authorization');
        if ($apiKey !== null) {
            $headers['Authorization'] = $apiKey;
        }

        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $operationHost = $this->config->getHost();
        $query = ObjectSerializer::buildQuery($queryParams);
        return new Request(
            'POST',
            $operationHost . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation toolIomadpolicySubmitAcceptOnBehalf
     *
     * Accept policies on behalf of other users
     *
     * @param  \OpenAPI\Client\Model\ToolIomadpolicySubmitAcceptOnBehalfRequest $tool_iomadpolicy_submit_accept_on_behalf_request tool_iomadpolicy_submit_accept_on_behalf_request (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['toolIomadpolicySubmitAcceptOnBehalf'] to see the possible values for this operation
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response or if the response body is not in the expected format
     * @throws \InvalidArgumentException
     * @return object|\OpenAPI\Client\Model\ErrorResponse
     */
    public function toolIomadpolicySubmitAcceptOnBehalf($tool_iomadpolicy_submit_accept_on_behalf_request, string $contentType = self::contentTypes['toolIomadpolicySubmitAcceptOnBehalf'][0])
    {
        list($response) = $this->toolIomadpolicySubmitAcceptOnBehalfWithHttpInfo($tool_iomadpolicy_submit_accept_on_behalf_request, $contentType);
        return $response;
    }

    /**
     * Operation toolIomadpolicySubmitAcceptOnBehalfWithHttpInfo
     *
     * Accept policies on behalf of other users
     *
     * @param  \OpenAPI\Client\Model\ToolIomadpolicySubmitAcceptOnBehalfRequest $tool_iomadpolicy_submit_accept_on_behalf_request (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['toolIomadpolicySubmitAcceptOnBehalf'] to see the possible values for this operation
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response or if the response body is not in the expected format
     * @throws \InvalidArgumentException
     * @return array of object|\OpenAPI\Client\Model\ErrorResponse, HTTP status code, HTTP response headers (array of strings)
     */
    public function toolIomadpolicySubmitAcceptOnBehalfWithHttpInfo($tool_iomadpolicy_submit_accept_on_behalf_request, string $contentType = self::contentTypes['toolIomadpolicySubmitAcceptOnBehalf'][0])
    {
        $request = $this->toolIomadpolicySubmitAcceptOnBehalfRequest($tool_iomadpolicy_submit_accept_on_behalf_request, $contentType);

        try {
            $options = $this->createHttpClientOption();
            try {
                $response = $this->client->send($request, $options);
            } catch (RequestException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    (int) $e->getCode(),
                    $e->getResponse() ? $e->getResponse()->getHeaders() : null,
                    $e->getResponse() ? (string) $e->getResponse()->getBody() : null
                );
            } catch (ConnectException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    (int) $e->getCode(),
                    null,
                    null
                );
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    sprintf(
                        '[%d] Error connecting to the API (%s)',
                        $statusCode,
                        (string) $request->getUri()
                    ),
                    $statusCode,
                    $response->getHeaders(),
                    (string) $response->getBody()
                );
            }

            switch($statusCode) {
                case 200:
                    if ('object' === '\SplFileObject') {
                        $content = $response->getBody(); //stream goes to serializer
                    } else {
                        $content = (string) $response->getBody();
                        if ('object' !== 'string') {
                            try {
                                $content = json_decode($content, false, 512, JSON_THROW_ON_ERROR);
                            } catch (\JsonException $exception) {
                                throw new ApiException(
                                    sprintf(
                                        'Error JSON decoding server response (%s)',
                                        $request->getUri()
                                    ),
                                    $statusCode,
                                    $response->getHeaders(),
                                    $content
                                );
                            }
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, 'object', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                case 400:
                    if ('\OpenAPI\Client\Model\ErrorResponse' === '\SplFileObject') {
                        $content = $response->getBody(); //stream goes to serializer
                    } else {
                        $content = (string) $response->getBody();
                        if ('\OpenAPI\Client\Model\ErrorResponse' !== 'string') {
                            try {
                                $content = json_decode($content, false, 512, JSON_THROW_ON_ERROR);
                            } catch (\JsonException $exception) {
                                throw new ApiException(
                                    sprintf(
                                        'Error JSON decoding server response (%s)',
                                        $request->getUri()
                                    ),
                                    $statusCode,
                                    $response->getHeaders(),
                                    $content
                                );
                            }
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\ErrorResponse', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = 'object';
            if ($returnType === '\SplFileObject') {
                $content = $response->getBody(); //stream goes to serializer
            } else {
                $content = (string) $response->getBody();
                if ($returnType !== 'string') {
                    try {
                        $content = json_decode($content, false, 512, JSON_THROW_ON_ERROR);
                    } catch (\JsonException $exception) {
                        throw new ApiException(
                            sprintf(
                                'Error JSON decoding server response (%s)',
                                $request->getUri()
                            ),
                            $statusCode,
                            $response->getHeaders(),
                            $content
                        );
                    }
                }
            }

            return [
                ObjectSerializer::deserialize($content, $returnType, []),
                $response->getStatusCode(),
                $response->getHeaders()
            ];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        'object',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                case 400:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\OpenAPI\Client\Model\ErrorResponse',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation toolIomadpolicySubmitAcceptOnBehalfAsync
     *
     * Accept policies on behalf of other users
     *
     * @param  \OpenAPI\Client\Model\ToolIomadpolicySubmitAcceptOnBehalfRequest $tool_iomadpolicy_submit_accept_on_behalf_request (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['toolIomadpolicySubmitAcceptOnBehalf'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function toolIomadpolicySubmitAcceptOnBehalfAsync($tool_iomadpolicy_submit_accept_on_behalf_request, string $contentType = self::contentTypes['toolIomadpolicySubmitAcceptOnBehalf'][0])
    {
        return $this->toolIomadpolicySubmitAcceptOnBehalfAsyncWithHttpInfo($tool_iomadpolicy_submit_accept_on_behalf_request, $contentType)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation toolIomadpolicySubmitAcceptOnBehalfAsyncWithHttpInfo
     *
     * Accept policies on behalf of other users
     *
     * @param  \OpenAPI\Client\Model\ToolIomadpolicySubmitAcceptOnBehalfRequest $tool_iomadpolicy_submit_accept_on_behalf_request (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['toolIomadpolicySubmitAcceptOnBehalf'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function toolIomadpolicySubmitAcceptOnBehalfAsyncWithHttpInfo($tool_iomadpolicy_submit_accept_on_behalf_request, string $contentType = self::contentTypes['toolIomadpolicySubmitAcceptOnBehalf'][0])
    {
        $returnType = 'object';
        $request = $this->toolIomadpolicySubmitAcceptOnBehalfRequest($tool_iomadpolicy_submit_accept_on_behalf_request, $contentType);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    if ($returnType === '\SplFileObject') {
                        $content = $response->getBody(); //stream goes to serializer
                    } else {
                        $content = (string) $response->getBody();
                        if ($returnType !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, $returnType, []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                },
                function ($exception) {
                    $response = $exception->getResponse();
                    $statusCode = $response->getStatusCode();
                    throw new ApiException(
                        sprintf(
                            '[%d] Error connecting to the API (%s)',
                            $statusCode,
                            $exception->getRequest()->getUri()
                        ),
                        $statusCode,
                        $response->getHeaders(),
                        (string) $response->getBody()
                    );
                }
            );
    }

    /**
     * Create request for operation 'toolIomadpolicySubmitAcceptOnBehalf'
     *
     * @param  \OpenAPI\Client\Model\ToolIomadpolicySubmitAcceptOnBehalfRequest $tool_iomadpolicy_submit_accept_on_behalf_request (required)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['toolIomadpolicySubmitAcceptOnBehalf'] to see the possible values for this operation
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    public function toolIomadpolicySubmitAcceptOnBehalfRequest($tool_iomadpolicy_submit_accept_on_behalf_request, string $contentType = self::contentTypes['toolIomadpolicySubmitAcceptOnBehalf'][0])
    {

        // verify the required parameter 'tool_iomadpolicy_submit_accept_on_behalf_request' is set
        if ($tool_iomadpolicy_submit_accept_on_behalf_request === null || (is_array($tool_iomadpolicy_submit_accept_on_behalf_request) && count($tool_iomadpolicy_submit_accept_on_behalf_request) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $tool_iomadpolicy_submit_accept_on_behalf_request when calling toolIomadpolicySubmitAcceptOnBehalf'
            );
        }


        $resourcePath = '/tool_iomadpolicy_submit_accept_on_behalf';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;





        $headers = $this->headerSelector->selectHeaders(
            ['application/json', ],
            $contentType,
            $multipart
        );

        // for model (json/xml)
        if (isset($tool_iomadpolicy_submit_accept_on_behalf_request)) {
            if (stripos($headers['Content-Type'], 'application/json') !== false) {
                # if Content-Type contains "application/json", json_encode the body
                $httpBody = \GuzzleHttp\Utils::jsonEncode(ObjectSerializer::sanitizeForSerialization($tool_iomadpolicy_submit_accept_on_behalf_request));
            } else {
                $httpBody = $tool_iomadpolicy_submit_accept_on_behalf_request;
            }
        } elseif (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $formParamValueItems = is_array($formParamValue) ? $formParamValue : [$formParamValue];
                    foreach ($formParamValueItems as $formParamValueItem) {
                        $multipartContents[] = [
                            'name' => $formParamName,
                            'contents' => $formParamValueItem
                        ];
                    }
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif (stripos($headers['Content-Type'], 'application/json') !== false) {
                # if Content-Type contains "application/json", json_encode the form parameters
                $httpBody = \GuzzleHttp\Utils::jsonEncode($formParams);
            } else {
                // for HTTP post (form)
                $httpBody = ObjectSerializer::buildQuery($formParams);
            }
        }

        // this endpoint requires API key authentication
        $apiKey = $this->config->getApiKeyWithPrefix('Authorization');
        if ($apiKey !== null) {
            $headers['Authorization'] = $apiKey;
        }

        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $operationHost = $this->config->getHost();
        $query = ObjectSerializer::buildQuery($queryParams);
        return new Request(
            'POST',
            $operationHost . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Create http client option
     *
     * @throws \RuntimeException on file opening failure
     * @return array of http client options
     */
    protected function createHttpClientOption()
    {
        $options = [];
        if ($this->config->getDebug()) {
            $options[RequestOptions::DEBUG] = fopen($this->config->getDebugFile(), 'a');
            if (!$options[RequestOptions::DEBUG]) {
                throw new \RuntimeException('Failed to open the debug file: ' . $this->config->getDebugFile());
            }
        }

        return $options;
    }
}