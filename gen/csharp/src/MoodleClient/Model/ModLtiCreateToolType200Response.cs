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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ModLtiCreateToolType200Response
    /// </summary>
    [DataContract(Name = "mod_lti_create_tool_type_200_response")]
    public partial class ModLtiCreateToolType200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiCreateToolType200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLtiCreateToolType200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiCreateToolType200Response" /> class.
        /// </summary>
        /// <param name="capabilitygroups">capabilitygroups.</param>
        /// <param name="clientid">Client ID (required) (default to &quot;null&quot;).</param>
        /// <param name="courseid">Tool type course (default to 0).</param>
        /// <param name="deploymentid">Deployment ID (required) (default to null).</param>
        /// <param name="description">Tool type description (required) (default to &quot;null&quot;).</param>
        /// <param name="hascapabilitygroups">Indicate if capabilitygroups is populated (required) (default to null).</param>
        /// <param name="id">Tool type id (required) (default to null).</param>
        /// <param name="instancecount">The number of times this tool is being used (required) (default to null).</param>
        /// <param name="instanceids">instanceids.</param>
        /// <param name="name">Tool type name (required) (default to &quot;null&quot;).</param>
        /// <param name="platformid">Platform ID (required) (default to &quot;null&quot;).</param>
        /// <param name="state">state (required).</param>
        /// <param name="urls">urls (required).</param>
        public ModLtiCreateToolType200Response(List<Object> capabilitygroups = default(List<Object>), string clientid = @"null", int courseid = 0, int deploymentid = null, string description = @"null", bool hascapabilitygroups = null, int id = null, int instancecount = null, List<Object> instanceids = default(List<Object>), string name = @"null", string platformid = @"null", ModLtiCreateToolType200ResponseState state = default(ModLtiCreateToolType200ResponseState), ModLtiCreateToolType200ResponseUrls urls = default(ModLtiCreateToolType200ResponseUrls))
        {
            // to ensure "clientid" is required (not null)
            if (clientid == null)
            {
                throw new ArgumentNullException("clientid is a required property for ModLtiCreateToolType200Response and cannot be null");
            }
            this.Clientid = clientid;
            this.Deploymentid = deploymentid;
            // to ensure "description" is required (not null)
            if (description == null)
            {
                throw new ArgumentNullException("description is a required property for ModLtiCreateToolType200Response and cannot be null");
            }
            this.Description = description;
            this.Hascapabilitygroups = hascapabilitygroups;
            this.Id = id;
            this.Instancecount = instancecount;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for ModLtiCreateToolType200Response and cannot be null");
            }
            this.Name = name;
            // to ensure "platformid" is required (not null)
            if (platformid == null)
            {
                throw new ArgumentNullException("platformid is a required property for ModLtiCreateToolType200Response and cannot be null");
            }
            this.Platformid = platformid;
            // to ensure "state" is required (not null)
            if (state == null)
            {
                throw new ArgumentNullException("state is a required property for ModLtiCreateToolType200Response and cannot be null");
            }
            this.State = state;
            // to ensure "urls" is required (not null)
            if (urls == null)
            {
                throw new ArgumentNullException("urls is a required property for ModLtiCreateToolType200Response and cannot be null");
            }
            this.Urls = urls;
            this.Capabilitygroups = capabilitygroups;
            this.Courseid = courseid;
            this.Instanceids = instanceids;
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
        [DataMember(Name = "clientid", IsRequired = true, EmitDefaultValue = true)]
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
        [DataMember(Name = "deploymentid", IsRequired = true, EmitDefaultValue = true)]
        public int Deploymentid { get; set; }

        /// <summary>
        /// Tool type description
        /// </summary>
        /// <value>Tool type description</value>
        [DataMember(Name = "description", IsRequired = true, EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// Indicate if capabilitygroups is populated
        /// </summary>
        /// <value>Indicate if capabilitygroups is populated</value>
        [DataMember(Name = "hascapabilitygroups", IsRequired = true, EmitDefaultValue = true)]
        public bool Hascapabilitygroups { get; set; }

        /// <summary>
        /// Tool type id
        /// </summary>
        /// <value>Tool type id</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// The number of times this tool is being used
        /// </summary>
        /// <value>The number of times this tool is being used</value>
        [DataMember(Name = "instancecount", IsRequired = true, EmitDefaultValue = true)]
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
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Platform ID
        /// </summary>
        /// <value>Platform ID</value>
        [DataMember(Name = "platformid", IsRequired = true, EmitDefaultValue = true)]
        public string Platformid { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name = "state", IsRequired = true, EmitDefaultValue = true)]
        public ModLtiCreateToolType200ResponseState State { get; set; }

        /// <summary>
        /// Gets or Sets Urls
        /// </summary>
        [DataMember(Name = "urls", IsRequired = true, EmitDefaultValue = true)]
        public ModLtiCreateToolType200ResponseUrls Urls { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLtiCreateToolType200Response {\n");
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