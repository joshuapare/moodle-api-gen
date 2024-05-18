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
    ///  Class for testing ModImscpApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ModImscpApiTests : IDisposable
    {
        private ModImscpApi instance;

        public ModImscpApiTests()
        {
            instance = new ModImscpApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ModImscpApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ModImscpApi
            //Assert.IsType<ModImscpApi>(instance);
        }

        /// <summary>
        /// Test ModImscpGetImscpsByCourses
        /// </summary>
        [Fact]
        public void ModImscpGetImscpsByCoursesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = null;
            //var response = instance.ModImscpGetImscpsByCourses(modChatGetChatsByCoursesRequest);
            //Assert.IsType<ModImscpGetImscpsByCourses200Response>(response);
        }

        /// <summary>
        /// Test ModImscpViewImscp
        /// </summary>
        [Fact]
        public void ModImscpViewImscpTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModImscpViewImscpRequest modImscpViewImscpRequest = null;
            //var response = instance.ModImscpViewImscp(modImscpViewImscpRequest);
            //Assert.IsType<CoreCalendarDeleteSubscription200Response>(response);
        }
    }
}
