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
    ///  Class for testing ToolUsertoursApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ToolUsertoursApiTests : IDisposable
    {
        private ToolUsertoursApi instance;

        public ToolUsertoursApiTests()
        {
            instance = new ToolUsertoursApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ToolUsertoursApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ToolUsertoursApi
            //Assert.IsType<ToolUsertoursApi>(instance);
        }

        /// <summary>
        /// Test ToolUsertoursCompleteTour
        /// </summary>
        [Fact]
        public void ToolUsertoursCompleteTourTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ToolUsertoursCompleteTourRequest toolUsertoursCompleteTourRequest = null;
            //var response = instance.ToolUsertoursCompleteTour(toolUsertoursCompleteTourRequest);
            //Assert.IsType<Object>(response);
        }

        /// <summary>
        /// Test ToolUsertoursFetchAndStartTour
        /// </summary>
        [Fact]
        public void ToolUsertoursFetchAndStartTourTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ToolUsertoursFetchAndStartTourRequest toolUsertoursFetchAndStartTourRequest = null;
            //var response = instance.ToolUsertoursFetchAndStartTour(toolUsertoursFetchAndStartTourRequest);
            //Assert.IsType<ToolUsertoursFetchAndStartTour200Response>(response);
        }

        /// <summary>
        /// Test ToolUsertoursResetTour
        /// </summary>
        [Fact]
        public void ToolUsertoursResetTourTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ToolUsertoursResetTourRequest toolUsertoursResetTourRequest = null;
            //var response = instance.ToolUsertoursResetTour(toolUsertoursResetTourRequest);
            //Assert.IsType<ToolUsertoursResetTour200Response>(response);
        }

        /// <summary>
        /// Test ToolUsertoursStepShown
        /// </summary>
        [Fact]
        public void ToolUsertoursStepShownTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ToolUsertoursStepShownRequest toolUsertoursStepShownRequest = null;
            //var response = instance.ToolUsertoursStepShown(toolUsertoursStepShownRequest);
            //Assert.IsType<Object>(response);
        }
    }
}