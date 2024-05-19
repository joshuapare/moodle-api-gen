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
    /// CoreAdminSetPluginStateRequest
    /// </summary>
    [DataContract(Name = "core_admin_set_plugin_state_request")]
    public partial class CoreAdminSetPluginStateRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreAdminSetPluginStateRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreAdminSetPluginStateRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreAdminSetPluginStateRequest" /> class.
        /// </summary>
        /// <param name="plugin">The name of the plugin (required).</param>
        /// <param name="state">The target state (required).</param>
        public CoreAdminSetPluginStateRequest(string plugin = default(string), int state = default(int))
        {
            // to ensure "plugin" is required (not null)
            if (plugin == null)
            {
                throw new ArgumentNullException("plugin is a required property for CoreAdminSetPluginStateRequest and cannot be null");
            }
            this.Plugin = plugin;
            this.State = state;
        }

        /// <summary>
        /// The name of the plugin
        /// </summary>
        /// <value>The name of the plugin</value>
        [DataMember(Name = "plugin", IsRequired = true, EmitDefaultValue = true)]
        public string Plugin { get; set; }

        /// <summary>
        /// The target state
        /// </summary>
        /// <value>The target state</value>
        [DataMember(Name = "state", IsRequired = true, EmitDefaultValue = true)]
        public int State { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreAdminSetPluginStateRequest {\n");
            sb.Append("  Plugin: ").Append(Plugin).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
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
