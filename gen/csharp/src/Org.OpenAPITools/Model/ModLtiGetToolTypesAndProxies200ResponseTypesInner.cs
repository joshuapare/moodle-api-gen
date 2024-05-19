/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Tool
    /// </summary>
    [DataContract(Name = "mod_lti_get_tool_types_and_proxies_200_response_types_inner")]
    public partial class ModLtiGetToolTypesAndProxies200ResponseTypesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiGetToolTypesAndProxies200ResponseTypesInner" /> class.
        /// </summary>
        /// <param name="capabilitygroups">capabilitygroups.</param>
        /// <param name="clientid">Client ID.</param>
        /// <param name="courseid">Tool type course (default to 0).</param>
        /// <param name="deploymentid">Deployment ID.</param>
        /// <param name="description">Tool type description.</param>
        /// <param name="hascapabilitygroups">Indicate if capabilitygroups is populated.</param>
        /// <param name="id">Tool type id.</param>
        /// <param name="instancecount">The number of times this tool is being used.</param>
        /// <param name="instanceids">instanceids.</param>
        /// <param name="name">Tool type name.</param>
        /// <param name="platformid">Platform ID.</param>
        /// <param name="state">state.</param>
        /// <param name="urls">urls.</param>
        public ModLtiGetToolTypesAndProxies200ResponseTypesInner(List<Object> capabilitygroups = default(List<Object>), string clientid = default(string), int courseid = 0, int deploymentid = default(int), string description = default(string), bool hascapabilitygroups = default(bool), int id = default(int), int instancecount = default(int), List<Object> instanceids = default(List<Object>), string name = default(string), string platformid = default(string), ModLtiGetToolTypesAndProxies200ResponseTypesInnerState state = default(ModLtiGetToolTypesAndProxies200ResponseTypesInnerState), ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls urls = default(ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls))
        {
            this.Capabilitygroups = capabilitygroups;
            this.Clientid = clientid;
            this.Courseid = courseid;
            this.Deploymentid = deploymentid;
            this.Description = description;
            this.Hascapabilitygroups = hascapabilitygroups;
            this.Id = id;
            this.Instancecount = instancecount;
            this.Instanceids = instanceids;
            this.Name = name;
            this.Platformid = platformid;
            this.State = state;
            this.Urls = urls;
        }

        /// <summary>
        /// Gets or Sets Capabilitygroups
        /// </summary>
        [DataMember(Name = "capabilitygroups", EmitDefaultValue = false)]
        public List<Object> Capabilitygroups { get; set; }

        /// <summary>
        /// Client ID
        /// </summary>
        /// <value>Client ID</value>
        [DataMember(Name = "clientid", EmitDefaultValue = false)]
        public string Clientid { get; set; }

        /// <summary>
        /// Tool type course
        /// </summary>
        /// <value>Tool type course</value>
        [DataMember(Name = "courseid", EmitDefaultValue = false)]
        public int Courseid { get; set; }

        /// <summary>
        /// Deployment ID
        /// </summary>
        /// <value>Deployment ID</value>
        [DataMember(Name = "deploymentid", EmitDefaultValue = false)]
        public int Deploymentid { get; set; }

        /// <summary>
        /// Tool type description
        /// </summary>
        /// <value>Tool type description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Indicate if capabilitygroups is populated
        /// </summary>
        /// <value>Indicate if capabilitygroups is populated</value>
        [DataMember(Name = "hascapabilitygroups", EmitDefaultValue = true)]
        public bool Hascapabilitygroups { get; set; }

        /// <summary>
        /// Tool type id
        /// </summary>
        /// <value>Tool type id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// The number of times this tool is being used
        /// </summary>
        /// <value>The number of times this tool is being used</value>
        [DataMember(Name = "instancecount", EmitDefaultValue = false)]
        public int Instancecount { get; set; }

        /// <summary>
        /// Gets or Sets Instanceids
        /// </summary>
        [DataMember(Name = "instanceids", EmitDefaultValue = false)]
        public List<Object> Instanceids { get; set; }

        /// <summary>
        /// Tool type name
        /// </summary>
        /// <value>Tool type name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Platform ID
        /// </summary>
        /// <value>Platform ID</value>
        [DataMember(Name = "platformid", EmitDefaultValue = false)]
        public string Platformid { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name = "state", EmitDefaultValue = false)]
        public ModLtiGetToolTypesAndProxies200ResponseTypesInnerState State { get; set; }

        /// <summary>
        /// Gets or Sets Urls
        /// </summary>
        [DataMember(Name = "urls", EmitDefaultValue = false)]
        public ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls Urls { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLtiGetToolTypesAndProxies200ResponseTypesInner {\n");
            sb.Append("  Capabilitygroups: ").Append(Capabilitygroups).Append("\n");
            sb.Append("  Clientid: ").Append(Clientid).Append("\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Deploymentid: ").Append(Deploymentid).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Hascapabilitygroups: ").Append(Hascapabilitygroups).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Instancecount: ").Append(Instancecount).Append("\n");
            sb.Append("  Instanceids: ").Append(Instanceids).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Platformid: ").Append(Platformid).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Urls: ").Append(Urls).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
