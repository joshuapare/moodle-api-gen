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
    /// ModBigbluebuttonbnGetRecordingsRequest
    /// </summary>
    [DataContract(Name = "mod_bigbluebuttonbn_get_recordings_request")]
    public partial class ModBigbluebuttonbnGetRecordingsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModBigbluebuttonbnGetRecordingsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModBigbluebuttonbnGetRecordingsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModBigbluebuttonbnGetRecordingsRequest" /> class.
        /// </summary>
        /// <param name="bigbluebuttonbnid">bigbluebuttonbn instance id (required).</param>
        /// <param name="groupid">Group ID (default to null).</param>
        /// <param name="tools">a set of enabled tools (default to &quot;protect,unprotect,publish,unpublish,delete&quot;).</param>
        public ModBigbluebuttonbnGetRecordingsRequest(int bigbluebuttonbnid = default(int), int groupid = null, string tools = @"protect,unprotect,publish,unpublish,delete")
        {
            this.Bigbluebuttonbnid = bigbluebuttonbnid;
            this.Groupid = groupid;
            // use default value if no "tools" provided
            this.Tools = tools ?? @"protect,unprotect,publish,unpublish,delete";
        }

        /// <summary>
        /// bigbluebuttonbn instance id
        /// </summary>
        /// <value>bigbluebuttonbn instance id</value>
        [DataMember(Name = "bigbluebuttonbnid", IsRequired = true, EmitDefaultValue = true)]
        public int Bigbluebuttonbnid { get; set; }

        /// <summary>
        /// Group ID
        /// </summary>
        /// <value>Group ID</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// a set of enabled tools
        /// </summary>
        /// <value>a set of enabled tools</value>
        [DataMember(Name = "tools", EmitDefaultValue = false)]
        public string Tools { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModBigbluebuttonbnGetRecordingsRequest {\n");
            sb.Append("  Bigbluebuttonbnid: ").Append(Bigbluebuttonbnid).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Tools: ").Append(Tools).Append("\n");
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