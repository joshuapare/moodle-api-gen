/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing ModUrlApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ModUrlApiTests : IDisposable
    {
        private ModUrlApi instance;

        public ModUrlApiTests()
        {
            instance = new ModUrlApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ModUrlApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ModUrlApi
            //Assert.IsType<ModUrlApi>(instance);
        }

        /// <summary>
        /// Test ModUrlGetUrlsByCourses
        /// </summary>
        [Fact]
        public void ModUrlGetUrlsByCoursesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = null;
            //var response = instance.ModUrlGetUrlsByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
            //Assert.IsType<ModUrlGetUrlsByCourses200Response>(response);
        }

        /// <summary>
        /// Test ModUrlViewUrl
        /// </summary>
        [Fact]
        public void ModUrlViewUrlTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModUrlViewUrlRequest modUrlViewUrlRequest = null;
            //var response = instance.ModUrlViewUrl(modUrlViewUrlRequest);
            //Assert.IsType<CoreCalendarDeleteSubscription200Response>(response);
        }
    }
}
