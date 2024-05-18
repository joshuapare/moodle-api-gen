<?php
/**
 * ModScormApiTest
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
 * Please update the test case below to test the endpoint.
 */

namespace OpenAPI\Client\Test\Api;

use \OpenAPI\Client\Configuration;
use \OpenAPI\Client\ApiException;
use \OpenAPI\Client\ObjectSerializer;
use PHPUnit\Framework\TestCase;

/**
 * ModScormApiTest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class ModScormApiTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * Test case for modScormGetScormAccessInformation
     *
     * Return capabilities information for a given scorm..
     *
     */
    public function testModScormGetScormAccessInformation()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }

    /**
     * Test case for modScormGetScormAttemptCount
     *
     * Return the number of attempts done by a user in the given SCORM..
     *
     */
    public function testModScormGetScormAttemptCount()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }

    /**
     * Test case for modScormGetScormScoTracks
     *
     * Retrieves SCO tracking data for the given user id and attempt number.
     *
     */
    public function testModScormGetScormScoTracks()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }

    /**
     * Test case for modScormGetScormScoes
     *
     * Returns a list containing all the scoes data related to the given scorm id.
     *
     */
    public function testModScormGetScormScoes()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }

    /**
     * Test case for modScormGetScormUserData
     *
     * Retrieves user tracking and SCO data and default SCORM values.
     *
     */
    public function testModScormGetScormUserData()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }

    /**
     * Test case for modScormGetScormsByCourses
     *
     * Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned..
     *
     */
    public function testModScormGetScormsByCourses()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }

    /**
     * Test case for modScormInsertScormTracks
     *
     * Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data..
     *
     */
    public function testModScormInsertScormTracks()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }

    /**
     * Test case for modScormLaunchSco
     *
     * Trigger the SCO launched event..
     *
     */
    public function testModScormLaunchSco()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }

    /**
     * Test case for modScormViewScorm
     *
     * Trigger the course module viewed event..
     *
     */
    public function testModScormViewScorm()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }
}