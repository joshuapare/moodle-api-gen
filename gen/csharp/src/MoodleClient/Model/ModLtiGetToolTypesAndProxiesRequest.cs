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
    /// ModLtiGetToolTypesAndProxiesRequest
    /// </summary>
    [DataContract(Name = "mod_lti_get_tool_types_and_proxies_request")]
    public partial class ModLtiGetToolTypesAndProxiesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiGetToolTypesAndProxiesRequest" /> class.
        /// </summary>
        /// <param name="limit">How many tool types displayed per page (default to 60).</param>
        /// <param name="offset">Current offset of tool elements (default to 0).</param>
        /// <param name="orphanedonly">Orphaned tool types only (default to 0).</param>
        /// <param name="toolproxyid">Tool proxy id (default to 0).</param>
        public ModLtiGetToolTypesAndProxiesRequest(int limit = 60, int offset = 0, bool orphanedonly = 0, int toolproxyid = 0)
        {
            this.Limit = limit;
            this.Offset = offset;
            this.Orphanedonly = orphanedonly;
            this.Toolproxyid = toolproxyid;
        }

        /// <summary>
        /// How many tool types displayed per page
        /// </summary>
        /// <value>How many tool types displayed per page</value>
        [DataMember(Name = "limit", EmitDefaultValue = false)]
        public int Limit { get; set; }

        /// <summary>
        /// Current offset of tool elements
        /// </summary>
        /// <value>Current offset of tool elements</value>
        [DataMember(Name = "offset", EmitDefaultValue = false)]
        public int Offset { get; set; }

        /// <summary>
        /// Orphaned tool types only
        /// </summary>
        /// <value>Orphaned tool types only</value>
        [DataMember(Name = "orphanedonly", EmitDefaultValue = true)]
        public bool Orphanedonly { get; set; }

        /// <summary>
        /// Tool proxy id
        /// </summary>
        /// <value>Tool proxy id</value>
        [DataMember(Name = "toolproxyid", EmitDefaultValue = false)]
        public int Toolproxyid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLtiGetToolTypesAndProxiesRequest {\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  Offset: ").Append(Offset).Append("\n");
            sb.Append("  Orphanedonly: ").Append(Orphanedonly).Append("\n");
            sb.Append("  Toolproxyid: ").Append(Toolproxyid).Append("\n");
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