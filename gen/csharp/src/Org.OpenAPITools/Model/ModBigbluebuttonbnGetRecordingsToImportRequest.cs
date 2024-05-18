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
    /// ModBigbluebuttonbnGetRecordingsToImportRequest
    /// </summary>
    [DataContract(Name = "mod_bigbluebuttonbn_get_recordings_to_import_request")]
    public partial class ModBigbluebuttonbnGetRecordingsToImportRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModBigbluebuttonbnGetRecordingsToImportRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModBigbluebuttonbnGetRecordingsToImportRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModBigbluebuttonbnGetRecordingsToImportRequest" /> class.
        /// </summary>
        /// <param name="destinationinstanceid">Id of the other BBB we target for importing recordings into.                 The idea here is to remove already imported recordings. (required) (default to null).</param>
        /// <param name="groupid">Group ID.</param>
        /// <param name="sourcebigbluebuttonbnid">bigbluebuttonbn instance id (default to 0).</param>
        /// <param name="sourcecourseid">source courseid to filter by (default to 0).</param>
        /// <param name="tools">a set of enabled tools (default to &quot;protect,unprotect,publish,unpublish,delete&quot;).</param>
        public ModBigbluebuttonbnGetRecordingsToImportRequest(int destinationinstanceid = null, int groupid = default(int), int sourcebigbluebuttonbnid = 0, int sourcecourseid = 0, string tools = @"protect,unprotect,publish,unpublish,delete")
        {
            this.Destinationinstanceid = destinationinstanceid;
            this.Groupid = groupid;
            this.Sourcebigbluebuttonbnid = sourcebigbluebuttonbnid;
            this.Sourcecourseid = sourcecourseid;
            // use default value if no "tools" provided
            this.Tools = tools ?? @"protect,unprotect,publish,unpublish,delete";
        }

        /// <summary>
        /// Id of the other BBB we target for importing recordings into.                 The idea here is to remove already imported recordings.
        /// </summary>
        /// <value>Id of the other BBB we target for importing recordings into.                 The idea here is to remove already imported recordings.</value>
        [DataMember(Name = "destinationinstanceid", IsRequired = true, EmitDefaultValue = true)]
        public int Destinationinstanceid { get; set; }

        /// <summary>
        /// Group ID
        /// </summary>
        /// <value>Group ID</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// bigbluebuttonbn instance id
        /// </summary>
        /// <value>bigbluebuttonbn instance id</value>
        [DataMember(Name = "sourcebigbluebuttonbnid", EmitDefaultValue = false)]
        public int Sourcebigbluebuttonbnid { get; set; }

        /// <summary>
        /// source courseid to filter by
        /// </summary>
        /// <value>source courseid to filter by</value>
        [DataMember(Name = "sourcecourseid", EmitDefaultValue = false)]
        public int Sourcecourseid { get; set; }

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
            sb.Append("class ModBigbluebuttonbnGetRecordingsToImportRequest {\n");
            sb.Append("  Destinationinstanceid: ").Append(Destinationinstanceid).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Sourcebigbluebuttonbnid: ").Append(Sourcebigbluebuttonbnid).Append("\n");
            sb.Append("  Sourcecourseid: ").Append(Sourcecourseid).Append("\n");
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