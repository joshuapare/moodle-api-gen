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

using MoodleClient.Client;
using MoodleClient.Api;
// uncomment below to import models
//using MoodleClient.Model;

namespace MoodleClient.Test.Api
{
    /// <summary>
    ///  Class for testing ToolPolicyApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ToolPolicyApiTests : IDisposable
    {
        private ToolPolicyApi instance;

        public ToolPolicyApiTests()
        {
            instance = new ToolPolicyApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ToolPolicyApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ToolPolicyApi
            //Assert.IsType<ToolPolicyApi>(instance);
        }

        /// <summary>
        /// Test ToolPolicyGetPolicyVersion
        /// </summary>
        [Fact]
        public void ToolPolicyGetPolicyVersionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ToolPolicyGetPolicyVersionRequest toolPolicyGetPolicyVersionRequest = null;
            //var response = instance.ToolPolicyGetPolicyVersion(toolPolicyGetPolicyVersionRequest);
            //Assert.IsType<ToolPolicyGetPolicyVersion200Response>(response);
        }

        /// <summary>
        /// Test ToolPolicySubmitAcceptOnBehalf
        /// </summary>
        [Fact]
        public void ToolPolicySubmitAcceptOnBehalfTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ToolPolicySubmitAcceptOnBehalfRequest toolPolicySubmitAcceptOnBehalfRequest = null;
            //var response = instance.ToolPolicySubmitAcceptOnBehalf(toolPolicySubmitAcceptOnBehalfRequest);
            //Assert.IsType<Object>(response);
        }
    }
}
