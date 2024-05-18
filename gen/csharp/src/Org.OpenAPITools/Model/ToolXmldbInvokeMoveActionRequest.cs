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
    /// ToolXmldbInvokeMoveActionRequest
    /// </summary>
    [DataContract(Name = "tool_xmldb_invoke_move_action_request")]
    public partial class ToolXmldbInvokeMoveActionRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolXmldbInvokeMoveActionRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolXmldbInvokeMoveActionRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolXmldbInvokeMoveActionRequest" /> class.
        /// </summary>
        /// <param name="action">Action (required) (default to &quot;null&quot;).</param>
        /// <param name="dir">Plugin that is being edited (required) (default to &quot;null&quot;).</param>
        /// <param name="field">Field name (default to &quot;&quot;).</param>
        /// <param name="index">Index name (default to &quot;&quot;).</param>
        /// <param name="key">Key name (default to &quot;&quot;).</param>
        /// <param name="position">How many positions to move by (negative - up, positive - down) (required) (default to null).</param>
        /// <param name="table">Table name (required) (default to &quot;null&quot;).</param>
        public ToolXmldbInvokeMoveActionRequest(string action = @"null", string dir = @"null", string field = @"", string index = @"", string key = @"", int position = null, string table = @"null")
        {
            // to ensure "action" is required (not null)
            if (action == null)
            {
                throw new ArgumentNullException("action is a required property for ToolXmldbInvokeMoveActionRequest and cannot be null");
            }
            this.Action = action;
            // to ensure "dir" is required (not null)
            if (dir == null)
            {
                throw new ArgumentNullException("dir is a required property for ToolXmldbInvokeMoveActionRequest and cannot be null");
            }
            this.Dir = dir;
            this.Position = position;
            // to ensure "table" is required (not null)
            if (table == null)
            {
                throw new ArgumentNullException("table is a required property for ToolXmldbInvokeMoveActionRequest and cannot be null");
            }
            this.Table = table;
            // use default value if no "field" provided
            this.Field = field ?? @"";
            // use default value if no "index" provided
            this.Index = index ?? @"";
            // use default value if no "key" provided
            this.Key = key ?? @"";
        }

        /// <summary>
        /// Action
        /// </summary>
        /// <value>Action</value>
        [DataMember(Name = "action", IsRequired = true, EmitDefaultValue = true)]
        public string Action { get; set; }

        /// <summary>
        /// Plugin that is being edited
        /// </summary>
        /// <value>Plugin that is being edited</value>
        [DataMember(Name = "dir", IsRequired = true, EmitDefaultValue = true)]
        public string Dir { get; set; }

        /// <summary>
        /// Field name
        /// </summary>
        /// <value>Field name</value>
        [DataMember(Name = "field", EmitDefaultValue = false)]
        public string Field { get; set; }

        /// <summary>
        /// Index name
        /// </summary>
        /// <value>Index name</value>
        [DataMember(Name = "index", EmitDefaultValue = false)]
        public string Index { get; set; }

        /// <summary>
        /// Key name
        /// </summary>
        /// <value>Key name</value>
        [DataMember(Name = "key", EmitDefaultValue = false)]
        public string Key { get; set; }

        /// <summary>
        /// How many positions to move by (negative - up, positive - down)
        /// </summary>
        /// <value>How many positions to move by (negative - up, positive - down)</value>
        [DataMember(Name = "position", IsRequired = true, EmitDefaultValue = true)]
        public int Position { get; set; }

        /// <summary>
        /// Table name
        /// </summary>
        /// <value>Table name</value>
        [DataMember(Name = "table", IsRequired = true, EmitDefaultValue = true)]
        public string Table { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolXmldbInvokeMoveActionRequest {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Dir: ").Append(Dir).Append("\n");
            sb.Append("  Field: ").Append(Field).Append("\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
            sb.Append("  Table: ").Append(Table).Append("\n");
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